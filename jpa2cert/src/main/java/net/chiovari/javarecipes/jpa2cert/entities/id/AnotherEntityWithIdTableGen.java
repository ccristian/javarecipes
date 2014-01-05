package net.chiovari.javarecipes.jpa2cert.entities.id;

import javax.persistence.*;

/**
 * Created by cristianchiovari on 05/01/14.
 * SQL
 * CREATE TABLE OtherTableGen (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))][]}
 * {[DELETE FROM OtherTableGen WHERE SEQ_NAME = 'AnotherEntityIdTableGen'][]}
 * {[SELECT * FROM OtherTableGen WHERE SEQ_NAME = 'AnotherEntityIdTableGen'][]}
 * {[INSERT INTO OtherTableGen(SEQ_NAME, SEQ_COUNT) values ('AnotherEntityIdTableGen', 0)][]}
 */
@Entity
@TableGenerator(name = "AnotherEntityIdTableGen",table = "OtherTableGen")
public class AnotherEntityWithIdTableGen {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "AnotherEntityIdTableGen")
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
