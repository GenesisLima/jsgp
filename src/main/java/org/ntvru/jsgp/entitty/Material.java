package org.ntvru.jsgp.entitty;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.javamoney.moneta.Money;

import lombok.Data;
@Entity
@Data
@Table(name="tb_material")
public class Material implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="material_id")
	private long id;
	@Column(nullable=false)
	private String nome;
	@Column
	private String descricao;
	@Column(columnDefinition="char(1) default 'A'")
	private String status;
	@Column
	private String unidade;
	private int quantidade;
	private Money precoMedio;
	
	@ManyToOne	
	@JoinColumn(name="fk_especie_material")
	private EspecieMaterial especieMaterial;
	
	
	
	
}
