package com.mirat.homework.customer;

import java.util.Comparator;

public class NameSorter implements Comparator<Customer> {

    @Override
    public int compare(Customer customer1, Customer customer2) {
        return customer1.getFirstName().compareTo(customer2.getFirstName());
    }
}
