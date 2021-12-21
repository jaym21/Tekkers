package dev.jaym21.tekkers.utils

import org.junit.Assert.assertNotNull
import org.junit.Test
import java.sql.Timestamp
import java.time.LocalDate
import java.time.LocalDateTime

class DateUtilsTest {

    @Test
    fun `Get yyyy-MM-dd date format from current time in milliseconds`() {
        val date = DateUtils().convertTimeMillisToDate(System.currentTimeMillis())
        assertNotNull(date)
    }

    @Test
    fun `Get unix timestamp from date`() {
        val timestamp = DateUtils().getTimestampFromDate("2021-12-20")
        assertNotNull(timestamp)
    }

    @Test
    fun `Get day of the week from timestamp`() {
        val dayOfWeek = DateUtils().getDayOfWeek(System.currentTimeMillis())
        assertNotNull(dayOfWeek)
    }

    @Test
    fun `Get fixture dates timestamp`() {
        val timestamps = DateUtils().getTimestampsOfDatesForFixtures()
        assertNotNull(timestamps)
    }
}