package chap6_interfaceAndInnerClass;

import org.junit.Test;

public class InnerClassTestTest {

    @Test
    public void talkingClockTest() {
        int interval = 1000;
        TalkingClock talkingClock = new TalkingClock(interval, false);
        talkingClock.startTimer();

        try {
            Thread.sleep(interval+900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        talkingClock.stopTimer();


    }

}