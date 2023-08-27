package ru.bank.finopolis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bank.finopolis.models.Organization;
import ru.bank.finopolis.repositories.OrganizationRepository;

@Service
@Transactional
public class OrganizationServiceImpl implements OrganizationService {

    OrganizationRepository repo;

    @Autowired
    public OrganizationServiceImpl(OrganizationRepository repo) {
        this.repo = repo;
    }

    @Override
    public Organization findById(Long entityId) {
        return repo.findById(entityId).orElse(null);
    }
}
