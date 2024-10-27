package com.ggs.receptionbackend.service.booking_service.impl;

import com.ggs.receptionbackend.entity.login.rols.Client;
import com.ggs.receptionbackend.entity.login.rols.Company;
import com.ggs.receptionbackend.entity.process_booking.Booking;
import com.ggs.receptionbackend.repository.booking_repository.BookingRepository;
import com.ggs.receptionbackend.repository.booking_repository.PaymentMethodRepository;
import com.ggs.receptionbackend.repository.login_repository.ClientRepository;
import com.ggs.receptionbackend.repository.login_repository.CompanyRepository;
import com.ggs.receptionbackend.service.booking_service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CompanyRepository companyRepository;



    @Override
    public List<Booking> searchBookingsByReceptionId(Long receptionId) {
        return bookingRepository.findByCompany_CompanyId(receptionId);
    }

    @Override
    public List<Booking> searchBookingsByClientId(Long clientId) {
        return bookingRepository.findBookingByClient_ClientId(clientId);
    }

    @Override
    public Booking createBooking(Booking booking, Long clientId, Long receptionId) {
        Client client = clientRepository.findById(clientId).orElse(null);
        Company company = companyRepository.findById(receptionId).orElse(null);
        booking.getCalendar().setDate(new Date());
        booking.setClient(client);
        booking.setCompany(company);
        return bookingRepository.save(booking);
    }

    @Override
    public Booking updateBooking(Long id, Booking booking) {
        Booking newBooking = bookingRepository.findById(id).orElse(null);
        if (newBooking != null) {
            // Aun falta completar
            return bookingRepository.save(newBooking);
        }
        return null;
    }

    @Override
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
