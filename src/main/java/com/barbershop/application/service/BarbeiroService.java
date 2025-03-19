package com.barbershop.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.barbershop.application.dto.admDto.BarbeiroDto;

import com.barbershop.application.dto.admDto.IdBarbeiroDto;

import com.barbershop.application.mapper.BarbeiroMapper;

import com.barbershop.domain.entity.Barbeiro;

import com.barbershop.domain.repository.BarbeiroRepository;

import com.barbershop.infrastructure.exception.BarbeiroNotFoundException;

@Service
public class BarbeiroService {

	@Autowired
	private BarbeiroRepository repository;

	@Autowired
	private BarbeiroMapper mapper;

	public List<BarbeiroDto> findAll() {
		return repository.findAll().stream().map(Barbeiro -> mapper.toDto(Barbeiro)).toList();
	}

	public BarbeiroDto findById(Long id) {
		return repository.findById(id).map(Barbeiro -> mapper.toDto(Barbeiro))
				.orElseThrow(() -> new BarbeiroNotFoundException(id));
	}

	public BarbeiroDto save(BarbeiroDto dto) {
		Barbeiro entity = mapper.toEntity(dto);
		repository.save(entity);
		return mapper.toDto(entity);
	}

	public BarbeiroDto update(Long id, IdBarbeiroDto dto) {
		IdBarbeiroDto bdIdDto = repository.findById(id).map(Barbeiro -> mapper.toIdDto(Barbeiro))
		.orElseThrow(() -> new BarbeiroNotFoundException(id));
		dto.setId(bdIdDto.getId());
		Barbeiro entity = repository.save(mapper.toIdEntity(bdIdDto));
		return mapper.toDto(entity);
	}

	public void deleteById(Long id) {
		this.findById(id);
		repository.deleteById(id);
	}
}