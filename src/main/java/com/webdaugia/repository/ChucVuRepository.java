package com.webdaugia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdaugia.entity.ChucVuEntity;

public interface ChucVuRepository extends JpaRepository<ChucVuEntity, Long> {
	ChucVuEntity findOneByChucvu(String chucvu);
}
