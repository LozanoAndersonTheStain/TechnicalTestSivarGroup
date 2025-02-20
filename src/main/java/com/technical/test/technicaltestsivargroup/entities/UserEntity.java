package com.technical.test.technicaltestsivargroup.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 90)
    private String email;

    @Column(nullable = false, length = 150)
    private String address;

//    @OneToMany
//    private Set<>
}
