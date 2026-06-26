package OpenCFSD;
import de.gurkenlabs.input4j.InputDevices;
import menu.MenuMain;
import threads.EventListener_XBoxController;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        MenuMain menuMain = new MenuMain();
        while(menuMain == null) { }

        EventListener_XBoxController scanner = new EventListener_XBoxController();
        while(scanner == null) { }

        /*
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Background Image Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.setUndecorated(true);
            frame.setSize(800, 600);
            //GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //GraphicsDevice gd = ge.getDefaultScreenDevice();
            //gd.setFullScreenWindow(frame);
            //frame.setVisible(true);

            BackgroundPanel backgroundPanel = new BackgroundPanel("main_menu_backgrounds/Xbox_Controll_2D_Diagram_With_Shifts.jpg");
            backgroundPanel.setLayout(new BorderLayout());

            JButton button = new JButton("Click Me!");
            backgroundPanel.add(button, BorderLayout.SOUTH);

            frame.add(backgroundPanel);
            frame.setLocationRelativeTo(null); // Center the window
            frame.setVisible(true);
        });
*/

    }
}