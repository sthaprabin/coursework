package gui;

import gui.model.DataPage;
import gui.model.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MainGui {

    private static final ArrayList<Teacher> teacherArrayList = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Create a new JFrame
        JFrame frame = new JFrame("CourseWork");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // mainPanel -> gridWrapperPanel -> gridPanel

        // Create a JPanel to hold the buttons
        JPanel mainPanel = new JPanel(new BorderLayout()); // Using BorderLayout
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 40, 50)); // Add extra margin

        // Create a panel to hold the grid of buttons with extra margin
        JPanel gridWrapperPanel = new JPanel(new BorderLayout());
        gridWrapperPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add extra margin

        // Create a panel to hold the grid of buttons
        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 10, 10)); // 2 rows, 3 columns, 10px horizontal and vertical gap

        // Create six buttons
        JButton button1 = createStyledButton("Add lecturer");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the new page
                NewPage newPage = new NewPage("Add Lecturer", teacherArrayList);
                newPage.show();
            }
        });
        JButton button2 = createStyledButton("Button 2");
        JButton button3 = createStyledButton("Button 3");
        JButton button4 = createStyledButton("Button 4");
        JButton button5 = createStyledButton("Button 5");
        JButton button6 = createStyledButton("Button 6");

        // Add buttons to the grid panel
        gridPanel.add(button1);
        gridPanel.add(button2);
        gridPanel.add(button3);
        gridPanel.add(button4);
        gridPanel.add(button5);
        gridPanel.add(button6);

        // Create the "Display" button
        JButton displayButton = createStyledButton("Display");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the new page
                DataPage newPage = new DataPage(teacherArrayList);
                newPage.show();
            }
        });

        // Add the grid panel to the center of the grid wrapper panel
        gridWrapperPanel.add(gridPanel, BorderLayout.CENTER);

        // Add the grid wrapper panel to the main panel
        mainPanel.add(gridWrapperPanel, BorderLayout.CENTER);

        // Add the "Display" button to the bottom of the main panel
        mainPanel.add(displayButton, BorderLayout.SOUTH);

        // Add the main panel to the frame
        frame.add(mainPanel);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the new page
                NewPage newPage = new NewPage("Add Lecturer", teacherArrayList);
                newPage.show();
            }
        });

        // Set frame size and make it visible
        frame.setSize(500, 300); // Set a fixed size to avoid button scaling
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    private static JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(200, 60)); // Set preferred size
        button.setMargin(new Insets(10, 10, 10, 10)); // Set padding
        return button;
    }
}