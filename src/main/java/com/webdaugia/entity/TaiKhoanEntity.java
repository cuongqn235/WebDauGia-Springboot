package com.webdaugia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TaiKhoan")
public class TaiKhoanEntity{
	@Id
	private String taikhoan;
	@Column(name="matkhau")
	private String matkhau;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nhanvien_id")
    private NhanVienEntity nhanvien;
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public NhanVienEntity getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVienEntity nhanvien) {
		this.nhanvien = nhanvien;
	}
	
}
