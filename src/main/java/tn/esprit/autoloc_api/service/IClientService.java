package tn.esprit.autoloc_api.service;



import tn.esprit.autoloc_api.domain.Client;

import java.util.List;

public interface IClientService {

    Client createClient(Client client);

    Client getClientById(Long id);

    Client updateClient(Client client);

    void deleteClient(Long id);

    List<Client> getAllClient();
}