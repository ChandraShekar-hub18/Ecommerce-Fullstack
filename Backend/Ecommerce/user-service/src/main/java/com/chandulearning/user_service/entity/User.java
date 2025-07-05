package com.chandulearning.user_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "user_name"),
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "user_name", nullable = false, unique = true, length = 80)
    private String userName;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "password", length = 20)
    private String password;
    
    @Column(name = "email", length = 50)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column
    private Role role;

    // New fields for Auth
    @Column(name= "provider")
    @Enumerated(EnumType.STRING)
    private AuthProvider provider;

    @Column(name = "provider_id", length = 100)
    private String providerId;

    @Column(name = "email_verified", length = 1)
    private Boolean emailVerified;

    @Column(name = "profile_image", length = 255)
    private String profileImage;

}
