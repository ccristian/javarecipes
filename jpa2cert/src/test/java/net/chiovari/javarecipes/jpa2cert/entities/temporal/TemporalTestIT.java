package net.chiovari.javarecipes.jpa2cert.entities.temporal;

import net.chiovari.javarecipes.jpa2cert.utils.JPATestUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import java.util.Date;

/**
 * Created by cristianchiovari on 04/01/14.
 */
public class TemporalTestIT {

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
    public void testDate(){

        TemporalDate temporalDate = new TemporalDate();
        em.getTransaction().begin();
        temporalDate.setDate(new Date());
        em.persist(temporalDate);
        em.getTransaction().commit();
        //[EL Fine]: sql: 2014-01-04 19:17:32.266--ClientSession(1239450605)--Connection(104417274)--INSERT INTO TEMPORALDATE (ID, DATE) VALUES (?, ?)
        //bind => [1, 2014-01-04]
    }


    @Test
    public void testTimestamp(){

        TemporalTimestamp temporalTimestamp = new TemporalTimestamp();
        em.getTransaction().begin();
        temporalTimestamp.setTimestamp(new Date());
        em.persist(temporalTimestamp);
        em.getTransaction().commit();
       //INSERT INTO TEMPORALTIMESTAMP (ID, TIMESTAMP) VALUES (?, ?)
       // bind => [2, 2014-01-04 19:26:49.175]

    }


    @Test
    public void testTime(){

        TemporalTime temporalTime = new TemporalTime();
        em.getTransaction().begin();
        temporalTime.setTime(new Date());
        em.persist(temporalTime);
        em.getTransaction().commit();
        //INSERT INTO TEMPORALTIME (ID, TIME) VALUES (?, ?)
        //bind => [2, 19:46:21]





    }

}
