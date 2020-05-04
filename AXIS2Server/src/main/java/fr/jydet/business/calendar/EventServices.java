package fr.jydet.business.calendar;

import fr.jydet.business.calendar.beans.Event;
import fr.jydet.business.calendar.dao.EventDao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.Optional;

@WebService
public class EventServices {

    public EventDao eventDao;

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
    public List<Event> getEventsAtDay(int day, int month, int year) {

    }

    @WebMethod
    public List<Event> getEventsAtDayBetweenHour(int day, int month, int year, int hourStart, int hourFinish) {

    }

    @WebMethod
    public List<Event> getEventsBetweenPeriod(int dayStart, int monthStart, int yearStart, int hourStart, int dayFinish, int monthFinish, int yearFinish, int hourFinish) {

    }
}
