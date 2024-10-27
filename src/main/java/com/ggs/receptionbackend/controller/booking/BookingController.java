package com.ggs.receptionbackend.controller.booking;

import com.ggs.receptionbackend.entity.process_booking.Booking;
import com.ggs.receptionbackend.repository.login_repository.ClientRepository;
import com.ggs.receptionbackend.service.booking_service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;


    @GetMapping("/{receptionId}")
    public ResponseEntity<List<Booking>> searchBookingsByReceptionId(@PathVariable Long receptionId) {
        List<Booking> bookings = bookingService.searchBookingsByReceptionId(receptionId);
        if (bookings.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(bookings);
        }
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<List<Booking>> searchBookingsByClientId(@PathVariable Long clientId) {
        List<Booking> bookings = bookingService.searchBookingsByClientId(clientId);
        if (bookings.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(bookings);
        }
    }
    @PostMapping("/create")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking, @RequestParam Long clientId, @RequestParam Long receptionId) {
        Booking createdBooking = bookingService.createBooking(booking, clientId, receptionId);
        return ResponseEntity.ok(createdBooking);
    }

    @PutMapping("/update/{bookingId}")
    public ResponseEntity<Booking> updateBooking(@PathVariable(name = "bookingId") Long id, @RequestBody Booking updatedBooking) {
        Booking updateBooking = bookingService.updateBooking(id, updatedBooking);
        if (updateBooking != null) {
            return ResponseEntity.ok(updateBooking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{bookingId}")
    public ResponseEntity<Void> deleteBooking(@PathVariable(name = "bookingId") Long id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.noContent().build();
    }
}
