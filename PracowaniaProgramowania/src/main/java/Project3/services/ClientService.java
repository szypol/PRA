package Project3.services;

import Project3.entities.Client;

public interface ClientService {

    Iterable<Client> showAllClient();

    Client getClientById(Integer clientId);

    Client saveClient (Client client);

    void deleteClient(Integer clientId);

    Boolean checkIfExist(Integer clientId);

    Iterable<Client> showAllClientPaging(Integer pageNr, Integer howManyOnPage);

}
