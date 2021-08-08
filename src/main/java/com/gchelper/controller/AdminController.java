package com.gchelper.controller;

import com.gchelper.entity.AdminEntity;
import com.gchelper.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that manage admin requests
 *
 * @author Piotr Stoklosa
 */
@RestController
public class AdminController {

    final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping(path = "admin/save")
    public ResponseEntity<AdminEntity> saveAdmin(@RequestBody AdminEntity adminEntity) {
        AdminEntity adminEntity1 = adminService.saveAdmin(adminEntity);
        return new ResponseEntity<>(adminEntity1, HttpStatus.CREATED);
    }

}
