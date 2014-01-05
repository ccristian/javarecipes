package net.chiovari.javarecipes.jpa2cert.entities.id;

import javax.persistence.*;

/**
 * Created by cristianchiovari on 04/01/14.
 * Sql
 * CREATE SEQUENCE EntityWithIDSequence INCREMENT BY 50 START WITH 50]
 *
 */
@Entity
@SequenceGenerator(name = "name",sequenceName="EntityWithIDSequence")
public class EntityWithIDSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "name")
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
