package com.corejava.java8.streamsrealworld.insurance;

class Claim {
    private ClaimStatus status;
    private double amount;

    public Claim(ClaimStatus status, double amount) {
        this.status = status;
        this.amount = amount;
    }

    public ClaimStatus getStatus() {
        return status;
    }

    public void setStatus(ClaimStatus status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
