package net.chiovari.javarecipes.jpa2cert.entities.temporal;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cristianchiovari on 04/01/14.
 * Sql generated for this table.
 * CREATE TABLE TEMPORALDATE (ID BIGINT NOT NULL, DATE DATE, PRIMARY KEY (ID))
 */
@Entity
public class TemporalDate {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
