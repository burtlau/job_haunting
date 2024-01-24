package chap8_eventHandling;

import javax.swing.*;
import java.awt.*;

public class ActionTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ActionFrame();
                frame.setTitle("ActionFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
