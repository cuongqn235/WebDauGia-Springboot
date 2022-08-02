package com.webdaugia.converter;

import org.springframework.stereotype.Component;

import com.webdaugia.dto.CT_DGDTO;
import com.webdaugia.entity.CT_DGEntity;

@Component
public class CT_DGConvert {
	public CT_DGDTO toDTO(CT_DGEntity entity) {
		CT_DGDTO dto = new CT_DGDTO();
		dto.setId(entity.getId());
		dto.setDaugiaid(entity.getDaugia().getId());
		dto.setKhachhangid(entity.getKhachhang().getId());
		dto.setGiadau(entity.getGiadau());
		dto.setThoigian(entity.getThoigian());
		dto.setTrangthai(entity.getTrangthai());
		dto.setHoten(entity.getKhachhang().getHo() + " " + entity.getKhachhang().getTen());
		return dto;
	}

	public CT_DGEntity toEntity(CT_DGDTO dto) {
		CT_DGEntity entity = new CT_DGEntity();
		entity.setGiadau(dto.getGiadau());
		entity.setTrangthai(dto.getTrangthai());
		entity.setThoigian(dto.getThoigian());
		return entity;
	}
}
