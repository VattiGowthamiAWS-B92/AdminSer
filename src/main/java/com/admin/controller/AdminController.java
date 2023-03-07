package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entity.Admin;
import com.admin.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService adminservice;
	
	@GetMapping("/login")
	public List<Admin> getAllAdmin() {
		return this.adminservice.getAllAdmin();
	}
	@PostMapping("/Register")
	public Admin addAdmin(@RequestBody Admin admin) {
			return this.adminservice.addAdmin(admin);
	}
}
