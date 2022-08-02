package com.webdaugia.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdaugia.dto.DauGiaDTO;
import com.webdaugia.service.IDauGiaService;

@CrossOrigin
@RestController
public class DauGiaAPI {
	@Autowired
	private IDauGiaService dauGiaService;
	@PostMapping(value="/daugia")
	public DauGiaDTO save(@RequestBody DauGiaDTO model) {
		return dauGiaService.save(model);
	}
	@GetMapping(value="/daugia/{id}")
	public DauGiaDTO getId(@PathVariable("id") Long id) {
		return dauGiaService.getId(id);
	}
}
