package com.webdaugia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdaugia.entity.CT_DDHEntity;
import com.webdaugia.entity.DonDatHangEntity;

public interface CT_DDHRepository extends JpaRepository<CT_DDHEntity, Long> {
	List<CT_DDHEntity> findAllByDondathang(DonDatHangEntity dondathang);
}
