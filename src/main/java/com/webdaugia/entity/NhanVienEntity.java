package com.webdaugia.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="NhanVien")
public class NhanVienEntity extends BaseEntity {
	@Column(name="ho")
	private String ho;
	@Column(name="ten")
	private String ten;
	@Column(name="sdt")
	private String sdt;
	@Column(name="email")
	private String email;
	@Column(name="diachi")
	private String diachi;
	@Column(name="ngaysinh")
	private String ngaysinh;
	@Column(name="ngaydangky")
	private String ngaydangky;
	@OneToOne(mappedBy = "nhanvien", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private TaiKhoanEntity taikhoan;
	@ManyToOne(fetch = FetchType.LAZY)
	private ChucVuEntity qlnhanvien;
	@OneToMany(mappedBy = "nhanvien", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DonDatHangEntity> listddh = new ArrayList<>();
	@OneToMany(mappedBy = "nhanvien", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PhieuXuatEntity> listpx = new ArrayList<>();
	@OneToMany(mappedBy = "nhanvien", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DauGiaEntity> listdg = new ArrayList<>();
	@OneToMany(mappedBy = "nhanvien", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CT_NapTienEntiy> listctnt = new ArrayList<>();
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getNgaydangky() {
		return ngaydangky;
	}
	public void setNgaydangky(String ngaydangky) {
		this.ngaydangky = ngaydangky;
	}
	public TaiKhoanEntity getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(TaiKhoanEntity taikhoan) {
		this.taikhoan = taikhoan;
	}
	public ChucVuEntity getQlnhanvien() {
		return qlnhanvien;
	}
	public void setQlnhanvien(ChucVuEntity qlnhanvien) {
		this.qlnhanvien = qlnhanvien;
	}
	public List<DonDatHangEntity> getListddh() {
		return listddh;
	}
	public void setListddh(List<DonDatHangEntity> listddh) {
		this.listddh = listddh;
	}
	public List<PhieuXuatEntity> getListpx() {
		return listpx;
	}
	public void setListpx(List<PhieuXuatEntity> listpx) {
		this.listpx = listpx;
	}
	public List<DauGiaEntity> getListdg() {
		return listdg;
	}
	public void setListdg(List<DauGiaEntity> listdg) {
		this.listdg = listdg;
	}
	public List<CT_NapTienEntiy> getListctnt() {
		return listctnt;
	}
	public void setListctnt(List<CT_NapTienEntiy> listctnt) {
		this.listctnt = listctnt;
	}
	
	
}
