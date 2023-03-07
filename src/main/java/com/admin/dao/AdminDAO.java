package com.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.entity.Admin;

public interface AdminDAO extends JpaRepository<Admin, Integer>{

}
