package net.chiovari.javarecipes.jpa2cert.relationship.one2one;

import javax.persistence.*;

/**
 * Created by cristianchiovari on 07/01/14.
 */
@Entity
public class Human2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long humanId;

    private String sex;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Heart2 heart;

    public Long getHumanId() {
        return humanId;
    }

    public void setHumanId(Long humanId) {
        this.humanId = humanId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Heart2 getHeart() {
        return heart;
    }

    public void setHeart(Heart2 heart) {
        this.heart = heart;
    }
}
