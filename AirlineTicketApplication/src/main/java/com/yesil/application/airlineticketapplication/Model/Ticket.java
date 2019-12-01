package com.yesil.application.airlineticketapplication.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double price = 100;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPriceCount() {
        return priceCount;
    }

    public void setPriceCount(int priceCount) {
        this.priceCount = priceCount;
    }

    private int priceCount = 10;
    private String pnr;

}
