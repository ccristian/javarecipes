package net.chiovari.javarecipes.jpa2cert.entities.temporal;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.TIME;


/**
 * Created by cristianchiovari on 04/01/14.
 * Sql generated for this table.
 * CREATE TABLE TEMPORALTIME (ID BIGINT NOT NULL, TIME TIME, PRIMARY KEY (ID))
 */

@Entity
public class TemporalTime {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Temporal(TIME)
    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
