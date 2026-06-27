package menu;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
public class BackgroundControllerTest extends JPanel {

    private Image backgroundImage;

    public BackgroundControllerTest(String resourcePath) {
        try {
            // Read image from the IntelliJ project resources directory
            backgroundImage = ImageIO.read(Objects.requireNonNull(getClass().getResource(resourcePath)));
        } catch (IOException | NullPointerException e) {
            System.err.println("Error: Could not load background image from path " + resourcePath);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Clears the screen and maintains transparency lifecycle
        if (backgroundImage != null) {
            // Scales the background image dynamically to fill the entire panel size
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
