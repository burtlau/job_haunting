package chap6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, false);
        clock.startTimer();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}

class TalkingClock
{
    private int interval;
    private boolean beep;
    private Timer timer;
    private ActionListener listener;

    public TalkingClock(int interval, final boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
        this.listener = new TimePrinter();
        this.timer = new Timer(interval, listener);

    }

    public void startTimer(){
        timer.start();
    }

    public void stopTimer(){
        timer.stop();
    }

    public class TimePrinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("At the tone, the time is " + now);
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }


}
