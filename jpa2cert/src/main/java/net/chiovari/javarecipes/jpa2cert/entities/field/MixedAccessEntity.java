package net.chiovari.javarecipes.jpa2cert.entities.field;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by cristianchiovari on 03/01/14.
 */
@Entity
@Access(AccessType.FIELD)
public class MixedAccessEntity {

    //field access
    @Id
    private Integer id;

    private String someValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Access(AccessType.PROPERTY)
    public String getSomeValue() {
        return someValue;
    }

    public void setSomeValue(String someValue) {
        this.someValue = someValue;
    }
}
