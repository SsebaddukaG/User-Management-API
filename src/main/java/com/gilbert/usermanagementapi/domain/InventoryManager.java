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
public class InventoryManager extends User{

    @Column(name = "inventoryManagerCode")
    private String inventoryManagerCode;
}
