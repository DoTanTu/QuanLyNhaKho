package com.example.QuanLyKho.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "NAME", nullable = false)
    @NotEmpty
    private String NAME;

    @Column(name = "ROLE")
    @NotEmpty
    private String ROLE;

    @Column(name = "ADDRESS")
    @NotEmpty
    private String ADDRESS;

    @Column(name = "EMAIL", nullable = false)
    @NotEmpty
    private String EMAIL;

    @Column(name = "PHONE", nullable = false)
    @NotEmpty
    private String PHONE;

    @Column(name ="DOB", nullable = false)
    @NotEmpty
    private String DOB;

}
