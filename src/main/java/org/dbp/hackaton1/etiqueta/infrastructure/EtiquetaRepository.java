package org.dbp.hackaton1.etiqueta.infrastructure;

import org.dbp.hackaton1.etiqueta.domain.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtiquetaRepository extends JpaRepository<Etiqueta,Integer> {

}
