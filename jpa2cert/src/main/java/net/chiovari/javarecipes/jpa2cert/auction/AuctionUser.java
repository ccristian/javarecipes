package net.chiovari.javarecipes.jpa2cert.auction;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collection;
import java.util.List;

/**
 * Created by cristianchiovari on 30/12/13.
 */

@Entity
public class AuctionUser {

    @Id
    private Integer auctionUserID;

    private String displayName;
    private String email;

    private Collection<Bid> bids;
    private Collection<Auction> auctions;

    public Integer getAuctionUserID() {
        return auctionUserID;
    }

    public void setAuctionUserID(Integer auctionUserID) {
        this.auctionUserID = auctionUserID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    public Collection<Auction> getAuctions() {
        return auctions;
    }

    public void setAuctions(List<Auction> auctions) {
        this.auctions = auctions;
    }
}
