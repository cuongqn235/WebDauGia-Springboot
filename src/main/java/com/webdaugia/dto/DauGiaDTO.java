package com.webdaugia.dto;

import java.util.ArrayList;
import java.util.List;


public class DauGiaDTO {
	private Long id;
	private String ngaytao;
	private int giatoithieu;
	private Long nhanvienid;
	private String tensp;
	private List<CT_DGDTO> listctdg = new ArrayList<>();

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(String ngaytao) {
		this.ngaytao = ngaytao;
	}
	public int getGiatoithieu() {
		return giatoithieu;
	}
	public void setGiatoithieu(int giatoithieu) {
		this.giatoithieu = giatoithieu;
	}
	public Long getNhanvienid() {
		return nhanvienid;
	}
	public void setNhanvienid(Long nhanvienid) {
		this.nhanvienid = nhanvienid;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public List<CT_DGDTO> getListctdg() {
		return listctdg;
	}
	public void setListctdg(List<CT_DGDTO> listctdg) {
		this.listctdg = listctdg;
	}
	
}
