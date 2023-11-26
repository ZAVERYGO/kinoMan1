package com.kozich.KinoMan.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ACTOR")
public class Actor {
    @Id
    @Column(name = "ACTOR_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "FIRST_NAME")
    public String fistName;
    @Column(name = "LAST_NAME")
    public String lastName;
    @Column(name = "DOB")
    public String DOB;

}
