package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name = "GENRE")
public class GenreEntity {
    @Id
    @Column(name = "GENRE_ID", nullable = false, unique = true)
    @SequenceGenerator(name = "seq_genre",
            sequenceName = "seq_genre",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_genre")
    private Long id;

    @Column(name = "GENRE", nullable = false, length = 20)
    private String genre;

    @OneToMany(mappedBy = "genreId")
    private List<CatalogGenreEntity> catalog;
}