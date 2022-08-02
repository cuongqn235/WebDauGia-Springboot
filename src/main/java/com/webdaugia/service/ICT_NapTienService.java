package com.webdaugia.service;

import java.util.List;

import com.webdaugia.dto.CT_NapTienDTO;

public interface ICT_NapTienService {
	CT_NapTienDTO save(CT_NapTienDTO dto);
	List<CT_NapTienDTO> getCTNapTien(String sdt);
}
