package com.corejava.java8.streamsrealworld.transactions;

import java.util.List;
import java.util.Optional;

class Account {
    private String customerId;
    private Optional<List<Transaction>> transactions;

    public Account(String customerId, Optional<List<Transaction>> transactions) {
        this.customerId = customerId;
        this.transactions = transactions;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Optional<List<Transaction>> getTransactions() {
        return transactions;
    }

    public void setTransactions(Optional<List<Transaction>> transactions) {
        this.transactions = transactions;
    }
}
