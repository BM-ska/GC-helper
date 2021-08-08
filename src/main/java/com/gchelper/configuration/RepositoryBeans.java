package com.gchelper.configuration;

import com.gchelper.service.AdminService;
import com.gchelper.service.AdminServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Initialise beans for repositories
 *
 * @author Piotr Stoklosa
 */
@Configuration
public class RepositoryBeans {

    @Bean
    public AdminService adminService() {
        return new AdminServiceImplementation();
    }

}
