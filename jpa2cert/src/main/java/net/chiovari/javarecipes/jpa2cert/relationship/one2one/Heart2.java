package net.chiovari.javarecipes.jpa2cert.relationship.one2one;

import javax.persistence.*;

/**
 * Created by cristianchiovari on 07/01/14.
 * [CREATE TABLE HEART (HEARTID BIGINT NOT NULL, WEIGHT FLOAT, PRIMARY KEY (HEARTID))][]}
 * [CREATE TABLE HUMAN (HUMANID BIGINT NOT NULL, SEX VARCHAR(255), HEART_HEARTID BIGINT, PRIMARY KEY (HUMANID))][]}
 * [ALTER TABLE HUMAN ADD CONSTRAINT HUMANHEART_HEARTID FOREIGN KEY (HEART_HEARTID) REFERENCES HEART (HEARTID)][]}
 *
 */
@Entity
public class Heart2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long heartId;

    private double weight;

    @OneToOne(mappedBy = "heart")
    private Human2 human;
    
    public Long getHeartId() {
        return heartId;
    }

    public void setHeartId(Long heartId) {
        this.heartId = heartId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Human2 getHuman() {
        return human;
    }

    public void setHuman(Human2 human) {
        this.human = human;
    }
}
