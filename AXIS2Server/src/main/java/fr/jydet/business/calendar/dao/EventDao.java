package fr.jydet.business.calendar.dao;

import fr.jydet.business.calendar.beans.Event;
import fr.jydet.business.calendar.beans.IEvent;

import java.util.Optional;

public interface EventDao<E extends IEvent> {
    void remove(E event);

    void save(E event);

    Optional<E> findById(Long id);
}
