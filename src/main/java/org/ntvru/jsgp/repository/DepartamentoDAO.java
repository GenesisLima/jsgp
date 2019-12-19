package org.ntvru.jsgp.repository;

import org.ntvru.jsgp.entity.Departamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DepartamentoDAO extends CrudRepository<Departamento, Long>{

}
