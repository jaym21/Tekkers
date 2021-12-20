package dev.jaym21.tekkers.utils

import org.junit.Assert.assertNotNull
import org.junit.Test

class DateUtilsTest {

    @Test
    fun `Get yyyy-MM-dd date format from current time in milliseconds`() {
        val date = DateUtils().convertCurrentTimeMillisToDate(System.currentTimeMillis())
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
        val day = dayOfWeek.substring(0,3)
        val timestamp = "2021-12-20"
        val time = timestamp.substring(8)
        assertNotNull(dayOfWeek)
    }
}