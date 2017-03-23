package com.trial;

/**
 * Created by chaithra on 27/2/17.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new Customer("Payal", "Joshi"));
        repository.save(new Customer("Chaithra", "Chandra"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");

        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Payal'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Payal"));

        System.out.println("Customers found with findByLastName('Chandra" + "'):");
        System.out.println("--------------------------------");
        for (Customer customer : repository.findByLastName("Chandra")) {
            System.out.println(customer);
        }

    }

}
 */