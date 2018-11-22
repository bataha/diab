package it.diab.db.converters

import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
import it.diab.util.timeFrame.TimeFrame
import org.junit.Test

@SmallTest
class TimeFrameConverterTest {
    private val converter = TimeFrameConverter()

    @Test
    fun convertToInt() {
        val tf = TimeFrame.LATE_MORNING

        assertThat(converter.toInt(tf)).isEqualTo(1)
    }

    @Test
    fun convertToTimeFrame() {
        val tf = 1
        assertThat(converter.toTimeFrame(tf)).isEqualTo(TimeFrame.LATE_MORNING)
    }
}