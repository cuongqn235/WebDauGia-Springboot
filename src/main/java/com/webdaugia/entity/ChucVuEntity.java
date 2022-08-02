package com.webdaugia.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="QuanLyNhanVien")
public class ChucVuEntity extends BaseEntity {
	@Column(name="chucvu")
	private String chucvu;
	@OneToMany(mappedBy = "qlnhanvien", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<NhanVienEntity> listnhanvien = new ArrayList<>();
	
	
	public List<NhanVienEntity> getListnhanvien() {
		return listnhanvien;
	}

	public void setListnhanvien(List<NhanVienEntity> listnhanvien) {
		this.listnhanvien = listnhanvien;
	}

	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
}
