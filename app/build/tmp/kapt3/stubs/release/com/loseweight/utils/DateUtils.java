package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0014"}, d2 = {"Lcom/loseweight/utils/DateUtils;", "", "()V", "DateUtils", "", "formatDate", "", "timeInMillis", "", "formatDateTime", "formatTime", "formatTimeWithMarker", "getHourOfDay", "", "getMinute", "hasSameDate", "", "millisFirst", "millisSecond", "isToday", "app_release"})
public final class DateUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.utils.DateUtils INSTANCE = null;
    
    private DateUtils() {
        super();
    }
    
    private final void DateUtils() {
    }
    
    /**
     * Gets timestamp in millis and converts it to HH:mm (e.g. 16:44).
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatTime(long timeInMillis) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatTimeWithMarker(long timeInMillis) {
        return null;
    }
    
    public final int getHourOfDay(long timeInMillis) {
        return 0;
    }
    
    public final int getMinute(long timeInMillis) {
        return 0;
    }
    
    /**
     * If the given time is of a different date, display the date.
     * If it is of the same date, display the time.
     *
     * @param timeInMillis The time to convert, in milliseconds.
     * @return The time or date.
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatDateTime(long timeInMillis) {
        return null;
    }
    
    /**
     * Formats timestamp to 'date month' format (e.g. 'February 3').
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatDate(long timeInMillis) {
        return null;
    }
    
    /**
     * Returns whether the given date is today, based on the user's current locale.
     */
    public final boolean isToday(long timeInMillis) {
        return false;
    }
    
    /**
     * Checks if two dates are of the same day.
     *
     * @param millisFirst  The time in milliseconds of the first date.
     * @param millisSecond The time in milliseconds of the second date.
     * @return Whether {@param millisFirst} and {@param millisSecond} are off the same day.
     */
    public final boolean hasSameDate(long millisFirst, long millisSecond) {
        return false;
    }
}