package pl.wiatrowski.bookingC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wiatrowski.bookingC.model.Calendar;
import pl.wiatrowski.bookingC.repository.CalendarRepo;
import java.time.LocalDate;

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

//add function with a basic verification
    public Calendar save(Calendar calendar) {

        if (calendar.getDate().isAfter(LocalDate.now()) && !calendarRepo.existsByDate(calendar.getDate() ) ) {
            calendarRepo.save(calendar);

            // unused functionality to add multiple dates by parameters provides by user

/*            List<Calendar> calendars = new ArrayList<>();
            calendars.add(calendar);
                for (int i = 0; i <= calendar.getPeriod(); i++)
            calendars.add(calendar.setDate(calendar.getDate().plusDays(calendar.getRecurve()))));
            calendarRepo.saveAll(calendars);
*/
        }


         return calendar;
    }

    public void deleteById(Long id) {
        calendarRepo.deleteById(id);
    }
}