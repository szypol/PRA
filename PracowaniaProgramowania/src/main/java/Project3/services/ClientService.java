package Project3.services;

import Project3.entities.Client;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {

    Iterable<Client> listAllClients();

    Client getClientById(Integer id);

    Client saveClient(Client client);

    void deleteClient(Integer id);


    public Iterable<Client> listAllClientsPaging(Integer pageNr, Integer howManyOnPage);

    Boolean checkIfExist(Integer id);
}
