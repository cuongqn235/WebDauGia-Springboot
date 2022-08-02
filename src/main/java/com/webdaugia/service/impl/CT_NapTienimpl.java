package com.webdaugia.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webdaugia.converter.CT_NapTienConvert;
import com.webdaugia.dto.CT_NapTienDTO;
import com.webdaugia.entity.CT_NapTienEntiy;
import com.webdaugia.entity.KhachHangEntity;
import com.webdaugia.entity.NhanVienEntity;
import com.webdaugia.repository.CT_NapTienRepository;
import com.webdaugia.repository.KhachHangRepository;
import com.webdaugia.repository.NhanVienRepository;
import com.webdaugia.service.ICT_NapTienService;

@Service
public class CT_NapTienimpl implements ICT_NapTienService {
	@Autowired
	private CT_NapTienRepository ctntRepository;
	@Autowired
	private NhanVienRepository nvRepository;
	@Autowired
	private KhachHangRepository khRepository;
	@Autowired
	private CT_NapTienConvert ctntConvert;

	@Override
	public CT_NapTienDTO save(CT_NapTienDTO dto) {
		CT_NapTienEntiy entity = new CT_NapTienEntiy();
		if (dto.getId() != null) {
			CT_NapTienEntiy oldEntity = ctntRepository.findOne(dto.getId());
			entity = ctntConvert.toEntity(oldEntity, dto);
		} else {
			entity = ctntConvert.toEntity(dto);
		}
		KhachHangEntity kh = khRepository.findOne(dto.getKhachhangid());
		NhanVienEntity nv = nvRepository.findOne(dto.getNhanvienid());
		entity.setKhachhang(kh);
		entity.setNhanvien(nv);
		ctntRepository.save(entity);
		return ctntConvert.toDTO(entity);
	}

	@Override
	public List<CT_NapTienDTO> getCTNapTien(String sdt) {
		KhachHangEntity kh = khRepository.findOne(sdt);
		List<CT_NapTienEntiy> listEntity= ctntRepository.findAllByKhachhang(kh);
		List<CT_NapTienDTO> listDTO= new ArrayList<CT_NapTienDTO>();
		for(CT_NapTienEntiy item: listEntity) {
			CT_NapTienDTO dto= new CT_NapTienDTO();
			dto= ctntConvert.toDTO(item);
			listDTO.add(dto);
		}
		return listDTO;
	}

}
