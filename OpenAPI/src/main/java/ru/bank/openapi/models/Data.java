package ru.bank.openapi.models;

import lombok.Getter;

@Getter
public class Data {
    private Long orgId;
    private Integer amount;

    public Data(Long orgId, Integer amount) {
        this.orgId = orgId;
        this.amount = amount;
    }
}
