package com.gchelper.repository;

import com.gchelper.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Piotr Stoklosa
 */
@Repository
public interface AdminRepository extends CrudRepository<AdminEntity, Integer>{

}
