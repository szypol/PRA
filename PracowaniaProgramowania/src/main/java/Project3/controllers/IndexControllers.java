package Project3.controllers;

import Project3.entities.Client;
import Project3.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Controller
@RestController
@RequestMapping("/")
public class IndexControllers {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String generateThemModel() {

        LocalDateTime date = LocalDateTime.now();
        ZoneId zid = ZoneId.systemDefault();
        ZonedDateTime actualDate = ZonedDateTime.of(date,zid);

        Client c1 = new Client(1, "1", "Stefan", "Nowak", "HuHuHu S.A.", "0987654321", "Poznan");
        Client c2 = new Client(2, "2", "Janusz", "Biznesu", "ErroortelliZ S.A.", "7659821430", "Poznan");
        Client c3 = new Client(3, "3", "Sebastian", "Brzęczyszczykiewicz", "SpringJavaPrograming Sp. Z O.O.", "7531984620", "Wroclaw");

        return "It works! (Maybe...)";

    }

}
