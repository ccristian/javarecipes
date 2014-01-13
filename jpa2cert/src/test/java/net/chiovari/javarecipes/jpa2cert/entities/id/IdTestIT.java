package net.chiovari.javarecipes.jpa2cert.entities.id;

import net.chiovari.javarecipes.jpa2cert.utils.JPATestUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;

/**
 * Created by cristianchiovari on 04/01/14.
 */
public class IdTestIT {

    static EntityManager em;

    @BeforeClass
    public static void oneTimeSetUp() {
        em = JPATestUtils.createEntityManager();
    }

    @AfterClass
    public static void oneTimeTearDown() {
        em.close();
    }

    @Test
    public void testIdentity(){
        EntityWithIDIdentity entityWithIDIdentity = new EntityWithIDIdentity();
        em.getTransaction().begin();
        em.persist(entityWithIDIdentity);
        em.getTransaction().commit();
        Assert.assertNotNull(entityWithIDIdentity.getId());
    }

    @Test
    public void testSequence(){
        EntityWithIDSequence entityWithIDSequence = new EntityWithIDSequence();
        AnotherEntityWithIDSequence anotherEntityWithIDSequence = new AnotherEntityWithIDSequence();
        em.getTransaction().begin();
        em.persist(entityWithIDSequence);
        em.persist(anotherEntityWithIDSequence);
        em.getTransaction().commit();
        Assert.assertNotNull(entityWithIDSequence.getId());
        Assert.assertNotNull(anotherEntityWithIDSequence.getId());

    }

    @Test
    public void testTable(){
        EntityWithIdTableGen entityWithIdTableGen1 = new EntityWithIdTableGen();
        EntityWithIdTableGen entityWithIdTableGen2 = new EntityWithIdTableGen();
        AnotherEntityWithIdTableGen another = new AnotherEntityWithIdTableGen();
        em.getTransaction().begin();
        em.persist(entityWithIdTableGen1);
        em.persist(entityWithIdTableGen2);
        em.persist(another);
        em.getTransaction().commit();
        Assert.assertNotNull(entityWithIdTableGen1.getId());
        Assert.assertNotNull(entityWithIdTableGen2.getId());

    }

}
