package com.ticket.service.impl;

import com.ticket.entities.Bus;
import com.ticket.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;
    @Override
    public Bus createBus(Bus bus) {
        bus.setCreatedAt(new Date());
        bus.setUpdatedAt(new Date());

        return busRepository.save(bus);
    }
}
