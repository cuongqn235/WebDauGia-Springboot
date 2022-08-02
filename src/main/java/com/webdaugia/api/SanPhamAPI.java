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

import com.webdaugia.dto.SanPhamDTO;
import com.webdaugia.service.ISanPhamService;

@CrossOrigin
@RestController
public class SanPhamAPI {
	@Autowired
	private ISanPhamService spService;
	
	@PostMapping(value="/sanpham")
	public SanPhamDTO themsp(@RequestBody SanPhamDTO dto) {
		return spService.save(dto);
	}
	@PutMapping(value="/sanpham/{id}")
	public SanPhamDTO suasp(@RequestBody SanPhamDTO dto,@PathVariable("id") long id) {
		dto.setId(id);
		return spService.save(dto);
	}
	@DeleteMapping(value="/sanpham")
	public void suasp(@RequestBody long[] ids) {
		spService.delete(ids);
	}
	@GetMapping(value="/dssanpham")
	private List<SanPhamDTO> dssp(){
		return spService.getList();
	}
}
