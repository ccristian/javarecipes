package net.chiovari.javarecipes.jpa2cert.relationship.one2one;

import net.chiovari.javarecipes.jpa2cert.AbstractJPATestUtils;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.RollbackException;


/**
 * Created by cristianchiovari on 07/01/14.
 */
public class One2OneBiTestIT extends AbstractJPATestUtils {


    /*
    Rollback !!!!
    Why ?
    Because the human is persisted without persisting the heart as well
    By default if the heart is not pesisted
    "During synchronization a new object was found through a relationship that was not marked cascade PERSIST"
     */
    @Test(expected = RollbackException.class)
    public void testOne2OneDefaultSetup1(){
        Human1 human = new Human1();
        human.setSex("Male");
        Heart1 heart = new Heart1();
        heart.setWeight(20);
        heart.setHuman(human);
        human.setHeart(heart);
        em.getTransaction().begin();
        em.persist(human);
        em.getTransaction().commit();


    }


    @Test
    public void testOne2OneDefaultSetup2(){
        Human1 human = new Human1();
        human.setSex("Male");
        Heart1 heart = new Heart1();
        heart.setWeight(20);
        heart.setHuman(human);
        human.setHeart(heart);
        em.getTransaction().begin();
        em.persist(human);
        em.persist(heart);
//        [INSERT INTO HEART1 (HEARTID, WEIGHT) VALUES (?, ?)][3,20.0]}
//        [INSERT INTO HUMAN1 (HUMANID, SEX, HEART_HEARTID) VALUES (?, ?, ?)][2,Male,3]}
        em.getTransaction().commit();
        Assert.assertNotNull(human.getHumanId());
        Assert.assertNotNull(heart.getHeartId());

    }

    @Test
    public void testOne2OneCascadePersist(){
        Human2 human = new Human2();
        human.setSex("Male");
        Heart2 heart = new Heart2();
        heart.setWeight(20);
        heart.setHuman(human);
        human.setHeart(heart);
        em.getTransaction().begin();
        em.persist(human);
        em.getTransaction().commit();
        Assert.assertNotNull(human.getHumanId());
        Assert.assertNotNull(heart.getHeartId());

    }
}
