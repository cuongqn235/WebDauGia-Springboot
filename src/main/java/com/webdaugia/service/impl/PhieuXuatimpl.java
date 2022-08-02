package com.webdaugia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdaugia.converter.PhieuXuatConvert;
import com.webdaugia.dto.PhieuXuatDTO;
import com.webdaugia.entity.CT_DGEntity;
import com.webdaugia.entity.NhanVienEntity;
import com.webdaugia.entity.PhieuXuatEntity;
import com.webdaugia.repository.CT_DGRepository;
import com.webdaugia.repository.NhanVienRepository;
import com.webdaugia.repository.PhieuXuatRepository;
import com.webdaugia.service.IPhieuXuatService;
@Service
public class PhieuXuatimpl implements IPhieuXuatService {
	@Autowired
	PhieuXuatRepository pxRepository;
	@Autowired
	NhanVienRepository nvRepository;
	@Autowired
	CT_DGRepository ctdgRepository;
	@Autowired
	PhieuXuatConvert pxConvert;
	@Override
	public PhieuXuatDTO save(PhieuXuatDTO dto,Long ctdgid) {
		PhieuXuatEntity entity= new PhieuXuatEntity();
		if(dto.getId()!= null) {
			PhieuXuatEntity oldEntity= pxRepository.findOne(dto.getId());
			entity= pxConvert.toEntity(oldEntity, dto);
		}
		else {
			entity= pxConvert.toEntity(dto);
		}
		NhanVienEntity nvEntity= nvRepository.findOne(dto.getNhanvienid());
		CT_DGEntity ctdgEntity= ctdgRepository.findOne(ctdgid);
		entity.setCtdg(ctdgEntity);
		entity.setNhanvien(nvEntity);
		entity=pxRepository.save(entity);
		return pxConvert.toDTO(entity);
	}

	@Override
	public PhieuXuatDTO getPX(Long id) {
		PhieuXuatEntity entity= pxRepository.findOne(id);
		return pxConvert.toDTO(entity);
	}

}
