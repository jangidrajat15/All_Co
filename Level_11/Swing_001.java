package Java.Level_11;

import javax.swing.*;

// import org.ietf.jgss.Oid;

import java.awt.FlowLayout;
// import javax.swing.JLabel;

public class Swing_001 {
    
    public static void main(String[] args) {
        JFrame obj =new JFrame();
        obj.setTitle("First Swing Frame");
        obj.setVisible(true);
        obj.setSize(800, 400);;    
        obj.setLayout(new FlowLayout());
        JLabel jb1=new JLabel("Hello...");
        obj.add(jb1);
        JButton jb2=new JButton("--- Enter ---");
        obj.add(jb2);
        String color[]={"Red" ,"Yellow","Orange"};
        JComboBox JM=new JComboBox<>(color);
        obj.add(JM);
        
        // JM.setBounds(100, 100, 40, 20);
        // JM.add("Red");
        // JM.add("Yellow");
        // JM.add("Green");
        // JM.add("Orange");
        // JM.add("Blue");
        // JM.add("indigo");
        // JM.add("Violet");

        
        ImageIcon image = new ImageIcon("Icon_01.png");
        obj.setIconImage(image.getImage());

        

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
