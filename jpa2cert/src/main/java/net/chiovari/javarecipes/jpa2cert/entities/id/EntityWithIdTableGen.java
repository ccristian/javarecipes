package net.chiovari.javarecipes.jpa2cert.entities.id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by cristianchiovari on 05/01/14.
 */
@Entity
public class EntityWithIdTableGen {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
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
