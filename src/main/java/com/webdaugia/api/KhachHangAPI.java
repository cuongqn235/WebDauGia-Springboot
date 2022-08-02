package com.webdaugia.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdaugia.dto.KhachHangDTO;
import com.webdaugia.service.IKhachHangService;


@CrossOrigin
@RestController
public class KhachHangAPI {
	@Autowired
	private IKhachHangService khachHangService;
	
	@PostMapping(value="/khachhang")
	public KhachHangDTO themKhachHang(@RequestBody KhachHangDTO model) {
		return khachHangService.save(model);
	}
	@PutMapping(value="/khachhang")
	public KhachHangDTO suaKhachHang(@RequestBody KhachHangDTO model) {
		return khachHangService.save(model);
	}
	@DeleteMapping(value="/khachhang")
	public void xoaKhachHang(@RequestBody String[] ids) {
		khachHangService.delete(ids);
	}
	@GetMapping(value="/khachhang/{id}")
	public KhachHangDTO KhachHang(@PathVariable("id") String id) {
		return khachHangService.get(id);
	}
	@GetMapping(value="/dskhachhang")
	public List<KhachHangDTO> dsKhachHang() {
		return khachHangService.getList();
	}
//	@GetMapping(value="/khachhang/dsdaugia/{id}")
//	public KhachHangDTO dsDauGia(@PathVariable("id") Long id) {
//		return null;
//	}
}
