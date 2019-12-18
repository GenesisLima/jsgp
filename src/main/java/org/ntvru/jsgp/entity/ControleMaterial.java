package org.ntvru.jsgp.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="controle_material")
@Data
public class ControleMaterial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="controlematerial_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name="fk_material")
	private Material material;
	private int quantidade;
	private BigDecimal precoTotal;
	private String observacao;
	
	
}
