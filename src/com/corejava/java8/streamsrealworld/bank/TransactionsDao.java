package com.corejava.java8.streamsrealworld.bank;

import java.util.List;
import java.util.Optional;

public class TransactionsDao {

    public List<Customer> getCustomers(){

        Transaction t1 = new Transaction(TransactionType.CREDIT, 100.0);
        Transaction t2 = new Transaction(TransactionType.DEBIT, 50.0);
        Transaction t3 = new Transaction(TransactionType.CREDIT, 200.0);

        Transaction t4 = new Transaction(TransactionType.DEBIT, 300.0);

        Transaction t5 = new Transaction(TransactionType.CREDIT, 400.0);

        // Account with multiple CREDIT and DEBIT transactions
        Account account1 = new Account(
                Optional.of(List.of(t1, t2, t3))
        );

        Account account2 = new Account(
                Optional.of(List.of(t4))
        );

        Account account3 = new Account(
                Optional.of(List.of(t5))
        );

// Account with NO transactions
        Account account4 = new Account(
                Optional.empty()
        );

        Customer c1 = new Customer("C1", Optional.of(account1)); // ✅ Should appear (300)
        Customer c2 = new Customer("C2", Optional.of(account2)); // ❌ No CREDIT → excluded
        Customer c3 = new Customer("C3", Optional.empty());      // ❌ No account → excluded
        Customer c4 = new Customer("C4", Optional.of(account4)); // ❌ No transactions → excluded
        Customer c5 = new Customer("C5", Optional.of(account3)); // ✅ Should appear (400)


        List<Customer> customers = List.of(c1, c2, c3, c4, c5);


return customers;
    }
}
