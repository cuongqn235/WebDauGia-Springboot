package com.webdaugia.converter;

import org.springframework.stereotype.Component;

import com.webdaugia.dto.SanPhamDTO;
import com.webdaugia.entity.SanPhamEntity;

@Component
public class SanPhamConvert {
	public SanPhamDTO toDTO(SanPhamEntity entity) {
		SanPhamDTO dto = new SanPhamDTO();
		dto.setId(entity.getId());
		dto.setTensp(entity.getTensp());
		dto.setChitiet(entity.getChitiet());
		dto.setHinhanh(entity.getHinhanh());
		dto.setSoluong(entity.getSoluong());
		return dto;
	}

	public SanPhamEntity toEntity(SanPhamDTO dto) {
		SanPhamEntity entity = new SanPhamEntity();
		entity.setTensp(dto.getTensp());
		entity.setChitiet(dto.getChitiet());
		entity.setHinhanh(dto.getHinhanh());
		entity.setSoluong(dto.getSoluong());
		return entity;
	}

	public SanPhamEntity toEntity(SanPhamDTO dto, SanPhamEntity entity) {
		entity.setTensp(dto.getTensp());
		entity.setChitiet(dto.getChitiet());
		entity.setHinhanh(dto.getHinhanh());
		entity.setSoluong(dto.getSoluong());
		return entity;
	}
}
