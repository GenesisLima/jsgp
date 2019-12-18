package org.ntvru.jsgp.service;

import java.util.List;

import org.ntvru.jsgp.entity.ControleMaterial;
import org.ntvru.jsgp.repository.ControleMaterialDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//TODO create a custom exception handling system to deal with business exceptions
@Service
public class ControleMaterialService implements JSGPService<ControleMaterial>{

	@Autowired
	private ControleMaterialDAO controleMaterialDAO;
	
	@Autowired 
	MaterialService materialService;
	
	@Override
	public void save(ControleMaterial controleMaterial) {
		
		controleMaterialDAO.save(controleMaterial);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ControleMaterial> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ControleMaterial getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public MaterialService getMaterialService() {
		return this.materialService;
	}
	
	

}
