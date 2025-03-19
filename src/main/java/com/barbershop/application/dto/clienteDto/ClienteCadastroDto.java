package com.barbershop.application.dto.clienteDto;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteCadastroDto {
	
	private String nome;
	
	private String email;
	
	private String telefone;
	
	private String Senha;
}
