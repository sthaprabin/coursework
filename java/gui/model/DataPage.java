package gui.model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DataPage {
    private JFrame frame;

    public DataPage(ArrayList<Teacher> list) {
        frame = new JFrame("Data Page");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        for (Teacher item : list) {
            JLabel itemLabel = new JLabel(item.getName());
            itemLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(itemLabel);
            JLabel itemLabel2 = new JLabel(item.getAddress());
            itemLabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(itemLabel2);
        }

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }
}