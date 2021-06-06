package com.mikelspring.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Cliente {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(nullable = false)
	private String nome;
	private String email;

}
