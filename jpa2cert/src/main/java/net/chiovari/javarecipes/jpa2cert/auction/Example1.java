/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.chiovari.javarecipes.jpa2cert.auction;

import javax.persistence.EntityManager;
import java.lang.reflect.Proxy;

/**
 *
 * @author chiovcr
 */
public class Example1 implements Jpa2CertRunningSample {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    @Override
    public void run() {

        System.out.println("RUN!!!"+em);

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }


    
    
    public static void main(String args[]){

        Jpa2CertRunningSample ex1 = (Jpa2CertRunningSample)Jpa2CertProxy.newInstance(new Example1());
        ex1.run();
    }
    
    
}
