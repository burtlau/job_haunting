package chap8_eventHandling;

import javax.swing.*;
import java.awt.*;

public class MouseFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MouseFrame();
                frame.setTitle("MouseFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
