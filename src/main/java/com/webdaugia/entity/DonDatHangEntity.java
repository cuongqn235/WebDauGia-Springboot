package com.webdaugia.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DonDatHang")
public class DonDatHangEntity extends BaseEntity {
	@Column(name="ngaydat")
	private String ngaydat;
	@Column(name="trangthai")
	private String trangthai;
	@ManyToOne(fetch = FetchType.LAZY)
	private NhanVienEntity nhanvien;
	@ManyToOne(fetch = FetchType.LAZY)
	private NhaCungCapEntity ncc;
	@OneToMany(mappedBy = "dondathang", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CT_DDHEntity> listctddh = new ArrayList<>();
	public String getNgaydat() {
		return ngaydat;
	}
	public void setNgaydat(String ngaydat) {
		this.ngaydat = ngaydat;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public NhanVienEntity getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVienEntity nhanvien) {
		this.nhanvien = nhanvien;
	}
	public NhaCungCapEntity getNcc() {
		return ncc;
	}
	public void setNcc(NhaCungCapEntity ncc) {
		this.ncc = ncc;
	}
	public List<CT_DDHEntity> getListctddh() {
		return listctddh;
	}
	public void setListctddh(List<CT_DDHEntity> listctddh) {
		this.listctddh = listctddh;
	}
	
	
	
}
