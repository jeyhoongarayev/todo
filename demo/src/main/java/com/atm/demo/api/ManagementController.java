package com.atm.demo.api;


import com.atm.demo.db.entity.Users;
import com.atm.demo.services.impl.UserServicesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/admin")
public class ManagementController {

    private final UserServicesImpl userServices;

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void createAdmin(@RequestBody @Validated Users users){
        userServices.create(users);
    }

    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public Users update(@RequestBody Users users){
        return userServices.update(users);
    }
}
