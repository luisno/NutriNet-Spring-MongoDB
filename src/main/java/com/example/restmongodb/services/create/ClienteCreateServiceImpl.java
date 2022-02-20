package com.example.restmongodb.services.create;

import com.example.restmongodb.documents.Cliente;
import com.example.restmongodb.repositories.ClienteRepository;
import com.example.restmongodb.services.sequence.SequenceGenerateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ClienteCreateServiceImpl {

    ClienteRepository clienteRepository;
    SequenceGenerateServiceImpl sequenceGenerateService;

    @Autowired
    public ClienteCreateServiceImpl(ClienteRepository clienteRepository, SequenceGenerateServiceImpl sequenceGenerateService) {
        this.clienteRepository = clienteRepository;
        this.sequenceGenerateService = sequenceGenerateService;
    }

    public Cliente createCliente(Cliente input){
        input.setClienteID(sequenceGenerateService.getSequenceNumber(Cliente.SEQUENCE_NAME));
        input.setFechaCreacion(new Date());
        return clienteRepository.save(input);
    }
}
