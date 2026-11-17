package com.haidar.beshadbe.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(name = "uk_users_employee_id", columnNames = "employee_id"),
        @UniqueConstraint(name = "uk_users_username", columnNames = "username")
})
@Getter @Setter
@NoArgsConstructor
public class User extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false, unique = true)
    private Employee employee;

    @Column(name = "username", length = 50, nullable = false, unique = true)
    private String username;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "last_login_at")
    private LocalDate lastLoginAt;
}
