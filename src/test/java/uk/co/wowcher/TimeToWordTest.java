package uk.co.wowcher;

import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class TimeToWordTest {

    private static TimeToWord timeToWord;

    @BeforeClass
    public static void before() {
        DigitToWordMapper mapper = DigitToWordMapper.getInstance();
        timeToWord = new TimeToWord(mapper);
    }

    @Test
    public void shouldReturnOneFiftyNine() {
        assertThat(timeToWord.parseTime("01:59"), is("It's one fifty nine"));
    }

    @Test
    public void shouldReturnEightThirtyFour() {
        assertThat(timeToWord.parseTime("08:34"), is("It's eight thirty four"));
    }

    @Test
    public void twelveHundredIsMidday() {
        assertThat(timeToWord.parseTime("12:00"), is("It's Midday"));
    }

    @Test
    public void zeroZeroZeroZeroIsMidnight() {
        assertThat(timeToWord.parseTime("00:00"), is("It's Midnight"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHandleEmptyInput() {
        timeToWord.parseTime("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHandleNullInput() {
        timeToWord.parseTime(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHandleInvalidInput() {
        timeToWord.parseTime("-2abc");
    }

    @Test
    public void shouldReturnFalseWhenTimeFormatIsNotValid() {
        assertThat(timeToWord.isValid("-2abc"), is(false));
    }

    @Test
    public void shouldReturnTrueWhenTimeFormatIsValid() {
        assertThat(timeToWord.isValid("09:30"), is(true));
    }
}