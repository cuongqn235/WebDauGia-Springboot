package com.webdaugia.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdaugia.dto.ChucVuDTO;
import com.webdaugia.service.IChucVuService;

@CrossOrigin
@RestController
public class ChucVuAPI {
	@Autowired
	private IChucVuService cvService;
	@PostMapping(value="/chucvu")
	ChucVuDTO save(@RequestBody ChucVuDTO chucvu) {
		return cvService.save(chucvu);
	}
	@DeleteMapping(value="/chucvu")
	void delate(@RequestBody ChucVuDTO chucvu) {
		cvService.delete(chucvu);
	}
}
