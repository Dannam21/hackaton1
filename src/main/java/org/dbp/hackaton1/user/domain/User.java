package org.dbp.hackaton1.user.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.dbp.hackaton1.Reserva.domain.Reserva;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String correoElectronico;

    @Column(nullable = false)
    private String contrasenia;

    @Column(nullable = false)
    private String telefono;
    @OneToMany(mappedBy ="user" )
    private List<Reserva> reserva;
}
