package com.webdaugia.api;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdaugia.dto.CT_DGDTO;
import com.webdaugia.service.ICT_DGService;

@CrossOrigin
@RestController
public class CT_DGAPI {
	
	@Autowired
	private ICT_DGService iCT_DGService;
	@PostMapping(value="/ctdaugia")
	public List<CT_DGDTO> themctdg(@RequestBody CT_DGDTO model){
		return iCT_DGService.save(model);
	}
	@GetMapping(value="/ctdaugia/{id}")
	public List<CT_DGDTO> xemCtdgId(@PathVariable("id") Long id){
		return iCT_DGService.getListId(id);
	}
	@GetMapping(value="/ctdaugia")
	public List<CT_DGDTO> xemCtdg(){
		return iCT_DGService.getListId();
	}
}
