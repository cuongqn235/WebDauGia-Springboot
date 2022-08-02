package com.webdaugia.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.webdaugia.dto.DonDatHangDTO;
import com.webdaugia.service.IDonDatHangService;

@CrossOrigin
@RestController
public class DonDatHangAPI {
	@Autowired
	IDonDatHangService ddhService;
	@PostMapping(value="/dondathang")
	public DonDatHangDTO save(@RequestBody DonDatHangDTO model) {
		return ddhService.save(model);
	}
	@GetMapping(value ="/dondathang/{id}")
	public DonDatHangDTO getDDH(@PathVariable("id") Long id) {
		return ddhService.get(id);
	}
}
