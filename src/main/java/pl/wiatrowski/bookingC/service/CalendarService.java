package pl.wiatrowski.bookingC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wiatrowski.bookingC.model.Calendar;
import pl.wiatrowski.bookingC.repository.CalendarRepo;

import java.time.LocalDate;
import java.util.List;

@Service
public class CalendarService {

    private CalendarRepo calendarRepo;

    @Autowired
    public CalendarService(CalendarRepo calendarRepo) {
        this.calendarRepo = calendarRepo;
    }


    public Iterable<Calendar> findAll() {
        return calendarRepo.findAll();
    }


    public Calendar saveAll(Calendar calendar) {

        if (calendar.getDate().isAfter(LocalDate.now()) && !calendarRepo.existsByDate(calendar.getDate() ) ) {

            calendarRepo.save(calendar);

            //calendar.setDate(calendar.getDate().plusDays(calendar.getRecurve()));
            //calendarRepo.save(calendar);
        }
         return calendar;
    }
}