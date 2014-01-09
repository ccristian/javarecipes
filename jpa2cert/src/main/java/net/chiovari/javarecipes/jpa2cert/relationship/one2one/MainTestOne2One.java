/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.chiovari.javarecipes.jpa2cert.relationship.one2one;

import javax.persistence.EntityManager;

/**
 *
 * @author chiovcr
 */
public class MainTestOne2One {

    public static void main(String args[]) throws Exception{    
        
        EntityManager em= JPATestUtils.createEntityManager();        
        Human1 human = new Human1();
        human.setSex("Male");
        Heart1 heart = new Heart1();
        heart.setWeight(20);
        heart.setHuman(human);
        human.setHeart(heart);
        em.getTransaction().begin();
        em.persist(human);
        em.getTransaction().commit();        
        em.close();
    }
    
    
    
}
