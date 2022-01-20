package br.net.gradual.demo.service;

import br.net.gradual.demo.model.Client;
import br.net.gradual.demo.respository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientService.class);

    public List<Client> listAll() {
        LOGGER.info(" List all clients ");
        return (List<Client>)repository.findAll();
    }

    public Client save(Client client) throws Exception {

        LOGGER.info(" Saving new client "+ client);
        if (client == null)
            throw new Exception("datos inexistentes");

        if(client.getId() != null && repository.findById(client.getId()).isPresent() )
            throw new Exception("cliente já existe");
        Client newClient = repository.save(client);
        return newClient;
    }
}
