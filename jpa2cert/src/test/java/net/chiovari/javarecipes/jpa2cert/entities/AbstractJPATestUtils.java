package net.chiovari.javarecipes.jpa2cert.entities;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;

/**
 * Created by cristianchiovari on 05/01/14.
 */
public abstract class AbstractJPATestUtils {

    public static EntityManager em;

    @BeforeClass
    public static void oneTimeSetUp() {
        em = JPATestUtils.createEntityManager();
    }

    @AfterClass
    public static void oneTimeTearDown() {
        em.close();
    }
}
