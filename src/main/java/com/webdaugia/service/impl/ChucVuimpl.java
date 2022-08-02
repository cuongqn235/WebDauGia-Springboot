package com.webdaugia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdaugia.converter.ChucVuConvert;
import com.webdaugia.dto.ChucVuDTO;
import com.webdaugia.entity.ChucVuEntity;
import com.webdaugia.repository.ChucVuRepository;
import com.webdaugia.service.IChucVuService;
@Service
public class ChucVuimpl implements IChucVuService {
	@Autowired
	private ChucVuRepository cvRepository;
	@Autowired
	private ChucVuConvert cvConvert;

	@Override
	public ChucVuDTO save(ChucVuDTO dto) {
		ChucVuEntity entity = cvRepository.findOneByChucvu(dto.getChucvu());
		if (entity == null) {
			entity = cvConvert.toEntity(dto);
			cvRepository.save(entity);
		}
		return cvConvert.toDTO(entity);
	}

	@Override
	public void delete(ChucVuDTO dto) {
		ChucVuEntity entity = cvRepository.findOneByChucvu(dto.getChucvu());
		cvRepository.delete(entity);
	}

}
