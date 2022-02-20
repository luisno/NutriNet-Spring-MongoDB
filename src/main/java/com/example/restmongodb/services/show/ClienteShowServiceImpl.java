package com.example.restmongodb.services.show;

import com.example.restmongodb.documents.Cliente;
import com.example.restmongodb.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteShowServiceImpl {

    private ClienteRepository clienteRepository;

    @Autowired
    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente showCliente(Integer idCliente){
        return clienteRepository.findById(idCliente).get();
    }
}
