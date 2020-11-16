package com.mirat.homework.customer;

import com.mirat.homework.View;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Rakhmanau", "Mirat", "Alikovich", "Minsk");
        Customer customer2 = new Customer(2, "Rakhmanova", "Anna", "Vladimorovna", "Baranovichi");
        Customer customer3 = new Customer(3, "Morozov", "Gleb", "Olegovich", "Minsk");
        Customer customer4 = new Customer(4, "Zenkevich", "Alex", "Alfredovich", "Grodno");
        Customer customer5 = new Customer(5, "Bardukova", "Yulia", "Alexandrovna", "Gomel");

        Bank bank = new Bank();
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);
        bank.addCustomer(customer4);
        bank.addCustomer(customer5);

        View.print(bank.findCustomersAlphabeticallyByLastName());
        System.out.println("**********************************");

        View.print(bank.findCustomersCardNumberInRange(3000, 5000));
    }
}
