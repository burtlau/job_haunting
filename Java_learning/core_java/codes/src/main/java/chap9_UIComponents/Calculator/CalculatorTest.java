package chap9_UIComponents.Calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new CalculatorFrame();
                frame.setTitle("Calculator Frame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
