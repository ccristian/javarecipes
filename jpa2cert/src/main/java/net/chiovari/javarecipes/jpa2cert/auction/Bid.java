package net.chiovari.javarecipes.jpa2cert.auction;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by cristianchiovari on 30/12/13.
 */
@Entity
public class Bid {

    @Id
    private Integer bidId;

    private double amount;
    private Date bidTime;
    private AuctionUser bidder;
    private String approval;
    private Auction auction;


    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public AuctionUser getBidder() {
        return bidder;
    }

    public void setBidder(AuctionUser bidder) {
        this.bidder = bidder;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }
}
