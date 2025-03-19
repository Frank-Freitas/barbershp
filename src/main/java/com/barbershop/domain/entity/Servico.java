package com.barbershop.domain.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToMany;

import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToMany
	@JoinColumn(name = "barbeiro_id")
	private Barbeiro barbeiro; 

	@Column(nullable = false)
	private BigDecimal preco;
	
	@ManyToOne
	@JoinColumn(name = "agendamento_id")
	private Agendamento agendamento;
}
