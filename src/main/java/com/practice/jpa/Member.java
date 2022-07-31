package com.practice.jpa;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
public class Member {
    @Id
    private Long id;
    private String name;

}
