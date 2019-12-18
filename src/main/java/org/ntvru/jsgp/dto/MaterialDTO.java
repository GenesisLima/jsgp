package org.ntvru.jsgp.dto;

import java.math.BigDecimal;

import lombok.Value;

@Value
public class MaterialDTO {

	public String nome, descricao, unidade;
	public BigDecimal precoMedio;
	
	
	
}
