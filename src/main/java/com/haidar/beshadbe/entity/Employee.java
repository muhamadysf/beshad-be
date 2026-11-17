package com.haidar.beshadbe.entity;

import com.haidar.beshadbe.enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@SQLRestriction("is_deleted = false")
@Getter @Setter
@NoArgsConstructor
public class Employee extends BaseEntity{

    @Column(name = "employee_code", length = 30, nullable = false, unique = true)
    private String employeeCode;

    @Column(name = "full_name", nullable = false, length = 150)
    private String fullName;

    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;

    @Column(name = "position", nullable = false, length = 100)
    private String position;

    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @Column(name = "status", length = 20,nullable = false)
    private EmployeeStatus status = EmployeeStatus.ACTIVE;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private User user;
}
