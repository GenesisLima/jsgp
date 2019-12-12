package org.ntvru.jsgp.repository;

import org.ntvru.jsgp.entitty.Material;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialDAO extends CrudRepository<Material, Long> {

	
}
