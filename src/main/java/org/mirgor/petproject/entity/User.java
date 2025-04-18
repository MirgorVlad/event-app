package org.mirgor.petproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "password")
    private String password;

    @Column(name = "created_time", updatable = false, nullable = false)
    private LocalDateTime createdTime;

    @Column(name = "last_modified_time", insertable = false)
    private LocalDateTime lastModifiedTime;

    @OneToMany(mappedBy = "userId")
    private List<Credentials> credentials;
}
