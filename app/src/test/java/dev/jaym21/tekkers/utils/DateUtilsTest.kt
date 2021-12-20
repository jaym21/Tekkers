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
}