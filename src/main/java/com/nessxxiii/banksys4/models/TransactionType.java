package com.nessxxiii.banksys4.models;

public enum TransactionType {
    WITHDRAW("Withdraw"),
    DEPOSIT("Deposit"),
    INQUIRY("Inquiry");

    private final String name;

    TransactionType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
