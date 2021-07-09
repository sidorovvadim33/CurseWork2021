package main.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class GameSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "fields")
    private boolean fields;
}
