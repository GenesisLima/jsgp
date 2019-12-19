package org.ntvru.jsgp.repository;

import org.ntvru.jsgp.entity.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioDAO extends CrudRepository<Funcionario, Long>{

}
