package chap9_UIComponents.Calculator;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame()
    {
        CalculatorPanel panel = new CalculatorPanel();
        add(panel);
        pack();
    }
}
