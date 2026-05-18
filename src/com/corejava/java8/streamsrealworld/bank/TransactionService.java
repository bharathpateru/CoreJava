package com.corejava.java8.streamsrealworld.bank;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransactionService {
    public static void main(String[] args) {
        List<Customer> customersList = new TransactionsDao().getCustomers();
                /*
                You’re working on a Banking / FinTech backend service.

                Each Customer may or may not have a BankAccount
                Each BankAccount may or may not have Transactions
                Each Transaction has:

                type → CREDIT or DEBIT
                amount

                The Risk & Analytics team wants a report:
                Total CREDIT amount per customer

                But with strict rules:
                Only customers who actually have accounts
                Only accounts that actually have transactions
                Only CREDIT transactions
                Customers with no CREDIT transactions must NOT appear
                 */

        Map<String, Double> totalCreditPerCustomer = customersList.stream()
                .flatMap(customer -> customer.getAccount().stream()
                        .flatMap(account -> account.getTransactions().stream()
                                .flatMap(List::stream)
                                .filter(tx -> TransactionType.CREDIT.equals(tx.getType()))
                                .map(tx -> Map.entry(customer.getCustomerId(), tx))))
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingDouble(e -> e.getValue().getAmount())));

        System.out.println(totalCreditPerCustomer);
        System.out.println("-------------------------------------------");

        Map<String, Double> totalCreditPerCust =customersList.stream()
                .flatMap(customer -> customer.getAccount().stream()
                .flatMap(account -> account.getTransactions().stream()
                        .flatMap(List::stream).filter(transaction -> TransactionType.CREDIT.equals(transaction.getType()))
                        .map(tx->Map.entry(customer.getCustomerId(), tx))))
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingDouble(e -> e.getValue().getAmount()) ));
        System.out.println(totalCreditPerCust);
    }
}