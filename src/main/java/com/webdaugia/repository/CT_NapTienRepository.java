package com.webdaugia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdaugia.entity.CT_NapTienEntiy;
import com.webdaugia.entity.KhachHangEntity;

public interface CT_NapTienRepository extends JpaRepository<CT_NapTienEntiy, Long>{
	List<CT_NapTienEntiy> findAllByKhachhang(KhachHangEntity kh);
}
