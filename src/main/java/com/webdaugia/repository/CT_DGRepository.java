package com.webdaugia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdaugia.entity.CT_DGEntity;
import com.webdaugia.entity.DauGiaEntity;

public interface CT_DGRepository extends JpaRepository<CT_DGEntity, Long> {
	List<CT_DGEntity> findAllByDaugia(DauGiaEntity daugia);
	List<CT_DGEntity> findAllByTrangthai(String trangthai);
}
