package com.webdaugia.converter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webdaugia.dto.CT_DDHDTO;
import com.webdaugia.dto.DonDatHangDTO;
import com.webdaugia.entity.CT_DDHEntity;
import com.webdaugia.entity.DonDatHangEntity;
@Component
public class DonDatHangConvert {
	@Autowired
	private CT_DDHConvert ctddhConvert;
	public DonDatHangDTO toDTO(DonDatHangEntity entity) {
		DonDatHangDTO dto= new DonDatHangDTO();
		dto.setId(entity.getId());
		dto.setTenncc(entity.getNcc().getTenncc());
		dto.setNhanvienid(entity.getNhanvien().getId());
		dto.setNgaydat(entity.getNgaydat());
		dto.setTrangthai(entity.getTrangthai());
		List<CT_DDHDTO> listResult = new ArrayList<>();
		for(CT_DDHEntity item:entity.getListctddh()) {
			listResult.add(ctddhConvert.toDTO(item));
		}
		dto.setListctddh(listResult);
		return dto;
	}
	public DonDatHangEntity toEntity(DonDatHangDTO dto) {
		DonDatHangEntity entity= new DonDatHangEntity();
		entity.setNgaydat(dto.getNgaydat());
		entity.setTrangthai(dto.getTrangthai());
		return entity;
	}
	public DonDatHangEntity toEntity(DonDatHangEntity entity,DonDatHangDTO dto) {
		entity.setNgaydat(dto.getNgaydat());
		entity.setTrangthai(dto.getTrangthai());
		return entity;
	}
}
