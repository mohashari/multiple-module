package com.monggopesen.domain;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@Table
public class Users {

    @PrimaryKey
    private String id;
    @Column
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Users() {
    }

    public Users(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static Users create(String name, int age) {
        return new Users(UUID.randomUUID().toString(), name, age);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
