package com.webdaugia.service;

import com.webdaugia.dto.DonDatHangDTO;

public interface IDonDatHangService {
	DonDatHangDTO save(DonDatHangDTO dto);
	DonDatHangDTO get(Long id);
}
