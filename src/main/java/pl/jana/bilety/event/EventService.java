package pl.jana.bilety.event;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EventService {
    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(int eventId) throws NotFoundException {
        return eventRepository.findById(eventId)
            .orElseThrow(() -> new NotFoundException());
    }

    public void createEvent(Event event) {
        eventRepository.save(event);
    }

    public void updateEvent(int eventId, Event eventDetails) throws NotFoundException {
        Event event = getEventById(eventId);
        event.setName(eventDetails.getName());
        event.setDate(eventDetails.getDate());
        // aktualizacja innych pól
        eventRepository.save(event);
    }

    public void deleteEvent(int eventId) throws NotFoundException {
        Event event = getEventById(eventId);
        eventRepository.delete(event);
    }
}