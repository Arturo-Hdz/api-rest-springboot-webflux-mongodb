package com.api.rest.springboot.webflux.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.api.rest.springboot.webflux.documents.Cliente;

public interface ClienteDAO extends ReactiveMongoRepository<Cliente, String>{

}
