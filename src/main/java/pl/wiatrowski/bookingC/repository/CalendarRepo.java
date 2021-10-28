package pl.wiatrowski.bookingC.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wiatrowski.bookingC.model.Calendar;

import java.time.LocalDate;

@Repository
public interface CalendarRepo extends CrudRepository<Calendar, Long> {
    boolean existsByDate(LocalDate date);
}
