package com.corejava.java8.streamsrealworld.insurance;

import java.util.List;
import java.util.Optional;

class PolicyHolder {
    private String holderId;
    private Optional<List<Policy>> policies;

    public PolicyHolder(String holderId, Optional<List<Policy>> policies) {
        this.holderId = holderId;
        this.policies = policies;
    }

    public String getHolderId() {
        return holderId;
    }

    public Optional<List<Policy>> getPolicies() {
        return policies;
    }
}
