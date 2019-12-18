package org.ntvru.jsgp.repository;

import java.util.List;

import org.ntvru.jsgp.entity.ControleMaterial;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControleMaterialDAO extends CrudRepository<ControleMaterial, Long>{

	
}
