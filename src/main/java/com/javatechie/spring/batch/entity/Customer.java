package com.javatechie.spring.batch.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "customers_info_temp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private int id;

    @Column(name = "YEAR")
    private String Year;

    @Column(name = "INDUSTRY_AGGREGATION_NZSIOC")
    private String Industry_aggregation_NZSIOC;
    @Column(name = "INDUSTRY_CODE_NZSIOC")
    private String Industry_code_NZSIOC;

    @Column(name = "INDUSTRY_NAME_NZSIOC")
    private String Industry_name_NZSIOC;

    @Column(name = "UNITS")
    private String Units;

    @Column(name = "VARIABLE_CODE")
    private String Variable_code;

    @Column(name = "VARIABLE_NAME")
    private String Variable_name;

    @Column(name = "VARIABLE_CATEGORY")
    private String Variable_category;

    @Column(name = "VALUE")
    private String Value;

    @Column(name = "INDUSTRY_CODE_ANZSIC06")
    private String Industry_code_ANZSIC06;
}
