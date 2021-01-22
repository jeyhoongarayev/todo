package com.atm.demo.auth;

import com.atm.demo.db.entity.Users;
import com.atm.demo.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Repository("mysqlDB")
public class ApplicationUserDaoService implements ApplicationUserDao {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Autowired
    public ApplicationUserDaoService(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        Users users = userRepository.findByEmail(username);
        return createUser(users);
    }

    private Optional<ApplicationUser> createUser(Users users) {
        Set<SimpleGrantedAuthority> role = new HashSet<>();
        role.add(new SimpleGrantedAuthority("ROLE_" + users.getRoles()));
        return Optional.of(new ApplicationUser(
                        users.getEmail(),
                        passwordEncoder.encode(users.getPassword()),
                        role,
                        true,
                        true,
                        true,
                        true
                )
        );
    }
}
