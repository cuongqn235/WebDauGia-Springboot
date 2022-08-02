package com.webdaugia.converter;

import org.springframework.stereotype.Component;

import com.webdaugia.dto.CT_NapTienDTO;
import com.webdaugia.entity.CT_NapTienEntiy;
@Component
public class CT_NapTienConvert {
	public CT_NapTienEntiy toEntity(CT_NapTienDTO dto) {
		CT_NapTienEntiy entity= new CT_NapTienEntiy();
		entity.setNgaynap(dto.getNgaynap());
		entity.setSotien(dto.getSotien());
		return entity;
	}
	public CT_NapTienEntiy toEntity(CT_NapTienEntiy entity,CT_NapTienDTO dto) {
		entity.setNgaynap(dto.getNgaynap());
		entity.setSotien(dto.getSotien());
		return entity;
	}
	public CT_NapTienDTO toDTO(CT_NapTienEntiy entity) {
		CT_NapTienDTO dto= new CT_NapTienDTO();
		dto.setId(entity.getId());
		dto.setNhanvienid(entity.getNhanvien().getId());
		dto.setKhachhangid(entity.getKhachhang().getId());
		dto.setNgaynap(entity.getNgaynap());
		dto.setSotien(entity.getSotien());
		return dto;
	}
}
