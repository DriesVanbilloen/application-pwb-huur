package com.vanbilloen.pbwhuuraanvraag.controllers;

import com.vanbilloen.pbwhuuraanvraag.model.Client;
import com.vanbilloen.pbwhuuraanvraag.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientDataController {

    private final ClientService clientService;

    public ClientDataController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public ResponseEntity<?> postUserInformation(@RequestBody @NotNull Client client) {
        return getResponseEntity(clientService.addClient(client), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Client> getAllClients() {
        return clientService.getAllClient();
    }
    private ResponseEntity<Client> getResponseEntity(Client client, HttpStatus status) {
        return new ResponseEntity<>(client, status);
    }
}
