package com.webdaugia.dto;

import java.util.ArrayList;
import java.util.List;

public class KhachHangDTO extends PersonDTO {
	private String id;
	private int sotien;
	private String matkhau;
	private List<CT_DGDTO> listctdg = new ArrayList<>();
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
	public List<CT_DGDTO> getListctdg() {
		return listctdg;
	}
	public void setListctdg(List<CT_DGDTO> listctdg) {
		this.listctdg = listctdg;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
