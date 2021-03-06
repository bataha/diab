/*
 * Copyright (c) 2018 Bevilacqua Joey
 *
 * Licensed under the GNU GPLv3 license
 *
 * The text of the license can be found in the LICENSE file
 * or at https://www.gnu.org/licenses/gpl.txt
 */
package it.diab.db.converters

import it.diab.util.timeFrame.TimeFrame
import org.junit.Assert.assertEquals
import org.junit.Test

class TimeFrameConverterTest {
    private val converter = TimeFrameConverter()

    @Test
    fun convertToInt() {
        val tf = TimeFrame.LATE_MORNING

        assertEquals(converter.toInt(tf), 1)
    }

    @Test
    fun convertToTimeFrame() {
        val tf = 1
        assertEquals(converter.toTimeFrame(tf), TimeFrame.LATE_MORNING)
    }
}