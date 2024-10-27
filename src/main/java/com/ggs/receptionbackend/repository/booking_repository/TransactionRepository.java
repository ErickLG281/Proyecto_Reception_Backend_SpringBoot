package com.ggs.receptionbackend.repository.booking_repository;

import com.ggs.receptionbackend.entity.process_booking.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
