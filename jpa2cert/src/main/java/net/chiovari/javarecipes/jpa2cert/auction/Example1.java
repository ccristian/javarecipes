/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.chiovari.javarecipes.jpa2cert.auction;

import java.lang.reflect.Proxy;

/**
 *
 * @author chiovcr
 */
public class Example1 implements Jpa2CertRunningSample {

    public void run(String persitenceUnit) {
        System.out.println("CUCU");
    }
    
    
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        Jpa2CertRunningSample proxied =(Jpa2CertRunningSample)Proxy
                           .newProxyInstance(Example1.class.getClassLoader(),
         example1.getClass().getInterfaces() ,new Jpa2CertSampleInvHandler(example1));
         proxied.run(null);

    }
    
    
}
