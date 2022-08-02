package com.webdaugia.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdaugia.dto.CT_NapTienDTO;
import com.webdaugia.service.ICT_NapTienService;

@CrossOrigin
@RestController
public class CT_NapTienAPI {
	@Autowired
	private ICT_NapTienService ctntServide;
	
	@PostMapping(value="/naptien")
	public CT_NapTienDTO save(@RequestBody CT_NapTienDTO model) {
		return ctntServide.save(model);
	}
	@GetMapping(value="/naptien/{sdt}")
	public List<CT_NapTienDTO> getCTNapTien(@PathVariable("sdt") String sdt){
		return ctntServide.getCTNapTien(sdt);
	}
}
