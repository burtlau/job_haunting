package chap6_interfaceAndInnerClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {
    private Timer timer;
    private ActionListener listener;

    public TimerTest(){
        listener = new TimePrinter();
        timer = new Timer(10000, listener);
    }
    public static void main(String[] args) {
        TimerTest timertest = new TimerTest();

        timertest.startTimer();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

    public void startTimer()
    {
        timer.start();
    }

    public void stopTimer()
    {
        timer.stop();
    }
}

class TimePrinter implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}
