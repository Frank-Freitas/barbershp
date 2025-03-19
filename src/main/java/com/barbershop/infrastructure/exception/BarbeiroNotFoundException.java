package com.barbershop.infrastructure.exception;

public class BarbeiroNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public BarbeiroNotFoundException(Long id) {
	        super("Barbeiro com ID " + id + " não encontrado.");
	    }
}
 