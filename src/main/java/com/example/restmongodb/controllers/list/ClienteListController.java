package com.example.restmongodb.controllers.list;

import com.example.restmongodb.documents.Cliente;
import com.example.restmongodb.services.list.ClienteListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteListController {

    ClienteListServiceImpl clienteListService;

    @Autowired
    public void setClienteListService(ClienteListServiceImpl clienteListService) {
        this.clienteListService = clienteListService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Cliente>> clienteList(){
        return new ResponseEntity<>(clienteListService.clienteList(), HttpStatus.OK);
    }
}
