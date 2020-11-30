package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class TimeUtilPro {

    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    //DONE
    public static LocalDate intToLocalDate(int date) {
        String dateParsed = Integer.toString(date);
        String[] d = dateParsed.split("");
        int year = Integer.parseInt(d[0]) * 1000 + Integer.parseInt(d[1]) * 100 + Integer.parseInt(d[2]) * 10 + Integer.parseInt(d[3]);
        Month month = Month.of(Integer.parseInt(d[4]) * 10 + Integer.parseInt(d[5]));
        int day = Integer.parseInt(d[6]) * 10 + Integer.parseInt(d[7]);
        return LocalDate.of(year, month, day);
    }

    public static LocalDate longToLocalDate(long dateTime) {
        String dateParsed = Long.toString(dateTime);
        String[] d = dateParsed.split("");
        int year = Integer.parseInt(d[0]) * 1000 + Integer.parseInt(d[1]) * 100 + Integer.parseInt(d[2]) * 10 + Integer.parseInt(d[3]);
        int month = Integer.parseInt(d[4]) * 10 + Integer.parseInt(d[5]);
        int day = Integer.parseInt(d[6]) * 10 + Integer.parseInt(d[7]);
        return LocalDate.of(year, month, day);
    }

    public static LocalDate dateToLocalDate(Date dateTime) {
        return LocalDate.of(dateTime.getYear() + 1900, dateTime.getMonth() + 1, dateTime.getDate());
    }

    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        return LocalDate.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
    }

    // ########## LOCALDATETIME METHODS ##########
    public static LocalDateTime intToLocalDateTime(int date) {
        String dateParsed = Integer.toString(date);
        if (dateParsed.length() == 8) {
            dateParsed = dateParsed + "0000";
        }
        String[] d = dateParsed.split("");
        int year = Integer.parseInt(d[0]) * 1000 + Integer.parseInt(d[1]) * 100 + Integer.parseInt(d[2]) * 10 + Integer.parseInt(d[3]);
        return getLocalDateTime(d, year);
    }

    public static LocalDateTime longToLocalDateTime(long dateTime) {
        String dateParsed = Long.toString(dateTime);
        String[] d = dateParsed.split("");
        int year = Integer.parseInt(d[0]) * 1000 + Integer.parseInt(d[1]) * 100 + Integer.parseInt(d[2]) * 10 + Integer.parseInt(d[3]);
        return getLocalDateTime(d, year);
    }

    private static LocalDateTime getLocalDateTime(String[] d, int year) {
        Month month = Month.of(Integer.parseInt(d[4]) * 10 + Integer.parseInt(d[5]));
        int day = Integer.parseInt(d[6]) * 10 + Integer.parseInt(d[7]);
        int minutes = Integer.parseInt(d[8]) * 10 + Integer.parseInt(d[9]);
        int seconds = Integer.parseInt(d[10]) * 10 + Integer.parseInt(d[11]);
        return LocalDateTime.of(year, month, day, minutes, seconds);
    }

    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        return LocalDateTime.of(dateTime.getYear() + 1900, dateTime.getMonth() + 1, dateTime.getDate(), dateTime.getHours(), dateTime.getMinutes());
    }

    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        return LocalDateTime.of(dateTime.get(Calendar.YEAR), dateTime.get(Calendar.MONTH), dateTime.get(Calendar.DATE), dateTime.get(Calendar.HOUR_OF_DAY), dateTime.get(Calendar.MINUTE));
    }

    // ########## INT METHODS ##########
    public static int localDateToInt(LocalDate date) {
        return date.getYear() * 10000 + date.getMonthValue() * 100 + date.getDayOfMonth();
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();
        return year * 10000 + month * 100 + day;
    }

    // ########## LONG METHODS ##########
    public static long localDateToLong(LocalDate date) {
        long year = date.getYear();
        long month = date.getMonthValue();
        long day = date.getDayOfMonth();
        return year * 10000 + month * 100 + day * 1;
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        long year = dateTime.getYear();
        long month = dateTime.getMonthValue();
        long day = dateTime.getDayOfMonth();
        long hour = dateTime.getHour();
        long minute = dateTime.getMinute();
        return year * 100000000 + month * 1000000 + day * 10000 + hour * 100 + minute;
    }

    // ########## DATE METHODS ##########
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return new Date(date.getYear() - 1900, date.getMonthValue() - 1, date.getDayOfMonth());
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return new Date(dateTime.getYear() - 1900, dateTime.getMonthValue() - 1, dateTime.getDayOfMonth(), dateTime.getHour(), dateTime.getMinute());
    }

    // ########## CALENDAR METHODS ##########
    public static Calendar localDateToCalendar(LocalDate date) {
        Calendar d = Calendar.getInstance();
        d.set(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 0,0,0);
        d.setTimeInMillis(0);
        return d;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        Calendar d = Calendar.getInstance();
        d.set(dateTime.getYear(), dateTime.getMonthValue(), dateTime.getDayOfMonth(), dateTime.getHour(), dateTime.getMinute());
        return d;
    }

}
