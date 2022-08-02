package com.webdaugia.service;


import java.util.List;

import com.webdaugia.dto.CT_DGDTO;

public interface ICT_DGService {
	List<CT_DGDTO> save(CT_DGDTO dto);
	List<CT_DGDTO> getListId(Long id);
	List<CT_DGDTO> getListId();
}
