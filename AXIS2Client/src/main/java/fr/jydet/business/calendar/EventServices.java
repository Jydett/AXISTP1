package fr.jydet.business.calendar;

import fr.jydet.business.calendar.beans.Event;
import fr.jydet.business.calendar.dao.EventDao;

import java.util.Optional;

public class EventServices {

    public EventDao eventDao;

    public long saveEvent(Event event) {
        eventDao.save(event);
        return event.getId();
    }

    public void deleteEvent(long id) {
        getEventByID(id).ifPresent(value -> eventDao.remove(value));
    }

    public Optional<Event> getEventByID(long id) {
        return eventDao.findById(id);
    }
}
