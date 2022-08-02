package com.webdaugia.dto;

import java.util.ArrayList;
import java.util.List;

public class DonDatHangDTO {
	private Long id;
	private Long nhanvienid;
	private String tenncc;
	private String ngaydat;
	private String trangthai;
	private List<CT_DDHDTO> listctddh = new ArrayList<>();
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
	
	public String getTenncc() {
		return tenncc;
	}
	public void setTenncc(String tenncc) {
		this.tenncc = tenncc;
	}
	public String getNgaydat() {
		return ngaydat;
	}
	public void setNgaydat(String ngaydat) {
		this.ngaydat = ngaydat;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public List<CT_DDHDTO> getListctddh() {
		return listctddh;
	}
	public void setListctddh(List<CT_DDHDTO> listctddh) {
		this.listctddh = listctddh;
	}
	
}
