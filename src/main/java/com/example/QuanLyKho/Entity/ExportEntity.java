package com.example.QuanLyKho.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "PRODUCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotEmpty
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "NAME", nullable = false)
    @NotEmpty
    private String NAME;

    @Column(name = "PRODUCT", nullable = false)
    @NotEmpty
    private String PRODUCT;

    @Column(name = "NUMBER" ,nullable = false)
    @NotEmpty
    private Integer NUMBER;


}
