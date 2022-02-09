package com.spring.cosmos.example.starter.cosmos;

import com.spring.cosmos.example.starter.model.Customer;
import com.spring.cosmos.example.starter.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CustomerLoader {
    private CustomerRepository customerRepository;

    @Autowired
    CustomerLoader(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
     @PostConstruct
     void load(){
        customerRepository.save(new Customer("1","Ravi","Tella", "ravi@email.com","33333"));
         customerRepository.save(new Customer("2","Arjen","Robben", "arjen@email.com","44444"));
     }
}
