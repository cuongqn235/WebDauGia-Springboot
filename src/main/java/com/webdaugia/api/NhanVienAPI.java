package com.webdaugia.api;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdaugia.dto.NhanVienDTO;
import com.webdaugia.service.INhanVienService;

@CrossOrigin
@RestController
public class NhanVienAPI {
	@Autowired
	private INhanVienService nvService;
	
	@PostMapping(value="/nhanvien")
	public NhanVienDTO themNhanVien(@RequestBody NhanVienDTO model) {
		return nvService.save(model);
	}
	@PutMapping(value="/nhanvien/{id}")
	public NhanVienDTO suaNhanVien(@RequestBody NhanVienDTO model,@PathVariable("id") long id) {
		model.setId(id);
		return nvService.save(model);
	}
	@DeleteMapping(value="/nhanvien")
	public void xoaNhanVien(@RequestBody long[] ids) {
		nvService.delete(ids);
	}
//	@GetMapping(value="/dsnhanvien")
//	public List<NhanVienDTO> dsNhanVien() {
//		return nvService.getList();
//	}
	@GetMapping(value="/nhanvien/{id}")
	public NhanVienDTO NhanVien(@PathVariable("id") long id) {
		return nvService.get(id);
	}
}
