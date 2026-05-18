package com.corejava.java8.streamsrealworld.insurance;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PolicyService {
    public static void main(String[] args) {
        List<PolicyHolder> policyHolderList = new PolicyDao().getPolicyData();
        /*
        Business Scenario
        You are working on an Insurance backend system.

        Each PolicyHolder may or may not have policies
        Each Policy may or may not have claims
        Only APPROVED claims should be considered

        Requirement
        👉 Total approved claim amount per policy holder
         */
        Map<String, Double> claimAmountPolicyHolderWise = policyHolderList.stream()
                .flatMap(policyHolder -> policyHolder.getPolicies().stream()
                        .flatMap(policies -> policies.stream()
                                .flatMap(policy -> policy.getClaims().stream())
                                .flatMap(List::stream)
                                .filter((claim) -> ClaimStatus.APPROVED.equals(claim.getStatus()))
                                .map(cl -> Map.entry(policyHolder.getHolderId(), cl))))
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingDouble(e -> e.getValue().getAmount())));

        System.out.println(claimAmountPolicyHolderWise);



    }
}
