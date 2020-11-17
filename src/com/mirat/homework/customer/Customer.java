package com.mirat.homework.customer;

import java.util.Objects;

public class Customer {

    private final int id;
    private final int cardNumber;
    private final int accountNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;


    public Customer(int id, String lastName, String firstName, String middleName, String address) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.cardNumber = setCardNumber();
        this.accountNumber = setAccountNumber();
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int setCardNumber() {
        return (int) (Math.random() * (5000 - 1000 + 1)) + 1000;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    private int setAccountNumber() {
        return (int) (Math.random() * (1_000_000 - 100_000 + 1)) + 100_000;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                cardNumber == customer.cardNumber &&
                accountNumber == customer.accountNumber &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(middleName, customer.middleName) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardNumber, accountNumber, lastName, firstName, middleName, address);
    }

    @Override
    public String toString() {
        return String.format("%-3s%-2s%-10s%-11s%-11s%-6s%-12s%-13s%-8s%-12s%-12s%-5s%-15s%-7s", "Id: ", id, "| Last Name: ", lastName, "| First Name: ", firstName, "| Middle Name: ", middleName, "| Address: ", address, "| Card Number: ", cardNumber, "| Account Number: ", accountNumber);
    }
}
