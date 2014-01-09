/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.chiovari.javarecipes.jpa2cert.auction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author chiovcr
 */
public class Jpa2CertSampleInvHandler implements InvocationHandler {

    public Jpa2CertSampleInvHandler(Object target){    
        this.target= target;
    }
    
    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
        long a = System.currentTimeMillis();
        Object result = method.invoke(target, params);
        System.out.println("total time taken  "
                + (System.currentTimeMillis() - a));
        return result;

    }

}
