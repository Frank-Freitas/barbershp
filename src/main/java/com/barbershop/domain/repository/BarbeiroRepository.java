package com.barbershop.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbershop.domain.entity.Barbeiro;

public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long> {

}
