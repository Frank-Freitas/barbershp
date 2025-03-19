package com.barbershop.application.dto.admDto;

import com.barbershop.domain.entity.enums.TipoServico;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IdBarbeiroDto {

	private Long id;

	private String nome;

	private TipoServico especialidade;
}
