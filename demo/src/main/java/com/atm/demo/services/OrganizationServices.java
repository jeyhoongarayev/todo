package com.atm.demo.services;

import com.atm.demo.db.entity.Organization;

import java.util.List;

public interface OrganizationServices {

  Organization get(int idOrg);

  Organization create(Organization organization);

  Organization update(Organization organization);

  List<Organization> get();
}
