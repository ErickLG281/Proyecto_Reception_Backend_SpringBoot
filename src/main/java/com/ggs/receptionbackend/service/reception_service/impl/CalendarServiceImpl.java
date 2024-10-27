package com.ggs.receptionbackend.service.reception_service.impl;

import com.ggs.receptionbackend.entity.reception_information.Calendar;
import com.ggs.receptionbackend.repository.reception_repository.CalendarRepository;
import com.ggs.receptionbackend.service.reception_service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {

    @Autowired
        private CalendarRepository calendarRepository;


    @Override
    public Calendar searchCalendarById(Long id) {
        return calendarRepository.findById(id).orElse(null);
    }

    @Override
    public Calendar createCalendar(Calendar calendar) {
        calendar.setDate(calendar.getDate());
        return calendarRepository.save(calendar);
    }

    @Override
    public Calendar updateCalendar(Long id, Calendar calendar) {
        Calendar newCalendar = calendarRepository.findById(id).orElse(null);
        if (newCalendar != null) {
            newCalendar.setDate(calendar.getDate());

            return calendarRepository.save(newCalendar);
        }
        return null;
    }

    @Override
    public void deleteCalendar(Long id) {
        calendarRepository.deleteById(id);
    }
}
