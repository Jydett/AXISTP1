package fr.jydet.business.calendar.dao.impl;

import fr.jydet.business.calendar.beans.IEvent;
import fr.jydet.business.calendar.dao.EventDao;
import fr.jydet.core.persistance.HibernateDao;
import org.hibernate.Session;

import java.util.Optional;

public class HibernateEventDao<E extends IEvent> extends HibernateDao<E> implements EventDao<E> {

    public HibernateEventDao(Session hibernateSession, Class<E> clazz) {
        super(hibernateSession, clazz);
    }

    @Override
    public Optional<E> findById(Long eventId) {
        return Optional.ofNullable(hibernateSession.get(super.clazz, eventId));
    }
}