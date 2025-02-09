package src;

import javax.swing.*;
import java.awt.*;

public class CableNetworkUI extends JFrame {
    public CableNetworkUI() {
        setTitle("Mani Cable Network");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Header Panel (Black)
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.BLACK);
        headerPanel.setLayout(new BorderLayout());
        JLabel titleLabel = new JLabel("Mani Cable Network", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JButton helpButton = new JButton("Request for Help");
        headerPanel.add(titleLabel, BorderLayout.CENTER);
        headerPanel.add(helpButton, BorderLayout.SOUTH);

        // Main Content Panel (Blue)
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(new Color(50, 100, 255));
        contentPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;

        // User Info Fields
        String[][] userInfo = {
            {"Box ID", "2145766627"},
            {"Name", "Mani"},
            {"Area", "Kendriya"},
            {"Phone", "8575748758"}
        };

        for (String[] detail : userInfo) {
            JLabel label = new JLabel(detail[0] + ":");
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            contentPanel.add(label, gbc);

            gbc.gridx = 1;
            JTextField textField = new JTextField(detail[1], 15);
            textField.setEditable(false);
            textField.setHorizontalAlignment(JTextField.CENTER);
            contentPanel.add(textField, gbc);

            gbc.gridx = 0;
            gbc.gridy++;
        }

        // Table Data
        String[] columns = {"S.No", "Package", "Month", "Date", "Amount", "Due"};
        Object[][] data = {
            {"2", "Kids Pack Special", "March", "2024-11-14", "100", "0"}
        };

        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy++;
        contentPanel.add(scrollPane, gbc);

        // Done Button
        JButton doneButton = new JButton("Done");
        gbc.gridy++;
        contentPanel.add(doneButton, gbc);

        // Add panels to Frame
        add(headerPanel, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CableNetworkUI::new);
    }
}
