/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.chiovari.javarecipes.jpa2cert.auction;

import net.chiovari.javarecipes.jpa2cert.utils.JPATestUtils;
import org.apache.derby.drda.NetworkServerControl;
import sun.print.resources.serviceui;

import javax.persistence.EntityManager;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.InetAddress;

/**
 * @author chiovcr
 */
public class Jpa2CertProxy implements InvocationHandler {

    private Object target;

    public Jpa2CertProxy(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
        NetworkServerControl server = null;
        EntityManager em = null;
        try {
            server = new NetworkServerControl(InetAddress.getByName("localhost"),
                    1527,
                    "APP",
                    "APP");
            java.io.PrintWriter consoleWriter = new java.io.PrintWriter(System.out, true);
            server.start(consoleWriter);
            Jpa2CertRunningSample sample = (Jpa2CertRunningSample) target;
            em = JPATestUtils.createEntityManager();
            sample.setEm(em);
            Object result = method.invoke(target, params);
            return result;
        } finally {
            if (em!=null){
                em.close();
            }
            if (server != null) {
                server.shutdown();
            }
        }
    }

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new Jpa2CertProxy(obj));
    }



}
