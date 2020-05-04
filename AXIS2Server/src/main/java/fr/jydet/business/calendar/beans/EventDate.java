package fr.jydet.business.calendar.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EventDate {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    public EventDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public EventDate(int year, int month, int day, int hour) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
    }
}
