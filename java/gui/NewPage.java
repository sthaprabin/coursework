package gui;

import gui.model.Lecturer;
import gui.model.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class NewPage {
    private JFrame frame;
    private JTextField nameField;
    private JTextField addressField;
    private JButton saveButton;

    public NewPage(String header, ArrayList<Teacher> list) {
        frame = new JFrame(header);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel headerLabel = new JLabel(header);
        headerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(headerLabel);

        // Add text fields
        nameField = new JTextField(20);
        panel.add(nameField);

        addressField = new JTextField(20);
        panel.add(addressField);

        // Add button
        saveButton = new JButton("Save");
        saveButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(saveButton);


        // Add ActionListener to the save button
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Teacher teacher = getLecturer();
                list.add(teacher);
                frame.dispose();
            }
        });

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }

    private Teacher getLecturer() {
        Teacher lecturer = new Lecturer(nameField.getText(), addressField.getText(), 0);
        return lecturer;
    }

}