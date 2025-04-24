package gui;

import javax.swing.*;
import java.awt.*;

public class ModernAdminPage extends JFrame {

    public ModernAdminPage() {
        setTitle("🎓 Admin Dashboard - Scholarship System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Header
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(new Color(25, 118, 210));
        JLabel titleLabel = new JLabel("📚 Welcome, Admin!", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
        titleLabel.setForeground(Color.WHITE);
        header.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));
        header.add(titleLabel, BorderLayout.CENTER);

        // Tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        tabbedPane.addTab("📋 Eligible Students", createStudentsPanel());
        tabbedPane.addTab("📊 Dashboard", createDashboardPanel());
        tabbedPane.addTab("📝 Reports", createReportsPanel());
        tabbedPane.addTab("➕ Add Entry", createAddPanel());

        setLayout(new BorderLayout());
        add(header, BorderLayout.NORTH);
        add(tabbedPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createStudentsPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JTextArea area = new JTextArea("🎓 List of eligible students will appear here...\n👥 Stay tuned for updates!");
        area.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        area.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        area.setBackground(new Color(250, 250, 250));
        area.setEditable(false);
        panel.add(new JScrollPane(area), BorderLayout.CENTER);
        return panel;
    }

    private JPanel createDashboardPanel() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("📈 Charts and stats coming soon! 📊✨");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(label);
        return panel;
    }

    private JPanel createReportsPanel() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("📄 Reports section under development 🛠️");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(label);
        return panel;
    }

    private JPanel createAddPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font labelFont = new Font("Segoe UI", Font.BOLD, 18);
        Font fieldFont = new Font("Segoe UI", Font.PLAIN, 18);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("👤 Student Name:"), gbc);
        gbc.gridx = 1;
        panel.add(createTextField(fieldFont), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("🎁 Scholarship Name:"), gbc);
        gbc.gridx = 1;
        panel.add(createTextField(fieldFont), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("📈 GPA:"), gbc);
        gbc.gridx = 1;
        panel.add(createTextField(fieldFont), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("📌 Status:"), gbc);
        gbc.gridx = 1;
        JComboBox<String> statusCombo = new JComboBox<>(new String[]{"⏳ Pending", "✅ Approved", "❌ Rejected"});
        statusCombo.setFont(fieldFont);
        panel.add(statusCombo, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JButton addButton = new JButton("➕ Add Entry");
        addButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
        addButton.setBackground(new Color(0, 150, 136));
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);
        addButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(addButton, gbc);

        return panel;
    }

    private JTextField createTextField(Font font) {
        JTextField field = new JTextField();
        field.setFont(font);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        return field;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ModernAdminPage::new);
    }
}
