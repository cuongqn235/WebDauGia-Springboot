package com.webdaugia.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webdaugia.dto.PhieuXuatDTO;
import com.webdaugia.entity.PhieuXuatEntity;

@Component
public class PhieuXuatConvert {
	@Autowired
	private CT_DGConvert ctdgConvert;
	public PhieuXuatDTO toDTO(PhieuXuatEntity entity) {
		PhieuXuatDTO dto= new PhieuXuatDTO();
		dto.setId(entity.getId());
		dto.setNgayxuat(entity.getNgayxuat());
		dto.setNhanvienid(entity.getNhanvien().getId());
		dto.setHotennv(entity.getNhanvien().getHo()+" "+entity.getNhanvien().getTen());
		dto.setTrangthai(entity.getTrangthai());
		dto.setCtdg(ctdgConvert.toDTO(entity.getCtdg()));
		return dto;
	}
	public PhieuXuatEntity toEntity(PhieuXuatDTO dto) {
		PhieuXuatEntity entity= new PhieuXuatEntity();
		entity.setNgayxuat(dto.getNgayxuat());
		entity.setTrangthai(dto.getTrangthai());
		return entity;
	}
	public PhieuXuatEntity toEntity(PhieuXuatEntity entity,PhieuXuatDTO dto) {
		entity.setNgayxuat(dto.getNgayxuat());
		entity.setTrangthai(dto.getTrangthai());
		return entity;
	}
}
