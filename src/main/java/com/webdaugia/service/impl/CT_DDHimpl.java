package com.webdaugia.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdaugia.converter.CT_DDHConvert;
import com.webdaugia.dto.CT_DDHDTO;
import com.webdaugia.entity.CT_DDHEntity;
import com.webdaugia.entity.DonDatHangEntity;
import com.webdaugia.entity.SanPhamEntity;
import com.webdaugia.repository.CT_DDHRepository;
import com.webdaugia.repository.DonDatHangRepository;
import com.webdaugia.repository.SanPhamRepository;
import com.webdaugia.service.ICT_DDHService;
@Service
public class CT_DDHimpl implements ICT_DDHService {
	@Autowired
	private CT_DDHRepository ctddhRepository;
	@Autowired
	private SanPhamRepository spRepository;
	@Autowired
	private CT_DDHConvert ctddhConvert;
	@Autowired
	private DonDatHangRepository ddhRepository;
	@Override
	public List<CT_DDHDTO> saveList(List<CT_DDHDTO> listDTO, Long id) {
		List<CT_DDHEntity> listEntity= new ArrayList<CT_DDHEntity>();
		DonDatHangEntity ddhEntity= ddhRepository.findOne(id);
		listEntity = ctddhRepository.findAllByDondathang(ddhEntity);
		if(listEntity.isEmpty()) {
			for(CT_DDHDTO item: listDTO) {
				SanPhamEntity sp= spRepository.findOne(item.getSanphamid());
				CT_DDHEntity entity= new CT_DDHEntity();
				entity = ctddhConvert.toEntity(item);
				entity.setSanpham(sp);
				entity.setDondathang(ddhEntity);
				listEntity.add(entity);
			}
		}
		else {
			ctddhRepository.delete(listEntity);
			listEntity.clear();
			for(CT_DDHDTO item: listDTO) {
				SanPhamEntity sp= spRepository.findOne(item.getSanphamid());
				CT_DDHEntity entity= new CT_DDHEntity();
				entity = ctddhConvert.toEntity(item);
				entity.setSanpham(sp);
				entity.setDondathang(ddhEntity);
				listEntity.add(entity);
			}
		}
		ctddhRepository.save(listEntity);
		List<CT_DDHDTO> listResult = new ArrayList<>();
		for(CT_DDHEntity item:listEntity) {
			listResult.add(ctddhConvert.toDTO(item));
		}
		return listResult;
	}

}
