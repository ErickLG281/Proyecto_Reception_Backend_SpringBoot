package com.ggs.receptionbackend.repository.booking_repository;

import com.ggs.receptionbackend.entity.process_booking.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {
    PaymentMethod findByMethod(String methodName);
}
