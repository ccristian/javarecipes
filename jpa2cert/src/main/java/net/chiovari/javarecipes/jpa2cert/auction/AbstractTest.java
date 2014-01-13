package net.chiovari.javarecipes.jpa2cert.auction;

import javax.persistence.EntityManager;

/**
 * Created by cristianchiovari on 09/01/14.
 */
public abstract class AbstractTest {

    protected EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}
