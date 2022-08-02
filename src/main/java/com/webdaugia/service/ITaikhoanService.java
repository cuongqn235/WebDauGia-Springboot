package com.webdaugia.service;

import com.webdaugia.dto.ResuftDTO;
import com.webdaugia.dto.TaiKhoanDTO;

public interface ITaikhoanService {
	TaiKhoanDTO save(TaiKhoanDTO dto);
	ResuftDTO UpdatePass(TaiKhoanDTO dto);
	ResuftDTO CheckUserName(String username);
}
