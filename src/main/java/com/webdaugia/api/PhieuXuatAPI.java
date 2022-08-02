package com.webdaugia.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdaugia.dto.PhieuXuatDTO;
import com.webdaugia.service.IPhieuXuatService;

@CrossOrigin
@RestController
public class PhieuXuatAPI {
	@Autowired
	IPhieuXuatService pxService;
	@PostMapping(value="/phieuxuat/{id}")
	public PhieuXuatDTO save(@RequestBody PhieuXuatDTO model,@PathVariable("id")Long id) {
		return pxService.save(model,id);
	}
	@GetMapping(value="/phieuxuat/{id}")
	public PhieuXuatDTO getPX(@PathVariable("id") Long id) {
		return pxService.getPX(id);
	}
}
