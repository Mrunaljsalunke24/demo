package com.master.demo.repository;

import com.master.demo.entity.MasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository extends JpaRepository<MasterEntity,String> {
}
