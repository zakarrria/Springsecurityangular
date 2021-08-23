package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RoleEntity;

@Repository
public interface IRoleRepository extends JpaRepository<RoleEntity,Long> {

}
