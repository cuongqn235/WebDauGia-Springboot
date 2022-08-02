package com.webdaugia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdaugia.converter.TaiKhoanConvert;
import com.webdaugia.dto.ResuftDTO;
import com.webdaugia.dto.TaiKhoanDTO;
import com.webdaugia.entity.NhanVienEntity;
import com.webdaugia.entity.TaiKhoanEntity;
import com.webdaugia.repository.NhanVienRepository;
import com.webdaugia.repository.TaiKhoanRepository;
import com.webdaugia.service.ITaikhoanService;
@Service
public class TaiKhoanimpl implements ITaikhoanService {
	@Autowired
	private TaiKhoanRepository tkRepository;
	@Autowired
	private NhanVienRepository nvRepository;
	@Autowired
	private TaiKhoanConvert tkConvert;
	@Override
	public TaiKhoanDTO save(TaiKhoanDTO dto) {
		NhanVienEntity nv= nvRepository.findOne(dto.getNhanvienid());
		TaiKhoanEntity entity= new TaiKhoanEntity();
		entity= tkConvert.toEntity(dto);
		entity.setNhanvien(nv);
		tkRepository.save(entity);
		return tkConvert.toDTO(entity);
	}

	@Override
	public ResuftDTO UpdatePass(TaiKhoanDTO dto) {
		ResuftDTO resuft = new ResuftDTO();
		NhanVienEntity nv= nvRepository.findOne(dto.getNhanvienid());
		TaiKhoanEntity entity= new TaiKhoanEntity();
		TaiKhoanEntity oldEntity= tkRepository.findOne(dto.getTaikhoan());
		entity= tkConvert.toEntity(oldEntity,dto);
		entity.setNhanvien(nv);
		tkRepository.save(entity);
		resuft.setTrangthai("Thay đổi thành công");
		return resuft;
	}

	@Override
	public ResuftDTO CheckUserName(String username) {
		ResuftDTO resuft = new ResuftDTO();
		TaiKhoanEntity entity= tkRepository.findOne(username);
		if(entity!= null) {
			resuft.setTrangthai("Tài khoản đã tồn tại");
			return resuft;
		}
		else {
			resuft.setTrangthai("Tài khoản có thể dùng");
			return resuft;
		}
		
	}

}
