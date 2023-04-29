package com.sha.springbootannotationsdemo.idgenerator.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "default_one")//db_table_name
public class DefaultOne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String name;
}
