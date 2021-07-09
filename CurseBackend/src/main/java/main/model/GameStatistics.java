package main.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class GameStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @Column(name = "gameStart")
    private Timestamp gameStart;

    @Column(name = "gameEnd")
    private Timestamp gameEnd;
}
