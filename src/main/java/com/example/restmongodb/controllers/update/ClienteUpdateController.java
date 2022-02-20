package com.example.restmongodb.controllers.update;

import com.example.restmongodb.documents.Cliente;
import com.example.restmongodb.services.update.ClienteUpdateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteUpdateController {

    private ClienteUpdateServiceImpl clienteUpdateService;

    @Autowired
    public void setClienteUpdateService(ClienteUpdateServiceImpl clienteUpdateService) {
        this.clienteUpdateService = clienteUpdateService;
    }

    @PutMapping("{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Integer id, @RequestBody Cliente input){
        return new ResponseEntity<>(clienteUpdateService.updateCliente(id, input), HttpStatus.OK);
    }
}
