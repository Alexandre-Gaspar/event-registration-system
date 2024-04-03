package com.events.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.events.passin.domain.events.Event;

public interface EventRepository extends JpaRepository<Event, String> {
    
}
