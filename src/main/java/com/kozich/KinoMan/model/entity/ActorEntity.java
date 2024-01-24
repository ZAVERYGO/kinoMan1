package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.sql.Date;
import java.util.List;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "ACTOR")
public class ActorEntity {
    @Id
    @Column(name = "ACTOR_ID", nullable = false, unique = true)
    @SequenceGenerator(name = "seq_actor",
    sequenceName = "seq_actor",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_actor")
    private Long id;

    @Column(name = "FIRST_NAME", nullable = false, length = 20)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 20)
    private String lastName;

    @Column(name = "DAY_OF_BIRTH", nullable = false)
    private Date dayOfBirth;

    @OneToMany(mappedBy = "actorId")
    private List<CatalogActorEntity> catalog;

}
