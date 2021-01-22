package com.atm.demo.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    private String name;
    private String surname;
    @Column(unique = true)
    private String email;
    private String password;
    private String address;
    private String phone;
    @Column(nullable = true, columnDefinition = "integer default 0")
    private int idOrganization = 0;
    private String roles;
}
