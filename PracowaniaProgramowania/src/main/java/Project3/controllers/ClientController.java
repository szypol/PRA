package Project3.controllers;

import Project3.entities.Client;
import Project3.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;
import java.util.UUID;

/**
 * Product controller.
 */
@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientService ClientService;


    /**
     * List all Client.
     */
    @RequestMapping(value = "/Clients", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Client> list(Model model) {
        return ClientService.listAllClients();
    }

    @RequestMapping(value = "/Clients/{page}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Client> list(@PathVariable("page") Integer pageNr, @RequestParam("size") Optional<Integer> howManyOnPage) {
        return ClientService.listAllClientsPaging(pageNr, howManyOnPage.orElse(2));
    }


    /**
     * View a specific console by its id.
     */
    @RequestMapping(value = "/Client/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Client getByPublicId(@PathVariable("id") Integer publicId) {
        return ClientService.getClientById(publicId);
    }

    /**
     * View a specific console by its id.
     */
    @RequestMapping(value = "/Client", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Client getByParamPublicId(@RequestParam("id") Integer publicId) {
        return ClientService.getClientById(publicId);
    }

    /**
     * Save console to database.
     */
    @RequestMapping(value = "/Client", method = RequestMethod.POST)
    public ResponseEntity<Client> create(@RequestBody @Valid @NotNull Client Client) {
        Client.setClientId(UUID.randomUUID().toString());
        ClientService.saveClient(Client);
        return ResponseEntity.ok().body(Client);
    }


    /**
     * Edit console in database.
     */
    @RequestMapping(value = "/Client", method = RequestMethod.PUT)
    public ResponseEntity<Void> edit(@RequestBody @Valid @NotNull Client Client) {
        if (!ClientService.checkIfExist(Client.getId()))
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        else {
            ClientService.saveClient(Client);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }

    /**
     * Delete console by its id.
     */
    @RequestMapping(value = "/Client/{id}", method = RequestMethod.DELETE)
    public RedirectView delete(@PathVariable Integer id) {
        ClientService.deleteClient(id);
        return new RedirectView("/api/Clients", true);
    }

}
