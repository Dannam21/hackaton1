package org.dbp.hackaton1.Reserva.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.sql.Time;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Date fecha;
    @Column
    private Time horaInicio;
    private Time horaFin;

}
