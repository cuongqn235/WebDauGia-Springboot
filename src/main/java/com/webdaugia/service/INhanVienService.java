package com.webdaugia.service;

//import java.util.List;

import com.webdaugia.dto.NhanVienDTO;

public interface INhanVienService {
	NhanVienDTO save(NhanVienDTO nv);
//	List<NhanVienDTO> getList();
	NhanVienDTO get(long id);
	void delete(long[] ids);
}
