package org.dbp.hackaton1.etiqueta.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.dbp.hackaton1.domain.Salon;

import java.util.List;

@Data
@Entity
public class Etiqueta {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     @Column
    private String nombre;

     @ManyToMany
     @JoinTable(name = "salon_etiqueta")
        private List<Salon> salones;
}
