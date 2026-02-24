package com.weekNo.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Checking extends Account {

    private double insufficientFundFee;

    public void processingCheck(double amount) {
        if (getBalance() < amount) {
            withdraw(insufficientFundFee);
        } else {
            withdraw(amount);
        }
    }
}