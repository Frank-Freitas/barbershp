package com.barbershop.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbershop.domain.entity.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento,Long> {

}
