package net.chiovari.javarecipes.jpa2cert.auction;

import javax.persistence.EntityManager;

/**
 * Created by cristianchiovari on 10/01/14.
 */
public class AbstractJpaSample {

    protected EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}
