package com.kob.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAO {

    @Autowired
    private CustomerRepository repo;
   

    public Customer getCustomerById(int id) {
        System.out.printf("CustomerDAO.getCustomerById(%s)\n", id);
        return repo.findById(id).orElseGet(null);
    }

    public Iterable<Customer> getAllCustomers() {
        System.out.println("CustomerDAO.getAllCustomers()");
        return repo.findAll();
    }

    public void saveCustomer(Customer customer) {
        System.out.printf("CustomerDAO.saveCustomer(%s)\n", customer);
        repo.save(customer);
    }

    public void deleteCustomer(Customer customer) {
        System.out.printf("BookDAO.deleteCustomer(%s)\n", customer);
        repo.delete(customer);
    }
}
