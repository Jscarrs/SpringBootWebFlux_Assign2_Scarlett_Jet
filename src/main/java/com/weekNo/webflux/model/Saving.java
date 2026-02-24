package com.weekNo.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Saving extends Account {

    private double interestRate;

    public void depositMonthlyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}