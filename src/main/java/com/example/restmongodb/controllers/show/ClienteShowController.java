package com.example.restmongodb.controllers.show;

import com.example.restmongodb.documents.Cliente;
import com.example.restmongodb.services.show.ClienteShowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteShowController {

    private ClienteShowServiceImpl clienteShowService;

    @Autowired
    public void setClienteShowService(ClienteShowServiceImpl clienteShowService) {
        this.clienteShowService = clienteShowService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Cliente> showCliente(@PathVariable Integer id){
        return new ResponseEntity<>(clienteShowService.showCliente(id), HttpStatus.OK);

    }
}
