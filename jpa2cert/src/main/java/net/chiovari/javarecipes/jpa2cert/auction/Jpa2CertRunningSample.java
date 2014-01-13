/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.chiovari.javarecipes.jpa2cert.auction;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

/**
 *
 * @author chiovcr
 */
public interface Jpa2CertRunningSample {

    public void run();

    public void setEm(EntityManager em);
    
}
