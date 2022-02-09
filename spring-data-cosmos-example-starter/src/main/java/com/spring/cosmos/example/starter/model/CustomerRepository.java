package com.spring.cosmos.example.starter.model;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CosmosRepository<Customer,String> {

}
