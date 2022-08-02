package com.webdaugia.dto;


public class SanPhamDTO {
	private Long id;
	private String tensp;
	private int soluong;
	private String chitiet;
	private String hinhanh;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getChitiet() {
		return chitiet;
	}
	public void setChitiet(String chitiet) {
		this.chitiet = chitiet;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}	
}
