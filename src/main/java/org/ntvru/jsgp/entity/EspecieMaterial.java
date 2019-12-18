package org.ntvru.jsgp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_especie_material")
@Data
public class EspecieMaterial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="especie_material_id")
	private Long id;
	@Column(nullable=false, unique=true)
	private String nome;
	private String descricao;
	@Column(columnDefinition="char(1) default 'A'")
	private String status = "A";
	
}
