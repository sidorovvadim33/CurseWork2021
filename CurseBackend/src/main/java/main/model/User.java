package main.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;

    @Id
    @Column(name = "username")
//    @NotEmpty(message = "Please provide your login")
    private String username;

    @Column(name = "password")
//    @NotEmpty(message = "Please provide your password")
    private String password;

    @Column(name = "isActive")
//    @NotEmpty(message = "Please provide your password")
    private boolean isActive;
}
