package com.atm.demo.db.repository;

import com.atm.demo.db.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    List<Users> findAllByIdOrganization(int idOrg);

    Users findByEmail(String username);
}
