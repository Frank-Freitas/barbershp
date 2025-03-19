package com.barbershop.application.dto.clienteDto;

import java.time.LocalDate;

import java.util.List;

import com.barbershop.domain.entity.Servico;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AgendamentoDto {
	
	private List<Servico> listaServico;
	
	private Servico servico;
	
	private LocalDate Data;
	
}
