package Project3.controllers;

import Project3.services.ClientService;
import Project3.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.UUID;

/**
 * Homepage controller.
 */
@EnableAutoConfiguration

@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String generateModel() {

        LocalDateTime localtDateAndTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime dateAndTime  = ZonedDateTime.of(localtDateAndTime, zoneId);

        Client c1 = new Client("Stefan", "Nowak", "HuHuHu S.A.", "0987654321", "Poznań");
        clientService.saveClient(c1);

        return "Dodano klienta!";
    }

}
