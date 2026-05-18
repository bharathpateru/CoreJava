package com.corejava.java8.streamsrealworld.bank;

import java.util.List;
import java.util.Optional;

class Account {
    private Optional<List<Transaction>> transactions;
    // getters


    public Account(Optional<List<Transaction>> transactions) {
        this.transactions = transactions;
    }

    public Optional<List<Transaction>> getTransactions() {
        return transactions;
    }
}
