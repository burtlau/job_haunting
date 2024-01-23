package chap6_interfaceAndInnerClass;

import org.junit.Test;

public class TimerTestTest {
    @Test
    public void timerCreationTest ()
    {
        TimerTest timerTest = new TimerTest();
        timerTest.startTimer();

        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        timerTest.stopTimer();

    }

}