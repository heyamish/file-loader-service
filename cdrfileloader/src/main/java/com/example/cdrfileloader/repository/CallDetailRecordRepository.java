package com.example.cdrfileloader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cdrfileloader.entity.CallDetailRecord;

@Repository
public interface CallDetailRecordRepository extends JpaRepository<CallDetailRecord, String> {
  
}