package com.webdaugia.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdaugia.converter.KhachHangConvert;
import com.webdaugia.dto.KhachHangDTO;
import com.webdaugia.entity.KhachHangEntity;
import com.webdaugia.repository.KhachHangRepository;
import com.webdaugia.service.IKhachHangService;
@Service
public class KhachHangimpl implements IKhachHangService {
	@Autowired
	private KhachHangRepository khRepository;
	
	@Autowired
	private KhachHangConvert khConvert;
	@Override
	public KhachHangDTO save(KhachHangDTO kh) {
		KhachHangEntity entity= new KhachHangEntity();
		if (khRepository.findOne(kh.getId()) != null) {
			KhachHangEntity oldEntity= khRepository.findOne(kh.getId());
			entity= khConvert.toEntity(kh, oldEntity);
		} else {
			entity= khConvert.toEntity(kh);
		}
		entity=khRepository.save(entity);
		return khConvert.toDTO(entity);
	}
	@Override
	public void delete(String[] ids) {
		for(String item: ids) {
			khRepository.delete(item);
		}
	}
	@Override
	public List<KhachHangDTO> getList() {
		List<KhachHangEntity> listEntity = new ArrayList<>();
		List<KhachHangDTO> listDTO = new ArrayList<>();
		listEntity = khRepository.findAll();
		for(int i=0; i<listEntity.size();i++) {
			listDTO.add(khConvert.toDTO(listEntity.get(i)));
		}
		return listDTO;
	}
	@Override
	public KhachHangDTO get(String id) {
		return khConvert.toDTO(khRepository.findOne(id));
	}
	

}
