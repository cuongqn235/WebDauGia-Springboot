package com.webdaugia.service.impl;

//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdaugia.converter.NhanVienConvert;
import com.webdaugia.dto.NhanVienDTO;
import com.webdaugia.entity.NhanVienEntity;
import com.webdaugia.entity.ChucVuEntity;
import com.webdaugia.repository.NhanVienRepository;
import com.webdaugia.repository.QL_NhanVienRepository;
import com.webdaugia.service.INhanVienService;

@Service
public class NhanVienimpl implements INhanVienService {
	@Autowired
	private NhanVienRepository nvRepositoy;

	@Autowired
	private NhanVienConvert nvConvert;
	@Autowired
	private QL_NhanVienRepository qlnvRepository;

	@Override
	public NhanVienDTO save(NhanVienDTO dto) {
		NhanVienEntity entity = new NhanVienEntity();
		if (dto.getId() != null) {
			NhanVienEntity oldEntity = nvRepositoy.findOne(dto.getId());
			entity = nvConvert.toEntity(dto, oldEntity);
		} else {
			entity = nvConvert.toEntity(dto);
		}
		ChucVuEntity qlnvEntity= qlnvRepository.findOneByChucvu(dto.getChucvu());
		entity.setQlnhanvien(qlnvEntity);
		entity = nvRepositoy.save(entity);
		System.out.println(nvConvert.toDTO(entity));
		return nvConvert.toDTO(entity);
	}

//	@Override
//	public List<NhanVienDTO> getList() {
//		List<NhanVienDTO> listDTO = new ArrayList<NhanVienDTO>();
//		List<NhanVienEntity> listEntity = nvRepositoy.findAll();
//		for(NhanVienEntity item: listEntity) {
//			listDTO.add(nvConvert.toDTO(item));
//		}
//		return listDTO;
//	}

	@Override
	public void delete(long[] ids) {
		for(Long item:ids) {
			nvRepositoy.delete(item);
		}

	}

	@Override
	public NhanVienDTO get(long id) {
		NhanVienEntity entity = nvRepositoy.findOne(id);
		return nvConvert.toDTO(entity);
	}

}
