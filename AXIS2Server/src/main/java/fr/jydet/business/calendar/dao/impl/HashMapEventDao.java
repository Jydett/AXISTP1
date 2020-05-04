package fr.jydet.business.calendar.dao.impl;

import fr.jydet.business.calendar.dao.EventDao;
import fr.jydet.business.calendar.beans.Event;
import fr.jydet.core.persistance.HashMapDao;

import java.util.concurrent.atomic.AtomicLong;

public class HashMapEventDao extends HashMapDao<Long, Event> implements EventDao {
    private final static AtomicLong id = new AtomicLong(0);

    public HashMapEventDao() {
        super(id::incrementAndGet);
    }

}
