package com.example.QuanLyKho.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "EXPORTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @NotEmpty
    private Integer ID;

    @Column(name = "PRODUCT_ID")
    @NotEmpty
    private Integer PRODUCT_ID;

    @Column(name = "EXPORT_NUMBER")
    @NotEmpty
    private Integer EXPORT_NUMBER;

    @Column(name = "EXPORT_DATE")
    @NotEmpty
    private String EXPORT_DATE;

    @Column(name = "UPDATE_BY")
    @NotEmpty
    private String UPDATE_BY;

    @Column(name = "EMPLOYEE_ID")
    @NotEmpty
    private Integer EMPLOYEE_ID;

    @Column(name = "PRICE")
    @NotEmpty
    private Integer PRICE;

}
