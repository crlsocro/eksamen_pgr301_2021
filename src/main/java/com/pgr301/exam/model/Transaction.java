package com.pgr301.exam.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Transaction {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
