package fr.jydet.business.calendar;

import fr.jydet.business.calendar.beans.Event;
import fr.jydet.business.calendar.beans.EventDate;
import fr.jydet.business.calendar.beans.RepeatEvent;
import fr.jydet.business.calendar.dao.EventDao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
//import java.util.Optional;

@WebService
public class EventServices {

    public EventDao<Event> eventDao;
    public EventDao<RepeatEvent> repeatEventEventDao;

    @WebMethod
    public long saveEvent(Event event) {
//        eventDao.save(event);
        return event.getId();
    }

    @WebMethod
    public void deleteEvent(long id) {
//        internalGetEventByID(id).ifPresent(value -> eventDao.remove(value));
    }

    @WebMethod
    public Event getEventByID(long id) {
//        return internalGetEventByID(id).orElse(null);
        return null;
    }

//    private Optional<Event> internalGetEventByID(long id) {
//        return eventDao.findById(id);
//    }

    @WebMethod
    public List<Event> getEventsAtDay(EventDate date) {
        return null;
    }

    @WebMethod
    public List<Event> getEventsAtDayBetweenHour(EventDate date, int hourFinish) {
        return null;
    }

    @WebMethod
    public List<Event> getEventsBetweenPeriod(EventDate dateStart, EventDate dateFinish) {
        return null;
    }
}
