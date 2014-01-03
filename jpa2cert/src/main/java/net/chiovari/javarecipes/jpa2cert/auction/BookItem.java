package net.chiovari.javarecipes.jpa2cert.auction;

import javax.persistence.Entity;

/**
 * Created by cristianchiovari on 01/01/14.
 */
@Entity
public class BookItem extends Item {

    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
