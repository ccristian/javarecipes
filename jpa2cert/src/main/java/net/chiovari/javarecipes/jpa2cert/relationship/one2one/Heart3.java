package net.chiovari.javarecipes.jpa2cert.relationship.one2one;

import javax.persistence.*;

/**
 * Created by cristianchiovari on 07/01/14.
 */
@Entity
public class Heart3 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long heartId;

    private double weight;

    @OneToOne(mappedBy = "heart")
    private Human3 human;
    
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

    public Human3 getHuman() {
        return human;
    }

    public void setHuman(Human3 human) {
        this.human = human;
    }
}
