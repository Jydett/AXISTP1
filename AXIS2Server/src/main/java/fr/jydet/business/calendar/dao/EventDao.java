package fr.jydet.business.calendar.dao;

import fr.jydet.business.calendar.beans.IEvent;

public interface EventDao<E extends IEvent> {
    void remove(E event);

    void save(E event);

    E findById(Long id);
}
