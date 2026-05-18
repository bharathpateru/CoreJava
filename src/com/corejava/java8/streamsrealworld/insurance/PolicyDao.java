package com.corejava.java8.streamsrealworld.insurance;

import java.util.List;
import java.util.Optional;

public class PolicyDao {
    public List<PolicyHolder> getPolicyData(){

// Claims
        Claim cl1 = new Claim(ClaimStatus.APPROVED, 50_000);
        Claim cl2 = new Claim(ClaimStatus.REJECTED, 20_000);
        Claim cl3 = new Claim(ClaimStatus.APPROVED, 30_000);
        Claim cl4 = new Claim(ClaimStatus.PENDING, 10_000);

// Policies
        Policy p1 = new Policy("P1", Optional.of(List.of(cl1, cl2)));
        Policy p2 = new Policy("P2", Optional.of(List.of(cl3)));
        Policy p3 = new Policy("P3", Optional.empty());

// Policy Holders
        PolicyHolder ph1 = new PolicyHolder("H1", Optional.of(List.of(p1, p2))); // ✅ 80k
        PolicyHolder ph2 = new PolicyHolder("H2", Optional.of(List.of(p3)));     // ❌ no claims
        PolicyHolder ph3 = new PolicyHolder("H3", Optional.empty());             // ❌ no policies

        List<PolicyHolder> policyHolders = List.of(ph1, ph2, ph3);

        return  policyHolders;
    }
}
