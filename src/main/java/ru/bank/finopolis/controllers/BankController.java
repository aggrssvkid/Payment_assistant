package ru.bank.finopolis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.finopolis.models.Organization;
import ru.bank.finopolis.services.OrganizationService;

@RestController //@Controller
public class BankController {

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping("/organizations/{organizationId}")
    public String showOrganization(@PathVariable("organizationId") Long organizationId) {
        Organization organization = organizationService.findById(organizationId);

        return organization.getName();
    }
}
