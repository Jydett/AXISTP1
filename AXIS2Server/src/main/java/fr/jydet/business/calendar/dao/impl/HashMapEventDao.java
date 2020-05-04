package fr.jydet.business.calendar.dao.impl;

import fr.jydet.business.calendar.beans.IEvent;
import fr.jydet.business.calendar.dao.EventDao;
import fr.jydet.core.persistance.HashMapDao;

import java.util.concurrent.atomic.AtomicLong;

public class HashMapEventDao<E extends IEvent> extends HashMapDao<Long, E> implements EventDao<E> {
    private final static AtomicLong id = new AtomicLong(0);

    public HashMapEventDao() {
        super(id::incrementAndGet);
    }

}
