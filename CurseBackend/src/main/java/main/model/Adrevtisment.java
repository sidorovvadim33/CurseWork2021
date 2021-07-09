package main.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Adrevtisment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "heading")
    private String heading;

    @Column(name = "text")
    private String text;

    @Column(name = "image_file_path")
    private String imageFilePath;
}
