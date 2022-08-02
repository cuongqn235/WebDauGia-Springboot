package com.webdaugia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdaugia.entity.NhaCungCapEntity;

public interface NhaCungCapRepository extends JpaRepository<NhaCungCapEntity, Long> {
	NhaCungCapEntity findOneByTenncc(String tenncc);
}
