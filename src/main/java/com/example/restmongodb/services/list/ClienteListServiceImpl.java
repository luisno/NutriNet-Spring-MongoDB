package com.example.restmongodb.services.list;

import com.example.restmongodb.documents.Cliente;
import com.example.restmongodb.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteListServiceImpl {

    private ClienteRepository clienteRepository;

    @Autowired
    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> clienteList(){
        return clienteRepository.findAll();
    }
}
