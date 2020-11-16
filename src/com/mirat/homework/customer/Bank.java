package com.mirat.homework.customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {

    private List<Customer> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        accounts.add(customer);
    }

    public List<Customer> getAccounts() {
        return accounts;
    }

    public List<Customer> findCustomersAlphabeticallyByLastName() {
        List<Customer> result = new ArrayList<>();
        //customers.sort(new NameSorter());
        accounts.sort(Comparator.comparing(Customer::getLastName));
        result.addAll(accounts);
        return result;
    }

    public List<Customer> findCustomersCardNumberInRange(int fromNumber, int toNumber) {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : accounts) {
            if(customer.getCardNumber() >= fromNumber && customer.getCardNumber() <= toNumber) {
                result.add(customer);
            }
        }
        return result;
    }
}
