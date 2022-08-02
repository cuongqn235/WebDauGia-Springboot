package com.webdaugia.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CtNapTien")
public class CT_NapTienEntiy extends BaseEntity {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="nhanvien")
	private NhanVienEntity nhanvien;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="khachhang")
	private KhachHangEntity khachhang;
	@Column(name="ngaynap")
	private String ngaynap;
	@Column(name="sotien")
	private float sotien;
	public NhanVienEntity getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVienEntity nhanvien) {
		this.nhanvien = nhanvien;
	}
	public KhachHangEntity getKhachhang() {
		return khachhang;
	}
	public void setKhachhang(KhachHangEntity khachhang) {
		this.khachhang = khachhang;
	}
	public String getNgaynap() {
		return ngaynap;
	}
	public void setNgaynap(String ngaynap) {
		this.ngaynap = ngaynap;
	}
	public float getSotien() {
		return sotien;
	}
	public void setSotien(float sotien) {
		this.sotien = sotien;
	}
	
}
