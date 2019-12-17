package org.ntvru.jsgp.service;

import java.util.List;

import org.ntvru.jsgp.entitty.Material;
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
		// TODO Auto-generated method stub
		return null;
	}


}
