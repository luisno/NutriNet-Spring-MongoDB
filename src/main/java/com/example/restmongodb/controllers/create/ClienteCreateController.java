package com.example.restmongodb.controllers.create;

import com.example.restmongodb.documents.Cliente;
import com.example.restmongodb.services.create.ClienteCreateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/cliente")
public class ClienteCreateController {

    ClienteCreateServiceImpl clienteCreateService;

    @Autowired
    public void setClienteCreateService(ClienteCreateServiceImpl clienteCreateService) {
        this.clienteCreateService = clienteCreateService;
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente input, HttpServletRequest request){
        return new ResponseEntity<>(clienteCreateService.createCliente(input), HttpStatus.CREATED);
    }
}
