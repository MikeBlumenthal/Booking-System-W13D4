package com.codeclan.example.bookingsystem.Controllers;


import com.codeclan.example.bookingsystem.Repositories.CustomerRepository.CustomerRepository;
import com.codeclan.example.bookingsystem.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{id}")
    public List<Customer> getCustomerOnCourse(@PathVariable Long id){
        return  customerRepository.getCustomersOnCourse(id);
    }


    @GetMapping(value = "/town/{town}/course/{id}")
    public List<Customer> getCustomersInGivenTownForGivenCourse(@PathVariable String town,@PathVariable Long id){
        return customerRepository.getCustomersInGivenTownForGivenCourse(town , id);
    }


}
