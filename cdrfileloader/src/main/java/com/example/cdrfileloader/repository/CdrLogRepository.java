package com.example.cdrfileloader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cdrfileloader.entity.CdrLog;

@Repository
public interface CdrLogRepository extends JpaRepository<CdrLog, Long> {
   
}
