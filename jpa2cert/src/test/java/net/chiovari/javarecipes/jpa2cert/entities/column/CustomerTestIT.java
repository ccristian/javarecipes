package net.chiovari.javarecipes.jpa2cert.entities.column;

import net.chiovari.javarecipes.jpa2cert.AbstractJPATestUtils;
import net.chiovari.javarecipes.jpa2cert.entities.colum.Customer;
import org.junit.Test;

import javax.persistence.RollbackException;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by cristianchiovari on 02/01/14.
 */

public class CustomerTestIT extends AbstractJPATestUtils{


    //it will be rolled back because the customer vat is not filled and it is mandatory
    @Test(expected = RollbackException.class)
    public void testNotNullableField(){
        Customer customer = new Customer();
        em.getTransaction().begin();
        customer.setName("Customer");
        em.persist(customer);
        em.getTransaction().commit();
    }

    @Test
    public void  testInsertFalse(){
        Customer customer = new Customer();
        customer.setName("Customer");
        customer.setVatNumber("Vat Number");
        //INSERT INTO CUSTOMER (CUSTOMERID, NAME, REVENUE, UPDATABLEFALSEFIELD, VAT) VALUES (?, ?, ?, ?, ?)
        //normally this value on retrieve will be null
        customer.setInsertableFalseField("Insertable");
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        em.clear();
        em.getEntityManagerFactory().getCache().evictAll();
        Long customerId = customer.getCustomerId();
        customer = em.find(Customer.class,customerId);
        assertNull(customer.getInsertableFalseField());
    }


    @Test(expected = RollbackException.class)
    public void  testInsertMoreCharacters(){
        Customer customer = new Customer();
        customer.setName("Customer Test More then 10 characters");
        customer.setVatNumber("Vat Number");
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
    }


    @Test
    public void  testUpdatableFalse(){
        Customer customer = new Customer();
        customer.setName("Customer");
        customer.setVatNumber("Vat Number 1");
        customer.setUpdatableFalseField("Updatable false field");
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();

        em.clear();
        em.getEntityManagerFactory().getCache().evictAll();
        Long customerId = customer.getCustomerId();
        customer = em.find(Customer.class,customerId);

        //despite we change this field it will not be modified
        customer.setUpdatableFalseField("Modified");
        //SQL will look like this UPDATE CUSTOMER SET REVENUE = ? WHERE (CUSTOMERID = ?)
        customer.setRevenue(new BigDecimal(100));
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();

        em.clear();
        em.getEntityManagerFactory().getCache().evictAll();
        customerId = customer.getCustomerId();
        customer = em.find(Customer.class, customerId);
        assertEquals("Updatable false field",customer.getUpdatableFalseField());
        

    }


}
