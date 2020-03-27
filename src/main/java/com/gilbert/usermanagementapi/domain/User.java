package com.gilbert.usermanagementapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    @OneToMany
    private List<Role> roles;
}
