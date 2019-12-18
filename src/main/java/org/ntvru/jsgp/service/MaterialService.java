package org.ntvru.jsgp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.ntvru.jsgp.entity.Material;
import org.ntvru.jsgp.repository.MaterialDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialService implements JSGPService<Material>{

	@Autowired
	private MaterialDAO materialDAO;
	
	@Override
	 public void save(Material material) {
		 materialDAO.save(material);
		 
	 }
	
	@Override
	 public void delete(Long id) {
		Material material =  materialDAO.findById(id).get();
		if(material != null && material.getId()!=0) {
		   material.setStatus("D");
			materialDAO.save(material);
		}
	 }

	@Override
	public List<Material> list() {
		return StreamSupport.stream(materialDAO.findAll().spliterator(), false)
			    .collect(Collectors.toList());
	}

	@Override
	public Material getById(Long id) {
		Optional<Material> material = materialDAO.findById(id);
		return (material.isPresent() ?  material.get(): null);
	}
 
	

}
