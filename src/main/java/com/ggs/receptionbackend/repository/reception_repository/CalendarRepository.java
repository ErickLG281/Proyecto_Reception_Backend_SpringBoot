package com.ggs.receptionbackend.repository.reception_repository;

import com.ggs.receptionbackend.entity.reception_information.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}
