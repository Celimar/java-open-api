package br.net.gradual.demo.controller;


import br.net.gradual.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.net.gradual.demo.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/list")
    public ResponseEntity<List<Client>> listAll(){
        return ResponseEntity.ok(service.listAll());
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<Client> save(@RequestBody Client client) throws Exception {
        return ResponseEntity.ok(service.save(client));
    }

}
