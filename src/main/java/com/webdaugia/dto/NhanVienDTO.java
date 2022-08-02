package com.webdaugia.dto;


public class NhanVienDTO extends PersonDTO {
	private Long id;
	private String sdt;
	private String chucvu;
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
}
