package gui;

import javax.swing.*;
import java.awt.*;

public class AdminPage extends JFrame {
    public AdminPage() {
        setTitle("Admin Panel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea displayArea = new JTextArea("Eligible students list will appear here.");
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        setVisible(true);
    }
}
