package com.atm.demo.services;

import com.atm.demo.db.entity.Users;

import java.util.List;

public interface UserServices {

    Users get(int idUser);

    Users create(Users users);

    Users update(Users users);

    List<Users> get();

    List<Users> getAll();

    List<Users> getAll(int idOrg);
}
