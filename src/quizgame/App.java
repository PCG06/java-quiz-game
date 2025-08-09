/*
 * Java project to create a quiz game using Swing
 * Uses JFrame and JPanel
*/

package quizgame;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Quiz Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 500); // bigger window
            frame.setLocationRelativeTo(null);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

            JLabel titleLabel = new JLabel("Quiz Game");
            titleLabel.setFont(new Font("SansSerif", Font.BOLD, 36)); // bigger title
            titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JButton startButton = new JButton("Start Game");
            JButton settingsButton = new JButton("Settings");
            JButton exitButton = new JButton("Exit");

            Font buttonFont = new Font("SansSerif", Font.PLAIN, 20); // bigger buttons
            startButton.setFont(buttonFont);
            settingsButton.setFont(buttonFont);
            exitButton.setFont(buttonFont);

            Dimension buttonSize = new Dimension(200, 50); // bigger clickable area
            startButton.setMaximumSize(buttonSize);
            settingsButton.setMaximumSize(buttonSize);
            exitButton.setMaximumSize(buttonSize);

            startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            settingsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

            startButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Game starting..."));
            settingsButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Settings..."));
            exitButton.addActionListener(e -> System.exit(0));

            mainPanel.add(titleLabel);
            mainPanel.add(Box.createVerticalStrut(30));
            mainPanel.add(startButton);
            mainPanel.add(Box.createVerticalStrut(15));
            mainPanel.add(settingsButton);
            mainPanel.add(Box.createVerticalStrut(15));
            mainPanel.add(exitButton);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }
}
