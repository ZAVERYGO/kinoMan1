package com.kozich.KinoMan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GENRE")
public class GenreEntity {
    @Id
    @Column(name = "GENRE_ID", nullable = false, unique = true)
    @SequenceGenerator(name = "seq_genre",
            sequenceName = "seq_genre",
            initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_genre")
    private Long id;

    @Column(name = "GENRE", nullable = false, length = 20)
    private String genre;

    @ManyToMany(mappedBy = "genres")
    private List<CatalogEntity> catalog;
}