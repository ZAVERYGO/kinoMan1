package com.kozich.KinoMan.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CATALOG")
public class Catalog {
    @Id
    @Column(name = "CATALOG_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "TYPE")
    public String type;

    @Column(name = "NAME")
    public String name;
    @Column(name = "DIRECTOR")
    public String director;
    @Column(name = "COUNTRY")
    public String country;
    @Column(name = "DURATION")
    public Time duration;
    @Column(name = "RELEASED")
    public Integer released;
    @Column(name = "DESCRIPTION")
    public String description;

}
