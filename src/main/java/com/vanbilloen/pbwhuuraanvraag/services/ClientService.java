package com.vanbilloen.pbwhuuraanvraag.services;

import com.vanbilloen.pbwhuuraanvraag.databases.ClientDatabase;
import com.vanbilloen.pbwhuuraanvraag.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientDatabase clientDatabase;

    public ClientService(ClientDatabase clientDatabase) {
        this.clientDatabase = clientDatabase;
    }

    public List<Client> getAllClient() {
        return clientDatabase.findAll();
    }

    public Client addClient(Client client) {
        return clientDatabase.save(client);

    }
}
