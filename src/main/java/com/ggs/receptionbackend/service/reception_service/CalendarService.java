package com.ggs.receptionbackend.service.reception_service;

import com.ggs.receptionbackend.entity.reception_information.Calendar;

import java.util.List;

public interface CalendarService {
    Calendar searchCalendarById(Long id);
    Calendar createCalendar(Calendar calendar);
    Calendar updateCalendar(Long id, Calendar calendar);
    void deleteCalendar(Long id);
}
