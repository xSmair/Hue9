package net.htlgrieskirchen.pos3.timeutil;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

class TimeUtilProTest {

    @org.junit.jupiter.api.Test
    void intToLocalDate() {
        LocalDate expected = LocalDate.of(2003, 02, 01);
        LocalDate result = TimeUtilPro.intToLocalDate(20030201);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void longToLocalDate() {
        LocalDate expected = LocalDate.of(2003, 02, 01);
        LocalDate result = TimeUtilPro.longToLocalDate(200302011234L);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void dateToLocalDate() {
        LocalDate expected = LocalDate.of(2003, 01, 10);
        LocalDate result = TimeUtilPro.dateToLocalDate(new Date(103, Calendar.JANUARY, 10));
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void calendarToLocalDate() {
        LocalDate expected = LocalDate.of(2003, 1, 10);
        Calendar cal = Calendar.getInstance();
        cal.set(2003, Calendar.JANUARY, 10);
        LocalDate result = TimeUtilPro.calendarToLocalDate(cal);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void intToLocalDateTime() {
        LocalDateTime expected = LocalDateTime.of(2003, 02, 01, 0, 0);
        LocalDateTime result = TimeUtilPro.intToLocalDateTime(20030201);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void longToLocalDateTime() {
        LocalDateTime expected = LocalDateTime.of(2003, 02, 1, 12, 34);
        LocalDateTime result = TimeUtilPro.longToLocalDateTime(200302011234L);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void dateToLocalDateTime() {
        LocalDateTime expected = LocalDateTime.of(2003, 01, 10, 12, 11);
        LocalDateTime result = TimeUtilPro.dateToLocalDateTime(new Date(103, Calendar.JANUARY, 10, 12, 11));
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void calenderToLocalDateTime() {
        LocalDateTime expected = LocalDateTime.of(2003, 01, 10,0,0,0);
        Calendar cal = Calendar.getInstance();
        cal.set(2003, Calendar.JANUARY, 10, 0, 0, 0);
        LocalDateTime result = TimeUtilPro.calendarToLocalDateTime(cal);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void localDateToInt() {
        int expected = 20030110;
        int result = TimeUtilPro.localDateToInt(LocalDate.of(2003, 1, 10));
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void localDateTimeToInt() {
        int expected = 20030110;
        int result = TimeUtilPro.localDateTimeToInt(LocalDateTime.of(2003, 1, 10, 12, 11));
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void LocalDateToLong() {
        long expected = 20030110L;
        long result = TimeUtilPro.localDateToLong(LocalDate.of(2003, 01, 10));
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void localDateTimeToLong() {
        long expected = 200301101211L;
        long result = TimeUtilPro.localDateTimeToLong(LocalDateTime.of(2003, 1, 10, 12, 11));
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void localDateToDate() {
        Date expected = new Date(103, Calendar.JANUARY, 10);
        Date result = TimeUtilPro.localDateToDate(LocalDate.of(2003, 1, 10));
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void localDateTimeToDate() {
        Date expected = new Date(103, Calendar.JANUARY, 10, 12, 11);
        Date result = TimeUtilPro.localDateTimeToDate(LocalDateTime.of(2003, 1, 10, 12, 11));
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void localDateToCalendar() {
        Calendar expected = Calendar.getInstance();
        expected.set(2003, Calendar.JANUARY, 10, 0, 0, 0);
        expected.setTimeInMillis(0);
        Calendar result = TimeUtilPro.localDateToCalendar(LocalDate.of(2003, 1, 10));
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void localDateTimeToCalendar() {
        Calendar expected = Calendar.getInstance();
        expected.set(2003, 1, 10, 12, 11, 0);
        expected.setTimeInMillis(0);
        expected.set(Calendar.MILLISECOND, 0);
        Calendar result = TimeUtilPro.localDateTimeToCalendar(LocalDateTime.of(2003, 1, 10, 12, 11,0));
        assertEquals(expected, result);

    }

}