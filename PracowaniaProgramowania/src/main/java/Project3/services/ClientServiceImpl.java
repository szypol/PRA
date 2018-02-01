package Project3.services;

import Project3.entities.Client;
import Project3.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Iterable<Client> showAllClientPaging(Integer pageNr, Integer howManyOnPage) {
        return clientRepository.findAll(new PageRequest(pageNr, howManyOnPage));
    }

    @Override
    public Client getClientById(Integer clientId) {
        return clientRepository.findOne(clientId);
    }

    @Override
    public Iterable<Client> showAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Integer clientId) {
        clientRepository.delete(clientId);
    }

    @Override
    public Boolean checkIfExist(Integer clientId) {
        if(clientRepository.checkIfExist(clientId) > 0)
            return true;
        else
            return false;
    }

}
