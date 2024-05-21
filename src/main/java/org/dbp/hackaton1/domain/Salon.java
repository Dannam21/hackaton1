package org.dbp.hackaton1.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.dbp.hackaton1.Reserva.domain.Reserva;
import org.dbp.hackaton1.etiqueta.domain.Etiqueta;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalon;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String ubicacion;

    @Column(nullable = false)
    private int capacidad;

    @Column(nullable = false)
    private int descripcion;

    @OneToMany(mappedBy = "salon")
    private List<Reserva> reservas = new ArrayList<>();

    @ManyToMany(mappedBy = "salones")
    private List<Etiqueta> etiquetas;


}