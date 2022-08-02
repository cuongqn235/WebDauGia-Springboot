package com.webdaugia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webdaugia.converter.DauGiaConvert;
import com.webdaugia.dto.DauGiaDTO;
import com.webdaugia.entity.DauGiaEntity;
import com.webdaugia.entity.NhanVienEntity;
import com.webdaugia.entity.SanPhamEntity;
import com.webdaugia.repository.DauGiaRepository;
import com.webdaugia.repository.NhanVienRepository;
import com.webdaugia.repository.SanPhamRepository;
import com.webdaugia.service.IDauGiaService;

@Service
public class DauGiaimpl implements IDauGiaService {
	@Autowired
	private DauGiaRepository dauGiaRepository;
	@Autowired
	private DauGiaConvert dauGiaConvert;
	@Autowired
	private NhanVienRepository nhanVienRepository;
	@Autowired
	private SanPhamRepository sanPhamRepository;

	@Override
	public DauGiaDTO save(DauGiaDTO dto) {
		DauGiaEntity entity = new DauGiaEntity();
		NhanVienEntity nv = nhanVienRepository.findOne(dto.getNhanvienid());
		SanPhamEntity sp = sanPhamRepository.findOneByTensp(dto.getTensp());
		entity = dauGiaConvert.toEntity(dto);
		entity.setNhanvien(nv);
		entity.setSanpham(sp);
		dauGiaRepository.save(entity);
		return dauGiaConvert.toDTO(entity);
	}

	@Override
	public DauGiaDTO getId(Long id) {
		DauGiaEntity entity = dauGiaRepository.findOne(id);
		return dauGiaConvert.toDTO(entity);
	}

}
