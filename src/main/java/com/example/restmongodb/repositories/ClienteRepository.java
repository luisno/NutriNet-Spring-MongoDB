package com.example.restmongodb.repositories;

import com.example.restmongodb.documents.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Integer> {
}
