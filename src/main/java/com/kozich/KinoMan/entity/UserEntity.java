package com.kozich.KinoMan.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@RequiredArgsConstructor
@Table(name = "USER")
public class UserEntity {
    @Id
    @Column(name = "USER_ID", nullable = false, unique = true)
    @SequenceGenerator(name = "seq_user",
            sequenceName = "seq_user",
            initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
    private Long id;

    @Column(name = "USER_NAME", nullable = false, unique = true, length = 20)
    private String userName;

    @Column(name = "PASSWORD", nullable = false, length = 20)
    private String password;
}
