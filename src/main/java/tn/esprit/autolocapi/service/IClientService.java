package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Client;

import java.util.List;

public interface IClientService {

    Client addClient(Client client);

    List<Client> addClients(List<Client> clients);

    Client updateClient(Client client);

    Client retrieveClient(long id);

    List<Client> retrieveAllClients();

    void removeClient(long id);
}
