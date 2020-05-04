package fr.jydet.business.calendar.dao.impl;

import fr.jydet.business.calendar.beans.IEvent;
import fr.jydet.business.calendar.dao.EventDao;
import fr.jydet.core.persistance.HibernateDao;
import org.hibernate.Session;

public class HibernateEventDao<E extends IEvent> extends HibernateDao<E> implements EventDao<E> {

    public HibernateEventDao(Session hibernateSession, Class<E> clazz) {
        super(hibernateSession, clazz);
    }

    @Override
    public E findById(Long eventId) {
        return hibernateSession.get(super.clazz, eventId);
    }
}