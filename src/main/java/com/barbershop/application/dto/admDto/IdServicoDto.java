package com.barbershop.application.dto.admDto;

import java.math.BigDecimal;

import com.barbershop.domain.entity.Barbeiro;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IdServicoDto {

	private Long id;
	
	private Barbeiro barbeiro; 

	private BigDecimal preco;
}
