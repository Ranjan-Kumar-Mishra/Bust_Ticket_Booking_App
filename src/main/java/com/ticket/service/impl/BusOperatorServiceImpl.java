package com.ticket.service.impl;

import com.ticket.entities.BusOperator;
import com.ticket.repository.BusOperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BusOperatorServiceImpl implements BusOperatorService {
    @Autowired
    private BusOperatorRepository busOperatorRepository;
    @Override
    public BusOperator createBusOperator(BusOperator busOperator) {
        busOperator.setCreatedAt(new Date());
        busOperator.setUpdatedAt(new Date());
        return busOperatorRepository.save(busOperator);
    }
}