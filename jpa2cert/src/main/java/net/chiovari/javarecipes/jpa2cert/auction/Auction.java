package net.chiovari.javarecipes.jpa2cert.auction;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;


/**
 * Created by cristianchiovari on 30/12/13.
 */
@Entity
public class Auction {

    @Id
    private Integer auctionID;
    private double startAmount;
    private double increment;
    private String status;
    private Date openTime;
    private Date closeTime;

    private Item item;
    private AuctionUser seller;
    private List<Bid> bids;


    public Integer getAuctionID() {
        return auctionID;
    }

    public void setAuctionID(Integer auctionID) {
        this.auctionID = auctionID;
    }

    public double getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public AuctionUser getSeller() {
        return seller;
    }

    public void setSeller(AuctionUser seller) {
        this.seller = seller;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }
}
