package com.webdaugia.converter;

import org.springframework.stereotype.Component;

import com.webdaugia.dto.TaiKhoanDTO;
import com.webdaugia.entity.TaiKhoanEntity;

@Component
public class TaiKhoanConvert {
	public TaiKhoanDTO toDTO(TaiKhoanEntity entity) {
		TaiKhoanDTO dto= new TaiKhoanDTO();
		dto.setTaikhoan(entity.getTaikhoan());
		dto.setMatkhau(entity.getMatkhau());
		return dto;
	}
	public TaiKhoanEntity toEntity(TaiKhoanDTO dto) {
		TaiKhoanEntity entity= new TaiKhoanEntity();
		entity.setTaikhoan(dto.getTaikhoan());
		entity.setMatkhau(dto.getMatkhau());
		return entity;
	}
	public TaiKhoanEntity toEntity(TaiKhoanEntity entity,TaiKhoanDTO dto) {
		entity.setMatkhau(dto.getMatkhau());
		return entity;
	}
}
