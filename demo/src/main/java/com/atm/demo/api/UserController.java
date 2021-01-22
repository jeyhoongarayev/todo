package com.atm.demo.api;

import com.atm.demo.db.entity.Users;
import com.atm.demo.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private UserServices userServices;

    @GetMapping("/{idOrg}")
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    public List<Users>  get(@PathVariable @Validated int idOrg){
        return userServices.getAll(idOrg);
    }


    @GetMapping("/{id}")
    public Users getUser(@PathVariable("user") @Validated int idUser){
        return userServices.get(idUser);
    }

    @PostMapping
    public void changePassword(@RequestBody @Validated Users users, @RequestHeader(HttpHeaders.AUTHORIZATION) String token){
    }


}
