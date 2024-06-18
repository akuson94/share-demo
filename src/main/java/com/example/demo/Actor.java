package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Actor {
    @Id
    private String actor_id;
    private String first_name;
    private String last_name;
    private String last_update;

}
