package net.chiovari.javarecipes.jpa2cert.entities.id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by cristianchiovari on 04/01/14.
 * Sql
 * CREATE SEQUENCE SEQ_GEN_SEQUENCE INCREMENT BY 50 START WITH 50
 * beacause we did not specified a sequence.
 */
@Entity
public class AnotherEntityWithIDSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String someField;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }
}
