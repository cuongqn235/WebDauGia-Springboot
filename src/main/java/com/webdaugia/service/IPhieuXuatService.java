package com.webdaugia.service;

import com.webdaugia.dto.PhieuXuatDTO;

public interface IPhieuXuatService {
	PhieuXuatDTO save(PhieuXuatDTO dto,Long ctdgid);
	PhieuXuatDTO getPX(Long id);
}
