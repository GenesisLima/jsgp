package org.ntvru.jsgp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.ntvru.jsgp.entity.Departamento;
import org.ntvru.jsgp.repository.DepartamentoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService implements JSGPService<Departamento> {

	@Autowired
	private DepartamentoDAO departamentoDAO;
	
	@Override
	public void save(Departamento departamento) {
		departamentoDAO.save(departamento);
		
	}

	@Override
	public void delete(Long id) {
		Departamento departamento =  departamentoDAO.findById(id).get();
		if(departamento != null && departamento.getId()!=0) {
			departamento.setStatus("D");
			departamentoDAO.save(departamento);
		}
		
	}

	@Override
	public List<Departamento> list() {
		return StreamSupport.stream(departamentoDAO.findAll().spliterator(), false)
			    .collect(Collectors.toList());
	}

	@Override
	public Departamento getById(Long id) {
		Optional<Departamento> departamento = departamentoDAO.findById(id);
		return (departamento.isPresent() ?  departamento.get(): null);
	}

	
}
