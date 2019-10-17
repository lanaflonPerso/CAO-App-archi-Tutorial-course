package fr.space.adopteVaisseau.ws;

import fr.space.adopteVaisseau.dto.ClientDto;
import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.manager.ClientManager.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class WsClient {

    private Logger logger = LoggerFactory.getLogger(WsClient.class);

    @Autowired
    private ClientService clientService;

    @GetMapping("client")
    public List<Client> getClients() {
        return clientService.findAll();
    }

    @PostMapping("add-client")
    public void addClient(@Valid @RequestBody ClientDto client){

        logger.info("Client reçu {}",client.toString());

        clientService.create(new Client(client.getFirstName(),
                client.getLastName(),client.getMail(),client.getAdress(),client.getTel(),client.isPermissionPilot()));
    }

    @DeleteMapping("deleteClient")
    public void deleteClient(@Valid @RequestBody Client client){clientService.delete(client);}

    @PutMapping("update-client")
    public void updateClient(@Valid @RequestBody Client client){
        clientService.create(client);}

}