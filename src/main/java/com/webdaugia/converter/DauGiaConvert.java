package com.webdaugia.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webdaugia.dto.CT_DGDTO;
import com.webdaugia.dto.DauGiaDTO;
import com.webdaugia.entity.CT_DGEntity;
import com.webdaugia.entity.DauGiaEntity;

@Component
public class DauGiaConvert {
	@Autowired
	CT_DGConvert ctdgConvert;
	public DauGiaEntity toEntity(DauGiaDTO dto) {
		DauGiaEntity entity = new DauGiaEntity();
		entity.setGiatoithieu(dto.getGiatoithieu());
		entity.setNgaytao(dto.getNgaytao());
		return entity;
	}
	public DauGiaDTO toDTO(DauGiaEntity entity) {
		List<CT_DGDTO> listdto = new ArrayList<>();
		DauGiaDTO dto= new DauGiaDTO();
		dto.setId(entity.getId());
		dto.setNgaytao(entity.getNgaytao());
		dto.setGiatoithieu(entity.getGiatoithieu());
		dto.setNhanvienid(entity.getNhanvien().getId());
		dto.setTensp(entity.getSanpham().getTensp());
		for (CT_DGEntity item : entity.getListctdg()) {
			listdto.add(ctdgConvert.toDTO(item));
		}
		dto.setListctdg(listdto);
		return dto;
	}
}
