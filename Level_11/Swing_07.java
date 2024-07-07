package Java.Level_11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Swing_07 extends JFrame{
    private JComboBox<String> colorComboBox;

    public Swing_07() {
        setTitle("Rainbow Color Selector");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an array of 7 two-letter abbreviations for rainbow colors
        String[] rainbowColorAbbreviations = {"Rd", "Or", "Yl", "Gr", "Bl", "Id", "Vt"};

        // Create a combo box with the color abbreviations
        colorComboBox = new JComboBox<>(rainbowColorAbbreviations);

        // Create a button to handle the selection
        JButton selectButton = new JButton("Select");
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = colorComboBox.getSelectedIndex();
                // JOptionPane.showMessageDialog(Swing_07.this,
                //         "You selected: " + rainbowColorAbbreviations[selectedIndex] +
                //                 "\nIndex number: " + (selectedIndex + 1));
                System.out.println("Index: " + selectedIndex);
            }
        });

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Select a color from the rainbow:"));
        panel.add(colorComboBox);
        panel.add(selectButton);

        // Add the panel to the frame
        add(panel);

        // Set the frame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(new Runnable() {
        //     @Override
        //     public void run() {
        //         new Swing_07();
        //     }
        // });
        new Swing_07();
    }
}

