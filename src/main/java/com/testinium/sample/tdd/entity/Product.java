package com.testinium.sample.tdd.entity;

import javax.persistence.Entity;

@Entity
public class Product extends BaseEntityAudit {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
