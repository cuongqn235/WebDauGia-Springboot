package com.webdaugia.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdaugia.dto.ResuftDTO;
import com.webdaugia.dto.TaiKhoanDTO;
import com.webdaugia.service.ITaikhoanService;

@CrossOrigin
@RestController
public class TaiKhoanAPI {
	@Autowired
	private ITaikhoanService taikhoanService;
	@PostMapping(value="/taikhoan")
	public TaiKhoanDTO save(@RequestBody TaiKhoanDTO dto) {
		return taikhoanService.save(dto);
	}
	@PutMapping(value="/taikhoan")
	public ResuftDTO update(@RequestBody TaiKhoanDTO dto) {
		return taikhoanService.UpdatePass(dto);
	}
	@GetMapping(value="/taikhoan/{username}")
	public ResuftDTO check(@PathVariable("username") String username) {
		return taikhoanService.CheckUserName(username);
	}
}
