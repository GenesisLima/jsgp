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
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@NotBlank(message="O campo nome é obrigatório")
	private String nome;
	@Column
	private String descricao;
	@Column(columnDefinition="char(1) default 'A'")
	private String status = "A";
	@Column
	private String unidade;
	@Column(name="preco_medio", columnDefinition="decimal(10,2)")
	private BigDecimal precoMedio;
	
	@JsonIgnore
	@ManyToOne	
	@JoinColumn(name="fk_especie_material")
	private EspecieMaterial especieMaterial;
	
	
	
	
}
