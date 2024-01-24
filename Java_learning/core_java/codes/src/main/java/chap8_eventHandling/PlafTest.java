package chap8_eventHandling;

import javax.swing.*;
import java.awt.*;

public class PlafTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new PlafFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("PlafFrame");
            }
        });
    }
}
