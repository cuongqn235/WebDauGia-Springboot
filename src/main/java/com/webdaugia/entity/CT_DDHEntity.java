package com.webdaugia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="CtDonDatHang")
public class CT_DDHEntity extends BaseEntity {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dondathang")
	private DonDatHangEntity dondathang;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="sanpham")
	private SanPhamEntity sanpham;
	@Column(name="soluong")
	private int soluong;
	@Column(name="dongia")
	private float dongia;
	public DonDatHangEntity getDondathang() {
		return dondathang;
	}
	public void setDondathang(DonDatHangEntity dondathang) {
		this.dondathang = dondathang;
	}
	public SanPhamEntity getSanpham() {
		return sanpham;
	}
	public void setSanpham(SanPhamEntity sanpham) {
		this.sanpham = sanpham;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public float getDongia() {
		return dongia;
	}
	public void setDongia(float dongia) {
		this.dongia = dongia;
	}
	
	
}
