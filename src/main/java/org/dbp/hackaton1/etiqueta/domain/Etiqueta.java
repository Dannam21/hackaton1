package org.dbp.hackaton1.etiqueta.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Etiqueta {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     @Column
    private String nombre;
}
