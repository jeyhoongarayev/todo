package com.atm.demo.services.impl;

import com.atm.demo.db.entity.Users;
import com.atm.demo.db.repository.UserRepository;
import com.atm.demo.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServicesImpl implements UserServices {

    private final UserRepository userRepository;

    @Override
    public Users get(int idUser) {
        return userRepository.findById(idUser).get();
    }

    @Override
    public Users create(Users users) {
        users.setPassword("123456");
        users = userRepository.save(users);
        return users;
    }

    @Override
    public Users update(Users users) {
        users = userRepository.save(users);
        return users;
    }

    @Override
    public List<Users> get() {
        return null;
    }

    @Override
    public List<Users> getAll() {
        return null;
    }

    @Override
    public List<Users> getAll(int idOrg) {
        return userRepository.findAllByIdOrganization(idOrg);
    }
}
