package org.ntvru.jsgp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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


	@Override
	public List<EspecieMaterial> list() {		
		return StreamSupport.stream(especieMaterialDAO.findAll().spliterator(), false)
			    .collect(Collectors.toList());
	}


	@Override
	public EspecieMaterial getById(Long id) {
		Optional<EspecieMaterial> especieMaterial = especieMaterialDAO.findById(id);
		return (especieMaterial.isPresent() ?  especieMaterial.get(): null);		
	}
	
		
}
