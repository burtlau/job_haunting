package chap8_eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;


public class MouseFrame extends JFrame {
    public MouseFrame()
    {
        add(new MouseComponent());
        pack();
    }
}

