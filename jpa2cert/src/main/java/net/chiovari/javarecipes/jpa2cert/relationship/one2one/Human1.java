package net.chiovari.javarecipes.jpa2cert.relationship.one2one;

import javax.persistence.*;

/**
 * Created by cristianchiovari on 07/01/14.
 */
@Entity
public class Human1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long humanId;

    private String sex;

    @OneToOne
    private Heart1 heart;

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

    public Heart1 getHeart() {
        return heart;
    }

    public void setHeart(Heart1 heart) {
        this.heart = heart;
    }
}
