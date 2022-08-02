package com.webdaugia.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="NhaCungCap")
public class NhaCungCapEntity extends BaseEntity {
	@Column(name="tenncc")
	private String tenncc;
	@Column(name="diachi")
	private String diachi;
	@Column(name="sdt")
	private int sdt;
	@OneToMany(mappedBy = "ncc", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DonDatHangEntity> listddh = new ArrayList<>();
	
	public String getTenncc() {
		return tenncc;
	}
	public void setTenncc(String tenncc) {
		this.tenncc = tenncc;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public List<DonDatHangEntity> getListddh() {
		return listddh;
	}
	public void setListddh(List<DonDatHangEntity> listddh) {
		this.listddh = listddh;
	}
	
	
}
