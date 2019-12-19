package org.ntvru.jsgp.entity;

import java.io.Serializable;

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
@Table(name="tb_funcionario")
@Data
public class Funcionario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="funcionario_id")
	private long id;
	private int matricula;
	@Column(nullable=false)
	private String nome;
	private int ramal;
	@ManyToOne
	@JoinColumn(name="fk_departamnto")
	private Departamento departamento;
	@Column(columnDefinition="CHAR(1) default 'A'")
	private String status="A";

}
