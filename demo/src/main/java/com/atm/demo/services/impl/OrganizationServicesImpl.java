package com.atm.demo.services.impl;

import com.atm.demo.db.entity.Organization;
import com.atm.demo.db.repository.OrganizationRepository;
import com.atm.demo.services.OrganizationServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrganizationServicesImpl implements OrganizationServices {

    private final OrganizationRepository organizationRepository;

    @Override
    public Organization get(int idOrg) {
        return organizationRepository.findById(idOrg).get();
    }

    @Override
    public Organization create(Organization organization) {
        organization = organizationRepository.save(organization);
        return organization;
    }

    @Override
    public Organization update(Organization organization) {
        organization = organizationRepository.save(organization);
        return organization;
    }

    @Override
    public List<Organization> get() {
        return organizationRepository.findAll();
    }
}
