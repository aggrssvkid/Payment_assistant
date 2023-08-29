package ru.bank.paymentassistant.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {

    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    public Client(
            Long id,
            String firstName,
            String lastName,
            String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}
