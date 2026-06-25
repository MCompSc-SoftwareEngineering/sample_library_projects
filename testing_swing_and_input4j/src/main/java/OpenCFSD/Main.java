package OpenCFSD;
import de.gurkenlabs.input4j.InputDevices;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
public class Main
{
    // 1. Create a custom subclass of JPanel
    static class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String filePath) {
            try {
                // Load the image from a local file path
                this.backgroundImage = ImageIO.read(new File(filePath));
            } catch (IOException e) {
                System.err.println("Error: Could not load the background image file.");
                e.printStackTrace();
            }
        }

        // 2. Override paintComponent to render the background image
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Handles normal background painting logic

            if (backgroundImage != null) {
                // Draw the image scaled to match the panel's current width and height
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        MenuMain menuMain = new MenuMain();
        while(menuMain == null) { }

        Thread thread = new Thread(() -> {
            try (var inputDevices = InputDevices.init()) {
                while (!inputDevices.getAll().isEmpty()) {
                    // iterate all available input devices and poll their data every second
                    for (var inputDevice : inputDevices.getAll()) {
                        inputDevice.poll();
                        System.out.println(inputDevice.getName() + ":" + inputDevice.getComponents());
                    }
                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();

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