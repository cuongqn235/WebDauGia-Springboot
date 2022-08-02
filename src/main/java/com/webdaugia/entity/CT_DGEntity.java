package com.webdaugia.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CtDauGia")
public class CT_DGEntity extends BaseEntity {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "khachhang")
	private KhachHangEntity khachhang;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "daugia")
	private DauGiaEntity daugia;
	@Column(name = "thoigian")
	private String thoigian;
	@Column(name = "giadau")
	private float giadau;
	@Column(name = "trangthai")
	private String trangthai;
	@OneToOne(mappedBy = "ctdg", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private PhieuXuatEntity phieuxuat;
	public KhachHangEntity getKhachhang() {
		return khachhang;
	}
	public void setKhachhang(KhachHangEntity khachhang) {
		this.khachhang = khachhang;
	}
	public DauGiaEntity getDaugia() {
		return daugia;
	}
	public void setDaugia(DauGiaEntity daugia) {
		this.daugia = daugia;
	}
	public String getThoigian() {
		return thoigian;
	}
	public void setThoigian(String thoigian) {
		this.thoigian = thoigian;
	}
	public float getGiadau() {
		return giadau;
	}
	public void setGiadau(float giadau) {
		this.giadau = giadau;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public PhieuXuatEntity getPhieuxuat() {
		return phieuxuat;
	}
	public void setPhieuxuat(PhieuXuatEntity phieuxuat) {
		this.phieuxuat = phieuxuat;
	}
	
	
}
