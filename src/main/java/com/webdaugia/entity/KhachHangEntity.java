package com.webdaugia.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="KhachHang")
public class KhachHangEntity{
	@Id
	@Column(name="sdt")
	private String id;
	@Column(name="ho")
	private String ho;
	@Column(name="ten")
	private String ten;
	@Column(name="email")
	private String email;
	@Column(name="ngaysinh")
	private String ngaysinh;
	@Column(name="diachi")
	private String diachi;
	@Column(name="sotien")
	private int sotien;
	@Column(name="matkhau")
	private String matkhau;
	@Column(name="ngaydangky")
	private String ngaydangky;
	@OneToMany(mappedBy = "khachhang", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CT_DGEntity> listctdg = new ArrayList<>();
	@OneToMany(mappedBy = "khachhang", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CT_NapTienEntiy> listctnt = new ArrayList<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getSotien() {
		return sotien;
	}
	public void setSotien(int sotien) {
		this.sotien = sotien;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getNgaydangky() {
		return ngaydangky;
	}
	public void setNgaydangky(String ngaydangky) {
		this.ngaydangky = ngaydangky;
	}
	public List<CT_DGEntity> getListctdg() {
		return listctdg;
	}
	public void setListctdg(List<CT_DGEntity> listctdg) {
		this.listctdg = listctdg;
	}
	public List<CT_NapTienEntiy> getListctnt() {
		return listctnt;
	}
	public void setListctnt(List<CT_NapTienEntiy> listctnt) {
		this.listctnt = listctnt;
	}
	
	
}
