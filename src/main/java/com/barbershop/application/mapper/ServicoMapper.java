package com.barbershop.application.mapper;

import org.mapstruct.Mapper;

import com.barbershop.application.dto.admDto.IdServicoDto;

import com.barbershop.application.dto.admDto.ServicoDto;

import com.barbershop.domain.entity.Servico;

@Mapper(componentModel = "spring")
public interface ServicoMapper {
	
	Servico toEntity(ServicoDto dto);
	
	ServicoDto toDto(Servico entity);
	
	IdServicoDto toIdDto(Servico entity);
	
	Servico toIdEntity(IdServicoDto idDto);
}
