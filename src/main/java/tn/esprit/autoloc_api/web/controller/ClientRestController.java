package tn.esprit.autoloc_api.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc_api.domain.Client;
import tn.esprit.autoloc_api.service.impl.ClientServiceImpl;

import java.util.List;

@Tag(name = "Clients", description = "Ressource client")

@RestController
@RequestMapping("clients")
@RequiredArgsConstructor
public class ClientRestController {
    private final ClientServiceImpl ClientServiceImpl;

    @Operation(summary = "ajoute Client")
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return ClientServiceImpl.createClient(client);
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return ClientServiceImpl.getClientById(id);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        return ClientServiceImpl.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        ClientServiceImpl.deleteClient(id);
    }

    @GetMapping
    public List<Client> getAllClient() {
        return ClientServiceImpl.getAllClient();
    }
}