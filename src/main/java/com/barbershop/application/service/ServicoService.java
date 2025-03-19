package com.barbershop.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.barbershop.application.dto.admDto.IdServicoDto;

import com.barbershop.application.dto.admDto.ServicoDto;

import com.barbershop.application.mapper.ServicoMapper;

import com.barbershop.domain.entity.Servico;

import com.barbershop.domain.repository.ServicoRepository;

import com.barbershop.infrastructure.exception.ServicoNotFoundException;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository repository;

	@Autowired
	private ServicoMapper mapper;

	public List<ServicoDto> findAll() {
		return repository.findAll().stream().map(Servico -> mapper.toDto(Servico)).toList();
	}

	public IdServicoDto findById(Long id) {
		IdServicoDto dto = repository.findById(id).map(Servico -> mapper.toIdDto(Servico))
		.orElseThrow(() -> new ServicoNotFoundException(id));
		return dto;
	}

	public ServicoDto save(ServicoDto dto) {
		Servico entity = repository.save(mapper.toEntity(dto));
		return mapper.toDto(entity);
	}

	public ServicoDto update(long id, IdServicoDto dto) {
		IdServicoDto bdToDto = this.findById(id);
		dto.setId(bdToDto.getId());
		Servico toEntity = repository.save(mapper.toIdEntity(dto));
		return mapper.toDto(toEntity);
	}

	public void deleteById(Long id) {
		this.findById(id);
		repository.deleteById(id);
	}
}