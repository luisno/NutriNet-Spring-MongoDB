package com.example.restmongodb.services.update;

import com.example.restmongodb.documents.Cliente;
import com.example.restmongodb.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ClienteUpdateServiceImpl {

    private ClienteRepository clienteRepository;

    @Autowired
    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente updateCliente(Integer idCliente,Cliente input){
        Cliente cliente = clienteRepository.findById(idCliente).get();
        cliente.setEdad(input.getEdad());
        cliente.setEstatura(input.getEstatura());
        cliente.setPeso(input.getPeso());
        cliente.setGEB(input.getGEB());
        cliente.setFechaActualizacion(new Date());
        return clienteRepository.save(cliente);
    }
}
