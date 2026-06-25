package menu;
import javax.swing.*;
import java.io.OutputStream;
import java.io.PrintStream;

public class ConsoleOutputStream extends OutputStream {
    private JTextArea textArea;

    public ConsoleOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) {
        // Appends the character to the JTextArea on the Swing Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            textArea.append(String.valueOf((char) b));
            textArea.setCaretPosition(textArea.getDocument().getLength()); // Auto-scrolls down
        });
    }
}
