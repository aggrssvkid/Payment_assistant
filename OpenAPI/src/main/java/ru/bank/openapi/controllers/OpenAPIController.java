package ru.bank.openapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.openapi.models.Client;
import ru.bank.openapi.models.Data;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OpenAPIController {

    @PostMapping("/openapi")
    @ResponseBody
    public List<Data> openAPI(@RequestBody Client newClient) {
        //search info using data of clients
        List<Data> data = new ArrayList<>();
        data.add(new Data(12345678L, 500));
        data.add(new Data(11111111L, 10_000));
        return data;
    }
}
