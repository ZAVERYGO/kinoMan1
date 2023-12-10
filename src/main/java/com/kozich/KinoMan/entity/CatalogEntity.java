package com.kozich.KinoMan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CATALOG")
public class CatalogEntity {
    @Id
    @Column(name = "CATALOG_ID", nullable = false, unique = true)
    @SequenceGenerator(name = "seq_catalog",
            sequenceName = "seq_catalog",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_catalog")
    private Long id;

    @Column(name = "TYPE", nullable = false, length = 20)
    private String type;

    @Column(name = "NAME", nullable = false, length = 20)
    private String name;

    @Column(name = "DIRECTOR", nullable = false, length = 20)
    private String director;

    @Column(name = "COUNTRY", nullable = false, length = 20)
    private String country;

    @Column(name = "DURATION", nullable = false)
    private Time duration;

    @Column(name = "RELEASED", nullable = false)
    private Integer released;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "CATALOG_ACTOR",
    joinColumns = @JoinColumn(name = "CATALOG_ID"),
    inverseJoinColumns = @JoinColumn(name = "ACTOR_ID"))
    private List<ActorEntity> actors;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "CATALOG_GENRE",
            joinColumns = @JoinColumn(name = "CATALOG_ID"),
            inverseJoinColumns = @JoinColumn(name = "GENRE_ID"))
    private List<GenreEntity> genres;
}
