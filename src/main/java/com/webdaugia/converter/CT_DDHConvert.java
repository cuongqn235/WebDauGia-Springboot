package com.webdaugia.converter;

import org.springframework.stereotype.Component;

import com.webdaugia.dto.CT_DDHDTO;
import com.webdaugia.entity.CT_DDHEntity;

@Component
public class CT_DDHConvert {
	public CT_DDHDTO toDTO(CT_DDHEntity entity) {
		CT_DDHDTO dto = new CT_DDHDTO();
		dto.setId(entity.getId());
		dto.setDondathangid(entity.getDondathang().getId());
		dto.setSanphamid(entity.getSanpham().getId());
		dto.setSoluong(entity.getSoluong());
		dto.setDonggia(entity.getDongia());
		dto.setTensp(entity.getSanpham().getTensp());
		return dto;
	}
	public CT_DDHEntity toEntity(CT_DDHDTO dto) {
		CT_DDHEntity entity = new CT_DDHEntity();
		entity.setSoluong(dto.getSoluong());
		entity.setDongia(dto.getDonggia());
		return entity;
	}
	public CT_DDHEntity toEntity(CT_DDHEntity entity,CT_DDHDTO dto) {
		entity.setSoluong(dto.getSoluong());
		entity.setDongia(dto.getDonggia());
		return entity;
	}
}
