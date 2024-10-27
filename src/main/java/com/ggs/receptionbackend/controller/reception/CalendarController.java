package com.ggs.receptionbackend.controller.reception;

import com.ggs.receptionbackend.entity.reception_information.Calendar;
import com.ggs.receptionbackend.service.reception_service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("calendar")
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @PostMapping("/create")
    public ResponseEntity<Calendar> createCalendar(@RequestBody Calendar calendar) {
        Calendar createdCalendar = calendarService.createCalendar(calendar);
        return ResponseEntity.ok(createdCalendar);
    }

    @PutMapping("/update/{calendarId}")
    public ResponseEntity<Calendar> updateCalendar(@PathVariable(name= "calendarId") Long id, @RequestBody Calendar updatedCalendar ) {
        Calendar updateCalendar = calendarService.updateCalendar(id, updatedCalendar);
        if (updateCalendar != null) {
            return ResponseEntity.ok(updateCalendar);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/delete/{calendarId}")
    public ResponseEntity<Void> deleteCalendar(@PathVariable(name= "calendarId") Long id) {
        calendarService.deleteCalendar(id);
        return ResponseEntity.noContent().build();
    }


}
