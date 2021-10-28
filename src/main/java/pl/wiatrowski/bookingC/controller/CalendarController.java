package pl.wiatrowski.bookingC.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wiatrowski.bookingC.model.Calendar;
import pl.wiatrowski.bookingC.service.CalendarService;
import java.util.List;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    private  List<Calendar> calendarList;
    private CalendarService calendarService;

    @Autowired
    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GetMapping("/all")
    public Iterable<Calendar> findAll() {
        return calendarService.findAll();
    }

    @PostMapping
    public Calendar addDate(@RequestBody Calendar calendar){
        return calendarService.saveAll(calendar);
    }

}
