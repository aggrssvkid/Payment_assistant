package ru.bank.finopolis.services;

public interface CrudService<T> {
    T findById(Long entityId);
}
