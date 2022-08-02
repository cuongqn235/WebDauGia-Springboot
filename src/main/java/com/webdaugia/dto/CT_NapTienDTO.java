package com.webdaugia.dto;

public class CT_NapTienDTO {
	private Long id;
	private Long nhanvienid;
	private String khachhangid;
	private String ngaynap;
	private float sotien;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNhanvienid() {
		return nhanvienid;
	}
	public void setNhanvienid(Long nhanvienid) {
		this.nhanvienid = nhanvienid;
	}
	public String getKhachhangid() {
		return khachhangid;
	}
	public void setKhachhangid(String khachhangid) {
		this.khachhangid = khachhangid;
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
