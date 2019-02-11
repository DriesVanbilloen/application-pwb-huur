package com.vanbilloen.pbwhuuraanvraag.services;

import com.vanbilloen.pbwhuuraanvraag.databases.ClientDatabase;
import com.vanbilloen.pbwhuuraanvraag.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientService {

    @Autowired
    private ClientDatabase clientDatabase;

    public ClientService() {

    }

    public List<Client> getAllClient() {
        return clientDatabase.findAll();
    }

    public Client addClient(Client client) {
        return clientDatabase.save(client);

    }
}
