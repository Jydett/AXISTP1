package fr.jydet.business.calendar.dao;

import fr.jydet.business.calendar.beans.Event;

import java.util.Optional;

public interface EventDao {
    void remove(Event event);

    void save(Event event);

    Optional<Event> findById(Long id);
}
