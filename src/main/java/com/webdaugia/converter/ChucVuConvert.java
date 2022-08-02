package com.webdaugia.converter;

import org.springframework.stereotype.Component;

import com.webdaugia.dto.ChucVuDTO;
import com.webdaugia.entity.ChucVuEntity;

@Component
public class ChucVuConvert {
	public ChucVuDTO toDTO(ChucVuEntity entity) {
		ChucVuDTO dto = new ChucVuDTO();
		dto.setId(entity.getId());
		dto.setChucvu(entity.getChucvu());
		return dto;
	}
	public ChucVuEntity toEntity(ChucVuDTO dto) {
		ChucVuEntity entity = new ChucVuEntity();
		entity.setChucvu(dto.getChucvu());
		return entity;
	}
}
