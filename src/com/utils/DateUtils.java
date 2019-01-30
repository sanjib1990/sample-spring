package com.utils;

import java.util.Date;
import java.time.ZoneId;
import java.time.Instant;
import java.time.LocalTime;
import java.time.LocalDateTime;

/**
 * Date utlity class.
 */
public class DateUtils
{
    public static Date localDateTimeToDate(LocalDateTime date)
    {
        return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDateTime dateToLocalDateTime(Date date)
    {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
    }

    public static Date getStartDateTime(LocalDateTime date)
    {
        return localDateTimeToDate(date.with(LocalTime.MIN));
    }

    public static Date getEndDateTime(LocalDateTime date)
    {
        return localDateTimeToDate(date.with(LocalTime.MAX));
    }
}
