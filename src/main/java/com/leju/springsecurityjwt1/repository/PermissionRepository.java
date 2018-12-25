package com.leju.springsecurityjwt1.repository;

import com.leju.springsecurityjwt1.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission,String> {
}
