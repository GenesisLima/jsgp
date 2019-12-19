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
@Table(name="tb_departamento")
@Data
public class Departamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="departamento_id")
	private long id;
	@Column(nullable=false)
	private String nome;
	private String descricao;
	@Column(columnDefinition = "char(1) default 'A'")
	private String status = "A";
	
	
}
