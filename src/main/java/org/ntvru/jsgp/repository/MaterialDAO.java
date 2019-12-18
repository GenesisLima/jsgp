package org.ntvru.jsgp.repository;

import java.util.List;

import org.ntvru.jsgp.entity.Material;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialDAO extends CrudRepository<Material, Long> {

	
}
