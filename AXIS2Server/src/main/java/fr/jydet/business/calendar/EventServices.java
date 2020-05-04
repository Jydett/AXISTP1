package fr.jydet.business.calendar;

import fr.jydet.business.calendar.beans.Event;
import fr.jydet.business.calendar.beans.RepeatEvent;
import fr.jydet.business.calendar.dao.EventDao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@WebService
public class EventServices {

    public EventDao<Event> eventDao;
    public EventDao<RepeatEvent> repeatEventEventDao;

    @WebMethod
    public long saveEvent(Event event) {
        eventDao.save(event);
        return event.getId();
    }

    @WebMethod
    public void deleteEvent(long id) {
        internalGetEventByID(id).ifPresent(value -> eventDao.remove(value));
    }

    @WebMethod
    public Event getEventByID(long id) {
        return internalGetEventByID(id).orElse(null);
    }

    private Optional<Event> internalGetEventByID(long id) {
        return eventDao.findById(id);
    }

    @WebMethod
    public List<Event> getEventsAtDay(Calendar date) {
        return null;
    }

    @WebMethod
    public List<Event> getEventsAtDayBetweenHour(Calendar date, int hourStart, int hourFinish) {
        return null;
    }

    @WebMethod
    public List<Event> getEventsBetweenPeriod(Calendar dateStart, int hourStart, Calendar dateFinish, int hourFinish) {
        return null;
    }
}
