package org.ntvru.jsgp.service;

import org.ntvru.jsgp.entitty.EspecieMaterial;
import org.ntvru.jsgp.repository.EspecieMaterialDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EspecieMaterialService implements JSGPService<EspecieMaterial>{

	@Autowired
	private EspecieMaterialDAO especieMaterialDAO;
	
	
	@Override
	 public void delete(Long id) {
		EspecieMaterial especieMaterial =  especieMaterialDAO.findById(id).get();
		if(especieMaterial != null && especieMaterial.getId()!=0) {
			especieMaterial.setStatus("D");
			especieMaterialDAO.save(especieMaterial);
		}
	 }


	@Override
	public void save(EspecieMaterial especieMaterial) {
		especieMaterialDAO.save(especieMaterial);
		
	}
	
}
