package pl.wiatrowski.bookingC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class Calendar {



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private LocalDate date;



    public Calendar() {
    }

    public Calendar(Long id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }










    private long recurve;

    private long period;

    public Calendar(Long id, LocalDate date, long recurve, long period) {
        this.id = id;
        this.date = date;
        this.recurve = recurve;
        this.period = period;
    }

    public long getRecurve() {
        return recurve;
    }

    public void setRecurve(int recurve) {
        this.recurve = recurve;
    }

    public long getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

}
