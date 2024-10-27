package com.ggs.receptionbackend.service.booking_service;

import com.ggs.receptionbackend.entity.process_booking.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> searchBookingsByReceptionId(Long receptionId);
    List<Booking> searchBookingsByClientId(Long clientId);
    Booking createBooking(Booking booking, Long clientId, Long receptionId);
    Booking updateBooking(Long id, Booking booking);
    void deleteBooking(Long id);
}
