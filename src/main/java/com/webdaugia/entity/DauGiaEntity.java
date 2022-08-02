package com.webdaugia.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DauGia")
public class DauGiaEntity extends BaseEntity {
	@Column(name="ngaytao")
	private String ngaytao;
	@Column(name="giatoithieu")
	private int giatoithieu;
	@ManyToOne(fetch = FetchType.LAZY)
	private NhanVienEntity nhanvien;
	@ManyToOne(fetch = FetchType.LAZY)
	private SanPhamEntity sanpham;
	@OneToMany(mappedBy = "daugia", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CT_DGEntity> listctdg = new ArrayList<>();
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
	public NhanVienEntity getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVienEntity nhanvien) {
		this.nhanvien = nhanvien;
	}
	public SanPhamEntity getSanpham() {
		return sanpham;
	}
	public void setSanpham(SanPhamEntity sanpham) {
		this.sanpham = sanpham;
	}
	public List<CT_DGEntity> getListctdg() {
		return listctdg;
	}
	public void setListctdg(List<CT_DGEntity> listctdg) {
		this.listctdg = listctdg;
	}
	
	
}
