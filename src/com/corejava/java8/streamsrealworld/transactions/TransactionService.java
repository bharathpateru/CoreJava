package com.corejava.java8.streamsrealworld.transactions;

import java.util.List;
import java.util.Optional;

public class TransactionService {
    public static void main(String[] args) {
        /*

        Business Scenario
        You work on a Banking Risk Engine.

        Each Account belongs to a customer
        Each account may have transactions
        Only FAILED DEBIT transactions above ₹10,000 matter

        Requirement
        Count of failed high‑value debit transactions per customer

         */

        Transaction tr1 = new Transaction(TransactionType.DEBIT, TransactionStatus.FAILED, 15_000);
        Transaction tr2 = new Transaction(TransactionType.DEBIT, TransactionStatus.SUCCESS, 20_000);
        Transaction tr3 = new Transaction(TransactionType.CREDIT, TransactionStatus.FAILED, 50_000);
        Transaction tr4 = new Transaction(TransactionType.DEBIT, TransactionStatus.FAILED, 8_000);

        Account a1 = new Account("C1", Optional.of(List.of(tr1, tr2)));
        Account a2 = new Account("C2", Optional.of(List.of(tr3)));
        Account a3 = new Account("C3", Optional.of(List.of(tr4)));
        Account a4 = new Account("C4", Optional.empty());

        List<Account> accounts = List.of(a1, a2, a3, a4);



    }
}
