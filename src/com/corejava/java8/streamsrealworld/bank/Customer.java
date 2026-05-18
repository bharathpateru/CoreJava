package com.corejava.java8.streamsrealworld.bank;

import java.util.Optional;

class Customer {
    private String customerId;
    private Optional<Account> account;
    // getters


    public Customer(String customerId, Optional<Account> account) {
        this.customerId = customerId;
        this.account = account;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Optional<Account> getAccount() {
        return account;
    }
}
