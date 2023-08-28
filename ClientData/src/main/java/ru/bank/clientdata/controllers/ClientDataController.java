package ru.bank.clientdata.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.clientdata.models.Client;

@RestController
public class ClientDataController {

    @PostMapping("/clientdata")
    @ResponseBody
    public String openAPI(@RequestBody Client newClient) {
        return "ok";
    }
}
