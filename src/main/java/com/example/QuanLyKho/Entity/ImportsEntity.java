package com.example.QuanLyKho.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "IMPORTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImportsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    @NotEmpty
    private Integer ID;

    @Column(name = "PRODUCT_ID", nullable = false)
    @NotEmpty
    private Integer PRODUCT_ID;

    @Column(name = "IMPORT_NUMBER", nullable = false)
    @NotEmpty
    private Integer IMPORT_NUMBER;

    @Column(name = "IMPORT_DATE", nullable = false)
    @NotEmpty
    private Integer IMPORT_DATE;

    @Column(name = "UPDATE_BY", nullable = false)
    @NotEmpty
    private Integer UPDATE_BY;

    @Column(name = "EMPLOYEE_ID", nullable = false)
    @NotEmpty
    private Integer EMPLOYEE_ID;

    @Column(name = "PRICE", nullable = false)
    @NotEmpty
    private Integer PRICE;
}
