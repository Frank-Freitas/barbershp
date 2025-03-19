package com.barbershop.infrastructure.exception;

public class ServicoNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ServicoNotFoundException(long id) {
		super("Serviço com ID" + id +" não encontrado.");
	}
	
	

}
