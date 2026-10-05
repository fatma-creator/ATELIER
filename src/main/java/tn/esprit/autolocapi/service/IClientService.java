package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Client;

import java.util.List;

public interface IClientService {

    Client addClient(Client client);

    Client updateClient(Client client);

    Client getClientById(Long id);

    List<Client> getAllClients();

    void deleteClient(Long id);

}