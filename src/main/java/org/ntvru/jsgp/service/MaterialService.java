package org.ntvru.jsgp.service;

import org.ntvru.jsgp.entitty.Material;
import org.ntvru.jsgp.repository.MaterialDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {

	@Autowired
	private MaterialDAO materialDAO;
	
	
	 public void save(Material material) {
		 materialDAO.save(material);
		 
	 }
	 
	 public void delete(Long id) {
		Material material =  materialDAO.findById(id).get();
		if(material != null && material.getId()!=0) {
		   material.setStatus("D");
			materialDAO.save(material);
		}
	 } 
}
