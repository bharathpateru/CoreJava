package com.corejava.java8.streamsrealworld.insurance;

import java.util.List;
import java.util.Optional;

class Policy {
    private String policyId;
    private Optional<List<Claim>> claims;

    public Policy(String policyId, Optional<List<Claim>> claims) {
        this.policyId = policyId;
        this.claims = claims;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public Optional<List<Claim>> getClaims() {
        return claims;
    }

    public void setClaims(Optional<List<Claim>> claims) {
        this.claims = claims;
    }
}
