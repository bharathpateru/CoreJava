package com.corejava.java8.streamsrealworld.transactions;

class Transaction {
    private TransactionType type;
    private TransactionStatus status;
    private double amount;

    public Transaction(TransactionType type, TransactionStatus status, double amount) {
        this.type = type;
        this.status = status;
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
