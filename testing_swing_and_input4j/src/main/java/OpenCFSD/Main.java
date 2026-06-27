package OpenCFSD;
import de.gurkenlabs.input4j.InputDevices;
import engine.Framework;
import io.ClientAssembly;
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
    private static Framework _stat_PGM_ClientAssembly = null;
    // public.
    public static void main(String[] args) {
        System.out.printf("entered first member function, main().%n");
        _stat_PGM_ClientAssembly = ClientAssembly.app_generate_Program();
        System.out.printf("%n");
        System.out.printf("        ,     \\      /      ,%n");
        System.out.printf("       / \\    )\\ __ /(     / \\ %n");
        System.out.printf("      /   \\   (_\\  /_)    /   \\ %n");
        System.out.printf("____ / ____\\__ \\@  @/ ___/_____\\_____%n");
        System.out.printf("|              |\\../|               |%n");
        System.out.printf("|               \\VV/                |%n");
        System.out.printf("|                                   |%n");
        System.out.printf("|                                   |%n");
        System.out.printf("|                                   |%n");
        System.out.printf("|___________________________________|%n");
        System.out.printf("|    / \\ /        \\\\        \\ /\\    |%n");
        System.out.printf("|  /    V          ))        V   \\  |%n");
        System.out.printf("|/                //               \\|%n");
        System.out.printf("`                 V                 '%n");
        System.out.printf("%n");
        System.out.printf("==========%n");
        System.out.printf("declaration.%n");
        System.out.printf("definition.%n");
        System.out.printf("substantiation.%n");
        System.out.printf("initialisation.%n");
        System.out.printf("instantiation.%n");
        System.out.printf("running.%n");
        System.out.printf("==========%n");
        System.out.printf("SIMULATION%n");



        //EventListener_XBoxController scanner = new EventListener_XBoxController();
        //while(scanner == null) { }

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