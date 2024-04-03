package com.events.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.events.passin.domain.attendee.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
    
}
