package com.admin.service;

import java.util.List;

import com.admin.entity.Admin;

public interface AdminService {
	public List<Admin> getAllAdmin();
	public Admin addAdmin(Admin admin);
}
