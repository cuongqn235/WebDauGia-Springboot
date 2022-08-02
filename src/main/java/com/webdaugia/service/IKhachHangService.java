package com.webdaugia.service;

import java.util.List;

import com.webdaugia.dto.KhachHangDTO;

public interface IKhachHangService {
	KhachHangDTO save(KhachHangDTO kh);
	List<KhachHangDTO> getList();
	void delete(String[] ids);
	KhachHangDTO get(String id);
	
}
