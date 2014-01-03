package net.chiovari.javarecipes.jpa2cert.entities.colum;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by cristianchiovari on 01/01/14.
 * <p/>
 * SQL generated :CREATE TABLE CUSTOMER
 * (CUSTOMERID BIGINT NOT NULL,
 *  INSERTABLEFALSEFIELD VARCHAR(255),
 *  NAME VARCHAR(10),
 *  REVENUE DECIMAL(10,3),
 *  UPDATABLEFALSEFIELD VARCHAR(255),
 *  VAT VARCHAR(255) NOT NULL UNIQUE,
 *  PRIMARY KEY (CUSTOMERID))
 */


@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long customerId;

    @Column(length = 10)
    private String name;

    @Column(name = "VAT", nullable = false, unique = true)
    private String vatNumber;

    @Column(insertable = false)
    private String insertableFalseField;

    @Column(updatable = false)
    private String updatableFalseField;

    @Column(precision = 10, scale = 3)
    private BigDecimal revenue;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getInsertableFalseField() {
        return insertableFalseField;
    }

    public void setInsertableFalseField(String insertableFalseField) {
        this.insertableFalseField = insertableFalseField;
    }

    public String getUpdatableFalseField() {
        return updatableFalseField;
    }

    public void setUpdatableFalseField(String updatableFalseField) {
        this.updatableFalseField = updatableFalseField;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }
}
