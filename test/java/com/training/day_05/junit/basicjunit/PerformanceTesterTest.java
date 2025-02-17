package com.training.day_05.junit.basicjunit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

class PerformanceTesterTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        PerformanceTester.longRunningTask();
    }
}
