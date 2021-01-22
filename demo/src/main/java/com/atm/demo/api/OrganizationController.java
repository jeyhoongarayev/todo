package com.atm.demo.api;

import com.atm.demo.db.entity.Organization;
import com.atm.demo.services.OrganizationServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/organization")
public class OrganizationController {

    private OrganizationServices organizationServices;

    @GetMapping
    public List<Organization> get(){
        return organizationServices.get();
    }

    @PostMapping
    public Organization create(@RequestBody Organization organization){
        return organizationServices.create(organization);
    }

    @PutMapping
    public Organization update(@RequestBody Organization organization){
        return organizationServices.update(organization);
    }


    @GetMapping("/{id}")
    public Organization getOrganization(@PathVariable int id){
        return organizationServices.get(id);
    }
}
