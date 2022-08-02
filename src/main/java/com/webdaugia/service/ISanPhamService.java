package com.webdaugia.service;

import java.util.List;

import com.webdaugia.dto.SanPhamDTO;

public interface ISanPhamService {
	SanPhamDTO save(SanPhamDTO dto);
	void delete(long[] ids);
	List<SanPhamDTO> getList();
}
