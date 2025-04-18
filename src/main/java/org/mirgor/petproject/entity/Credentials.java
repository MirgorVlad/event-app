package org.mirgor.petproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credentials")
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer credentialsId;

    @Column(name = "credential_type", nullable = false)
    private CredentialType credentialType;

    @Column(name = "token", nullable = false)
    private String token;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;
}
