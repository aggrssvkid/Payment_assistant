package ru.bank.openapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.openapi.models.Client;

import java.util.UUID;

@RestController
public class OpenAPIController {

    @PostMapping("/openapi")
    @ResponseBody
    public UUID openAPI(@RequestBody Client newClient) {
        //search info using data of clients
        return UUID.randomUUID();
    }
}
