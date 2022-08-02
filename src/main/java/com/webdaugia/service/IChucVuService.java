package com.webdaugia.service;

import com.webdaugia.dto.ChucVuDTO;

public interface IChucVuService {
	ChucVuDTO save(ChucVuDTO dto);
	void delete(ChucVuDTO dto);
}
