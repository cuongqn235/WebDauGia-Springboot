package com.webdaugia.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PhieuXuat")
public class PhieuXuatEntity extends BaseEntity {
	@Column(name="ngayxuat")
	private String ngayxuat;
	@Column(name="trangthai")
	private String trangthai;
	@ManyToOne(fetch = FetchType.LAZY)
	private NhanVienEntity nhanvien;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ctdg_id")
    private CT_DGEntity ctdg;
	public String getNgayxuat() {
		return ngayxuat;
	}
	public void setNgayxuat(String ngayxuat) {
		this.ngayxuat = ngayxuat;
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
	public CT_DGEntity getCtdg() {
		return ctdg;
	}
	public void setCtdg(CT_DGEntity ctdg) {
		this.ctdg = ctdg;
	}
	

}
