package ru.bank.finopolis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bank.finopolis.models.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    // write method findById don't need because it is located in the interface JpaRepository
}
