package chap7_graphicProgramDesign;

import javax.swing.*;
import java.awt.*;

public class sizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new SizedFrame();
                frame.setTitle("SizedFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }
}

class SizedFrame extends JFrame
{
    public SizedFrame()
    {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screeHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth / 2, screeHeight / 2);
        setLocationByPlatform(true);

        Image img = new ImageIcon("icon.gif").getImage();
        if (img != null) {
            setIconImage(img);
        } else System.err.println("Failed to load the icon image.");
        setIconImage(img);
    }

}