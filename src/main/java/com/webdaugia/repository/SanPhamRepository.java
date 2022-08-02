package com.webdaugia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdaugia.entity.SanPhamEntity;

public interface SanPhamRepository extends JpaRepository<SanPhamEntity, Long> {
	SanPhamEntity findOneByTensp(String tensp);
}
