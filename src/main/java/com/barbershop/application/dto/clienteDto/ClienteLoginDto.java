package com.barbershop.application.dto.clienteDto;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteLoginDto {
	
	private String email;
	
	private String Senha;
}
