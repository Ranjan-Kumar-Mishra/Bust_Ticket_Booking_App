package com.ticket.repository;

import com.ticket.entities.BusOperator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusOperatorRepository extends JpaRepository<BusOperator, Long> {
}
