package com.kaankubat.chatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kaankubat.chatapp.entity.ActivityLogEntity;

@Repository
public interface ActivityLogEntityRepo extends JpaRepository<ActivityLogEntity, Long> {

}