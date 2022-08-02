package com.webdaugia.converter;

import org.springframework.stereotype.Component;

import com.webdaugia.dto.NhanVienDTO;
import com.webdaugia.entity.NhanVienEntity;

@Component
public class NhanVienConvert {
	public NhanVienEntity toEntity(NhanVienDTO dto) {
		NhanVienEntity entity = new NhanVienEntity();
		entity.setHo(dto.getHo());
		entity.setTen(dto.getTen());
		entity.setSdt(dto.getSdt());
		entity.setEmail(dto.getEmail());
		entity.setDiachi(dto.getDiachi());
		entity.setNgaysinh(dto.getNgaysinh());
		entity.setNgaydangky(dto.getNgaydangky());
		return entity;
	}

	public NhanVienDTO toDTO(NhanVienEntity entity) {
		NhanVienDTO dto = new NhanVienDTO();
		dto.setId(entity.getId());
		dto.setHo(entity.getHo());
		dto.setTen(entity.getTen());
		dto.setSdt(entity.getSdt());
		dto.setEmail(entity.getEmail());
		dto.setDiachi(entity.getDiachi());
		dto.setNgaysinh(entity.getNgaysinh());
		dto.setNgaydangky(entity.getNgaydangky());
		dto.setChucvu(entity.getQlnhanvien().getChucvu());
		return dto;
	}

	public NhanVienEntity toEntity(NhanVienDTO dto, NhanVienEntity entity) {
		entity.setHo(dto.getHo());
		entity.setTen(dto.getTen());
		entity.setSdt(dto.getSdt());
		entity.setEmail(dto.getEmail());
		entity.setDiachi(dto.getDiachi());
		entity.setNgaysinh(dto.getNgaysinh());
		entity.setNgaydangky(dto.getNgaydangky());
		return entity;
	}
}
