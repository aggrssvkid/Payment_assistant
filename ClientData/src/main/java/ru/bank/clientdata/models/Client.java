package ru.bank.clientdata.models;

import lombok.Getter;

import java.util.List;

@Getter
public class Client {

    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private List<Data> data;
}
