package net.chiovari.javarecipes.jpa2cert.entities.temporal;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

/**
 * Created by cristianchiovari on 04/01/14.
 * SQl
 * CREATE TABLE TEMPORALTIMESTAMP (ID BIGINT NOT NULL, TIMESTAMP TIMESTAMP, PRIMARY KEY (ID))
 */
@Entity
public class TemporalTimestamp {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Temporal(TIMESTAMP)
    private Date timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
