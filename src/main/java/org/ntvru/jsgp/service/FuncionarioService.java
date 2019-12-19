package org.ntvru.jsgp.service;

import java.util.List;

import org.ntvru.jsgp.entity.Funcionario;
import org.ntvru.jsgp.repository.FuncionarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService implements JSGPService<Funcionario>{

	@Autowired
	private FuncionarioDAO funcionarioDAO;
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@Override
	public void save(Funcionario funcionario) {
		funcionarioDAO.save(funcionario);
		
	}

	@Override
	public void delete(Long id) {
		Funcionario funcionario=  funcionarioDAO.findById(id).get();
		if(funcionario != null && funcionario.getId()!=0) {
			funcionario.setStatus("D");
			funcionarioDAO.save(funcionario);
		}
		
	}

	@Override
	public List<Funcionario> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public DepartamentoService getDepartamentoService() {
		return departamentoService;
	}

	
	
}
