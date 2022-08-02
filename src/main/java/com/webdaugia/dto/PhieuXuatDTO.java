package com.webdaugia.dto;


public class PhieuXuatDTO {
	private Long id;
	private Long nhanvienid;
	private String hotennv;
	private String ngayxuat;
	private String trangthai;
	private CT_DGDTO ctdg;
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
	
	public String getHotennv() {
		return hotennv;
	}
	public void setHotennv(String hotennv) {
		this.hotennv = hotennv;
	}
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
	public CT_DGDTO getCtdg() {
		return ctdg;
	}
	public void setCtdg(CT_DGDTO ctdg) {
		this.ctdg = ctdg;
	}
	
}
