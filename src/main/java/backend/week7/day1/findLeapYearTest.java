package backend.week7.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findLeapYearTest {
    @Test
    void checkLeapYear() {
        assertEquals(false, findLeapYear.checkLeapYear(1700));
//        findLeapYear.checkLeapYear(1700);
    }
}