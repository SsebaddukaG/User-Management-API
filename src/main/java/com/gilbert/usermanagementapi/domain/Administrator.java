package com.gilbert.usermanagementapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Administrator extends User {

    @Column(name = "adminCode")
    private String adminCode;
}
