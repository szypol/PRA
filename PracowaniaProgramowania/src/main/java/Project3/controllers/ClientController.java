package Project3.controllers;

import Project3.entities.Client;
import Project3.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;
import java.util.UUID;

@Controller
@RestController
@RequestMapping("/app")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/clients", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Client> list(Model model) {
        return clientService.showAllClient();
    }

    @RequestMapping(value = "/clients/{page}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Client> list(@PathVariable("page") Integer pageNr, @RequestParam("size") Optional<Integer> howManyOnPage) {
        return clientService.showAllClientPaging(pageNr,howManyOnPage.orElse(2));
    }

    @RequestMapping(value = "/client/{clientId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Client getByPublicId(@PathVariable("clientId") Integer publicId) {
        return clientService.getClientById(publicId);
    }

    @RequestMapping(value = "/client", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Client getByParmPublicId(@RequestParam("clientId") Integer publicId) {
        return clientService.getClientById(publicId);
    }

    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public ResponseEntity<Client> create(@RequestBody @Valid @NotNull Client client) {
        client.setClientNumber(UUID.randomUUID().toString());
        return ResponseEntity.ok().body(client);
    }

    @RequestMapping(value = "/client", method = RequestMethod.PUT)
    public ResponseEntity<Client> edit(@RequestBody @Valid @NotNull Client client) {
        if(!clientService.checkIfExist(client.getClientId()))
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        else {
            clientService.saveClient(client);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }

    @RequestMapping(value = "/client/{clientId}", method = RequestMethod.DELETE)
    public ResponseEntity<Client> delete(@PathVariable Integer clientId) {
        clientService.deleteClient(clientId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
