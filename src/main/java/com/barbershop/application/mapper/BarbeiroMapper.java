package com.barbershop.application.mapper;

import org.mapstruct.Mapper;

import com.barbershop.application.dto.admDto.BarbeiroDto;

import com.barbershop.application.dto.admDto.IdBarbeiroDto;

import com.barbershop.domain.entity.Barbeiro;

@Mapper(componentModel ="Spring")
public interface BarbeiroMapper {
	
	Barbeiro toEntity(BarbeiroDto dto);
	
	BarbeiroDto toDto(Barbeiro entity);
	
	IdBarbeiroDto toIdDto (Barbeiro entity);
	
	Barbeiro toIdEntity (IdBarbeiroDto idDto)	;
}
