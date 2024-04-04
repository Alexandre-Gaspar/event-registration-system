package com.events.passin.services;

import com.events.passin.domain.attendee.Attendee;
import com.events.passin.domain.events.Event;
import com.events.passin.dto.event.EventResponseDTO;
import com.events.passin.repositories.AttendeeRepository;
import com.events.passin.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // gera os construtores apenas com os atributos declarados na classe
public class EventService {
    private final EventRepository eventRepository;
    private final AttendeeRepository attendeeRepository;

    public EventResponseDTO getEventDetail(String eventId) {
        Event event = this.eventRepository.findById(eventId) // Pode trazer ou não um ID, então
                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + eventId)); // lança uma Exception se o ID não for encontrado no banco de dados
        List<Attendee> attendeeList = this.attendeeRepository.findByEventId(eventId);
        return new EventResponseDTO(event, attendeeList.size());
    }
}
