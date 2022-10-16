package com.example.jobsheet6.jobsheet7.jobsheet8.jobsheet_9.jobsheet_10.jobsheet11.jobsheet12.rifqilkhanif

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(
            "com.example.jobsheet6.jobsheet7.jobsheet8.jobsheet_9.jobsheet_10.jobsheet11.jobsheet12.rifqilkhanif",
            appContext.packageName
        )
    }
}