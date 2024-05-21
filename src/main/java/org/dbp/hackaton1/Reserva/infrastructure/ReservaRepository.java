package org.dbp.hackaton1.Reserva.infrastructure;

import org.dbp.hackaton1.Reserva.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva,Integer> {
}
