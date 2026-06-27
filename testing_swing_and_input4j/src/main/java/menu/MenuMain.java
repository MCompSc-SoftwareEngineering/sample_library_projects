package menu;

import io.WriteQueCLIENTOUTPUTRECIEVE;

import javax.swing.*;
import java.awt.*;

public class MenuMain extends JFrame {
    private JPanel manuMain_panelTop;
    private JPanel manuMain_panelBottom;
    private JPanel manuMain_panelLeft;
    private JPanel manuMain_panelRight;
    private JPanel manuMain_panelCentre;
    private JLabel menuMain_Title;
    private static JTextArea outputTextArea;
    private JScrollPane scrollPane;

    public MenuMain()
    {

    }

    public void createAndShowGUI_MenuMain()
    {
        setTitle("");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLayout(new BorderLayout(4,4 ));
        setLocationRelativeTo(null);
        setVisible(true);

        WriteQueCLIENTOUTPUTRECIEVE.app_FUNCT_write_Start(1);

        manuMain_panelTop = new JPanel();
        manuMain_panelBottom= new JPanel();
        manuMain_panelLeft = new JPanel();
        manuMain_panelRight = new JPanel();
        manuMain_panelCentre = new JPanel(new BorderLayout());
        outputTextArea = new JTextArea();
        scrollPane = new JScrollPane(outputTextArea);

        manuMain_panelTop.setBackground(Color.red);
        manuMain_panelBottom.setBackground(Color.green);
        manuMain_panelLeft.setBackground(Color.yellow);
        manuMain_panelRight.setBackground(Color.magenta);
        manuMain_panelCentre.setBackground(Color.blue);

        manuMain_panelTop.setPreferredSize(new Dimension(100,50));
        manuMain_panelBottom.setPreferredSize(new Dimension(100,50));
        manuMain_panelLeft.setPreferredSize(new Dimension(100,100));
        manuMain_panelRight.setPreferredSize(new Dimension(100,100));
        manuMain_panelCentre.setPreferredSize(new Dimension(100,100));

        //manuMain_panelCentre.set;
        manuMain_panelCentre.add(scrollPane, BorderLayout.CENTER);

        add(manuMain_panelTop, BorderLayout.NORTH);
        add(manuMain_panelBottom, BorderLayout.SOUTH);
        add(manuMain_panelLeft, BorderLayout.WEST);
        add(manuMain_panelRight, BorderLayout.EAST);
        add(manuMain_panelCentre, BorderLayout.CENTER);

        outputTextArea = new JTextArea();
        manuMain_panelCentre.add(outputTextArea);

        WriteQueCLIENTOUTPUTRECIEVE.app_FUNCT_write_End(1);
    }

    public static void printConsoleAndOutput(String message) {
        System.out.println(message);
        outputTextArea.append(message + "\n");
    }
}
