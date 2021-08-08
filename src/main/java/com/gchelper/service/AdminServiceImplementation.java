package com.gchelper.service;

import com.gchelper.entity.AdminEntity;
import com.gchelper.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Piotr Stoklosa
 */
@Service
public class AdminServiceImplementation implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    public AdminEntity saveAdmin(AdminEntity adminEntity) {
        adminRepository.save(adminEntity);
        return adminEntity;
    }


}
