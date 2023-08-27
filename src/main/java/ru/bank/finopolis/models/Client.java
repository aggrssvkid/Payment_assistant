package ru.bank.finopolis.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id is generated and added in the table auto
    private Long id;

    @NotBlank // not empty
    @Size(min=8) // min 8 symbols
    private String bankAccount;
}
