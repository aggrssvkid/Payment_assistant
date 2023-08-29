package ru.bank.paymentassistant.controller;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import ru.bank.paymentassistant.models.Client;

import java.util.Collections;
import java.util.List;

@Controller
public class PaymentAssistantController {

    @PostMapping("/api/client/new")
    @ResponseBody
    public ResponseEntity<String> addJsonCode(@RequestBody Client newClient) {
        return saveDataOnOtherServer(searchOpenAPI(newClient));
    }

//    @GetMapping("/api/client/new")
    public Client searchOpenAPI(Client client) {
        // request url
        String url = "http://localhost:8090/openapi";

// create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

// create headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

// create a post object
//        Client client = new Client(1L, "Alex", "Wolf", "88005353535");

// build the request
        HttpEntity<Client> request = new HttpEntity<>(client, headers);

// send POST request
        ResponseEntity<List> response = restTemplate.postForEntity(url, request, List.class);

// check response
        if (response.getStatusCode() == HttpStatus.CREATED) {
            System.out.println("Post Created");
            System.out.println(response.getBody());
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
        }

        client.setData(response.getBody());
        return client;
    }

    public ResponseEntity<String> saveDataOnOtherServer(Client client) {
        // request url
        String url = "http://localhost:8100/clientdata";

// create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

// create headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

// build the request
        HttpEntity<Client> request = new HttpEntity<>(client, headers);

// send POST request
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

// check response
        if (response.getStatusCode() == HttpStatus.CREATED) {
            System.out.println("Post Created");
            System.out.println(response.getBody());
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
        }

        return response;
    }
}
