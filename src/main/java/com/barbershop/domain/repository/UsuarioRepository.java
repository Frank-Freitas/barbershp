package com.barbershop.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbershop.domain.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

}
