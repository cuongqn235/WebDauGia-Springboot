package com.webdaugia.converter;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webdaugia.dto.CT_DGDTO;
import com.webdaugia.dto.KhachHangDTO;
import com.webdaugia.entity.CT_DGEntity;
import com.webdaugia.entity.KhachHangEntity;

@Component
public class KhachHangConvert {
	@Autowired
	CT_DGConvert ctdgConvert;
	public KhachHangEntity toEntity(KhachHangDTO dto) {
		KhachHangEntity entity = new KhachHangEntity();
		entity.setId(dto.getId());
		entity.setDiachi(dto.getDiachi());
		entity.setEmail(dto.getEmail());
		entity.setHo(dto.getHo());
		entity.setTen(dto.getTen());
		entity.setMatkhau(dto.getMatkhau());
		entity.setNgaysinh(dto.getNgaysinh());
		entity.setSotien(dto.getSotien());
		entity.setNgaydangky(dto.getNgaydangky());
		return entity;
	}

	public KhachHangDTO toDTO(KhachHangEntity entity) {
		List<CT_DGDTO> listdto = new ArrayList<>();
		KhachHangDTO dto = new KhachHangDTO();
		dto.setId(entity.getId());
		dto.setDiachi(entity.getDiachi());
		dto.setEmail(entity.getEmail());
		dto.setHo(entity.getHo());
		dto.setTen(entity.getTen());
		dto.setMatkhau(entity.getMatkhau());
		dto.setNgaysinh(entity.getNgaysinh());
		dto.setSotien(entity.getSotien());
		dto.setId(entity.getId());
		dto.setNgaydangky(entity.getNgaydangky());
		for (CT_DGEntity item : entity.getListctdg()) {
			listdto.add(ctdgConvert.toDTO(item));
		}
		dto.setListctdg(listdto);
		return dto;
	}

	public KhachHangEntity toEntity(KhachHangDTO dto, KhachHangEntity entity) {
		entity.setDiachi(dto.getDiachi());
		entity.setEmail(dto.getEmail());
		entity.setHo(dto.getHo());
		entity.setTen(dto.getTen());
		entity.setMatkhau(dto.getMatkhau());
		entity.setNgaysinh(dto.getNgaysinh());
		entity.setSotien(dto.getSotien());
		entity.setId(dto.getId());
		entity.setNgaydangky(dto.getNgaydangky());
		return entity;
	}
}
