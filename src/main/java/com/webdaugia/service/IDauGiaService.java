package com.webdaugia.service;

import com.webdaugia.dto.DauGiaDTO;

public interface IDauGiaService {
	DauGiaDTO save(DauGiaDTO dto);
	DauGiaDTO getId(Long id);
}
