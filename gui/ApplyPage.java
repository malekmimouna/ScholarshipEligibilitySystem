package gui;

import javax.swing.*;
import java.awt.*;
import model.Student;
import java.awt.event.ActionEvent;

public class ApplyPage extends JFrame {
    public ApplyPage() {
        setTitle("Scholarship Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel formPanel = new JPanel(new GridLayout(5, 2));
        JTextField nameField = new JTextField();
        JTextField gpaField = new JTextField();
        JTextField incomeField = new JTextField();
        JTextField ageField = new JTextField();

        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("GPA:"));
        formPanel.add(gpaField);
        formPanel.add(new JLabel("Family Income:"));
        formPanel.add(incomeField);
        formPanel.add(new JLabel("Age:"));
        formPanel.add(ageField);

        JButton submitBtn = new JButton("Apply");
        formPanel.add(submitBtn);

        add(formPanel);
        setVisible(true);

        submitBtn.addActionListener((ActionEvent e) -> {
            String name = nameField.getText();
            double gpa = Double.parseDouble(gpaField.getText());
            double income = Double.parseDouble(incomeField.getText());
            int age = Integer.parseInt(ageField.getText());

            Student student = new Student(name, gpa, income, age);
            JOptionPane.showMessageDialog(this, "Application submitted successfully for: " + name);
            // Save to DB or send to server logic here
        });
    }
}
