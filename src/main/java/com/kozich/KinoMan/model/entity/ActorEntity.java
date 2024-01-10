package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name = "ACTOR")
public class ActorEntity {
    @Id
    @Column(name = "ACTOR_ID", nullable = false, unique = true)
    @SequenceGenerator(name = "seq_actor",
    sequenceName = "seq_actor",
    initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_actor")
    private Long id;

    @Column(name = "FIRST_NAME", nullable = false, length = 20)
    private String fistName;

    @Column(name = "LAST_NAME", nullable = false, length = 20)
    private String lastName;

    @Column(name = "DAY_OF_BIRTH", nullable = false)
    private String dayOfBirth;

    @OneToMany(mappedBy = "CatalogActorPK.actor")
    private List<CatalogEntity> catalog;
}
