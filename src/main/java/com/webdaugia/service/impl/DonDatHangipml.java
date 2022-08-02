package com.webdaugia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdaugia.converter.DonDatHangConvert;
import com.webdaugia.dto.DonDatHangDTO;
import com.webdaugia.entity.DonDatHangEntity;
import com.webdaugia.entity.NhaCungCapEntity;
import com.webdaugia.entity.NhanVienEntity;
import com.webdaugia.repository.DonDatHangRepository;
import com.webdaugia.repository.NhaCungCapRepository;
import com.webdaugia.repository.NhanVienRepository;
import com.webdaugia.service.IDonDatHangService;

@Service
public class DonDatHangipml implements IDonDatHangService {
	@Autowired
	private DonDatHangConvert ddhConvert;
	@Autowired
	private DonDatHangRepository ddhRepository;
	@Autowired
	private NhanVienRepository nhanVienRepository;
	@Autowired
	private NhaCungCapRepository nccRepository;

	@Override
	public DonDatHangDTO save(DonDatHangDTO dto) {
		DonDatHangEntity entity = new DonDatHangEntity();
		NhanVienEntity nv = nhanVienRepository.findOne(dto.getNhanvienid());
		NhaCungCapEntity ncc = nccRepository.findOneByTenncc(dto.getTenncc());
		if (dto.getId() != null) {
			DonDatHangEntity oldEntity = ddhRepository.findOne(dto.getId());
			entity = ddhConvert.toEntity(oldEntity, dto);
		} else {
			entity = ddhConvert.toEntity(dto);
		}
		entity.setNhanvien(nv);
		entity.setNcc(ncc);
		entity = ddhRepository.save(entity);
		return ddhConvert.toDTO(entity);
	}

	@Override
	public DonDatHangDTO get(Long id) {
		DonDatHangEntity entity = ddhRepository.findOne(id);
		return ddhConvert.toDTO(entity);
	}

}
