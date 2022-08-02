package com.webdaugia.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdaugia.converter.SanPhamConvert;
import com.webdaugia.dto.SanPhamDTO;
import com.webdaugia.entity.SanPhamEntity;
import com.webdaugia.repository.SanPhamRepository;
import com.webdaugia.service.ISanPhamService;
@Service
public class SanPhamipml implements ISanPhamService {
	@Autowired
	private SanPhamRepository spRepository;
	@Autowired
	private SanPhamConvert spConvert;
	@Override
	public SanPhamDTO save(SanPhamDTO dto) {
		SanPhamEntity entity = new SanPhamEntity();
		if(dto.getId() != null) {
			SanPhamEntity oldEntity = spRepository.findOne(dto.getId());
			entity = spConvert.toEntity(dto,oldEntity);
		}
		else {
			entity = spConvert.toEntity(dto);
		}
		entity = spRepository.save(entity);
		return spConvert.toDTO(entity);
	}

	@Override
	public void delete(long[] ids) {
		for(Long item: ids) {
			spRepository.delete(item);
		}
		
	}

	@Override
	public List<SanPhamDTO> getList() {
		List<SanPhamEntity> listEntity= spRepository.findAll();
		List<SanPhamDTO> listDTO= new ArrayList<>();
		for(SanPhamEntity item: listEntity) {
			listDTO.add(spConvert.toDTO(item));
		}
		return listDTO;
	}

}
