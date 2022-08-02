package com.webdaugia.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdaugia.converter.CT_DGConvert;
import com.webdaugia.dto.CT_DGDTO;
import com.webdaugia.entity.CT_DGEntity;
import com.webdaugia.entity.DauGiaEntity;
import com.webdaugia.entity.KhachHangEntity;
import com.webdaugia.repository.CT_DGRepository;
import com.webdaugia.repository.DauGiaRepository;
import com.webdaugia.repository.KhachHangRepository;
import com.webdaugia.service.ICT_DGService;

@Service
public class CT_DGimpl implements ICT_DGService {
	@Autowired
	private CT_DGRepository ctdgRepositoty;
	@Autowired
	private CT_DGConvert ctdgConvert;
	@Autowired
	private KhachHangRepository khachHangRepository;
	@Autowired
	private DauGiaRepository dauGiaRepository;

	@Override
	public List<CT_DGDTO> save(CT_DGDTO dto) {
		DauGiaEntity dgEntity = dauGiaRepository.findOne(dto.getDaugiaid());
		KhachHangEntity khEntity = khachHangRepository.findOne(dto.getKhachhangid());
		List<CT_DGEntity> listctdg = ctdgRepositoty.findAllByDaugia(dgEntity);
		if (listctdg.isEmpty() != true) {
			for (CT_DGEntity item : listctdg) {
				item.setTrangthai("thua");
			}
		}
		CT_DGEntity entity = new CT_DGEntity();
		entity = ctdgConvert.toEntity(dto);
		entity.setDaugia(dgEntity);
		entity.setKhachhang(khEntity);
		listctdg.add(entity);
		for (CT_DGEntity item : listctdg) {
			ctdgRepositoty.save(item);
		}
		listctdg.clear();
		listctdg = ctdgRepositoty.findAllByDaugia(dgEntity);
		List<CT_DGDTO> listdto = new ArrayList<>();
		for (CT_DGEntity item : listctdg) {
			listdto.add(ctdgConvert.toDTO(item));
		}
		return listdto;
	}

	@Override
	public List<CT_DGDTO> getListId(Long id) {
		DauGiaEntity dgEntity = dauGiaRepository.findOne(id);
		List<CT_DGEntity> listctdg = ctdgRepositoty.findAllByDaugia(dgEntity);
		List<CT_DGDTO> listdto = new ArrayList<>();
		for (CT_DGEntity item : listctdg) {
			listdto.add(ctdgConvert.toDTO(item));
		}
		return listdto;
	}

	@Override
	public List<CT_DGDTO> getListId() {
		List<CT_DGEntity> listctdg = ctdgRepositoty.findAllByTrangthai("thắng");
		List<CT_DGDTO> listdto = new ArrayList<>();
		for (CT_DGEntity item : listctdg) {
			listdto.add(ctdgConvert.toDTO(item));
		}
		return listdto;
	}

}
