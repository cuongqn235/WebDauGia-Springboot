package com.webdaugia.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SanPham")
public class SanPhamEntity extends BaseEntity {
	@Column(name="tensp")
	private String tensp;
	@Column(name="soluong")
	private int soluong;
	@Column(name="chitiet")
	private String chitiet;
	@Column(name="hinhanh")
	private String hinhanh;
	@OneToMany(mappedBy = "sanpham", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DauGiaEntity> listdg = new ArrayList<>();
	@OneToMany(mappedBy = "sanpham", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CT_DDHEntity> listctddh = new ArrayList<>();
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
	public List<DauGiaEntity> getListdg() {
		return listdg;
	}
	public void setListdg(List<DauGiaEntity> listdg) {
		this.listdg = listdg;
	}
	public List<CT_DDHEntity> getListctddh() {
		return listctddh;
	}
	public void setListctddh(List<CT_DDHEntity> listctddh) {
		this.listctddh = listctddh;
	}
	
	
}
