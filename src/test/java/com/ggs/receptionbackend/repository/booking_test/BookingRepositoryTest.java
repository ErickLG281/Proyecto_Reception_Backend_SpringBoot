package com.ggs.receptionbackend.repository.booking_test;

import com.ggs.receptionbackend.entity.login.rols.Client;
import com.ggs.receptionbackend.entity.login.rols.Company;
import com.ggs.receptionbackend.entity.process_booking.Booking;
import com.ggs.receptionbackend.entity.process_booking.PaymentMethod;
import com.ggs.receptionbackend.entity.process_booking.Transaction;
import com.ggs.receptionbackend.entity.reception_information.Calendar;
import com.ggs.receptionbackend.repository.booking_repository.BookingRepository;
import com.ggs.receptionbackend.repository.login_repository.CompanyRepository;
import com.ggs.receptionbackend.repository.reception_repository.CalendarRepository;
import com.ggs.receptionbackend.repository.booking_repository.PaymentMethodRepository;
import com.ggs.receptionbackend.repository.booking_repository.TransactionRepository;
import com.ggs.receptionbackend.repository.login_repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class BookingRepositoryTest {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Autowired
    private CalendarRepository calendaryRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Test
    public void savePaymentMethods() {
        List<PaymentMethod> paymentMethods = new ArrayList<>();
        String[] methodNames = {
                "Credit Card",
                "Debit Card",
                "Bank Transfer",
                "PayPal",
                "Mobile Payment",
                "Cryptocurrency",
                "Check",
                "Cash",
                "Gift Card",
                "Direct Debit"
        };
        for (String methodName : methodNames) {
            PaymentMethod paymentMethod = PaymentMethod.builder()
                    .method(methodName)
                    .build();
            paymentMethods.add(paymentMethod);
        }
        paymentMethodRepository.saveAll(paymentMethods);
    }


    @Test
    public void saveBooking(){
        Client client = clientRepository.findById(2L).orElse(null);
        Company company = companyRepository.findById(1L).orElse(null);
        PaymentMethod paymentMethod = paymentMethodRepository.findByMethod("Cash");

        Transaction transaction = Transaction.builder()
                .price(BigDecimal.valueOf(25434324))
                .information("sfaksldjfksladf")
                .paymentMethod(paymentMethod)
                .build();

        Calendar calendar = Calendar.builder()
                .date(new Date())
                .build();

        Booking booking = Booking.builder()
                .client(client)
                .company(company)
                .transaction(transaction)
                .calendar(calendar)
                .build();

        bookingRepository.save(booking);

    }
}
