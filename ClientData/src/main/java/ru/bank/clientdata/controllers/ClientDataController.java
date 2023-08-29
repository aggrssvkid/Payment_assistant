package ru.bank.clientdata.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.clientdata.models.Client;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientDataController {

    @PostMapping("/clientdata")
    @ResponseBody
    public List<Client> openAPI(@RequestBody Client newClient) {
        List<Client> clients = new ArrayList<>();
        clients.add(newClient);
        return clients;
    }
}
