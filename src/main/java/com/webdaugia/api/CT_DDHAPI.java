package com.webdaugia.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdaugia.dto.CT_DDHDTO;
import com.webdaugia.service.ICT_DDHService;

@CrossOrigin
@RestController
public class CT_DDHAPI {
	@Autowired
	private ICT_DDHService ctddhService;
	@PostMapping(value="/ctddh/{id}")
	public List<CT_DDHDTO> save(@RequestBody List<CT_DDHDTO> list,@PathVariable("id") Long id) {
		return ctddhService.saveList(list, id);
	}
}
