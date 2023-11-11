package com.example.crudmerquefacil.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="tbl_articulo")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArticulo;
    private String nomArticulo;
    private String uMedida;
    private Long cantMax;
    private Long cantMin;
    private Long exstencia;
    private Integer idGrupo;

}
