package com.durga.day60_LambdaExpressions;

import javax.swing.*;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class LambdaGUIExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Lambda GUI Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();

            JLabel label = new JLabel("Click the button!");

            JButton button = new JButton("Click Me");
            button.addActionListener(e -> label.setText("Button Clicked!"));

            panel.add(label);
            panel.add(button);

            frame.getContentPane().add(panel);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
