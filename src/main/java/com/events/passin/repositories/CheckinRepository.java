package com.events.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.events.passin.domain.checkin.CheckIn;

public interface CheckinRepository extends JpaRepository<CheckIn, Integer> {
    
}
