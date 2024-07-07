package Java.Level_11;

//Q 6 a. Code By Rajat Jangid.

import java.awt.*;
import java.awt.event.*;

public class List_07 implements ActionListener{
    Choice C;
    Label L;
    Frame F;
    Button B;
    List_07(){
        F=new Frame();
        F.setSize(450,400);
        F.setLayout(new FlowLayout());
        F.setBackground(Color.GREEN);

        L=new Label("1");
        C=new Choice();
        B=new Button("Show");
        B.addActionListener(this);

        C.add("Red");
        C.add("Orange");
        C.add("Yellow");
        C.add("Green");
        C.add("Blue");
        C.add("indigo");
        C.add("Violet");

        //Adding to frame
        F.add(L);
        F.add(B);
        F.add(C);
        F.setVisible(true);

        F.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                F.dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        L.setText(String.valueOf(C.getSelectedIndex()+1));
        if(C.getSelectedIndex()==2){
        F.setBackground(Color.RED);
        }
    }
    public static void main(String[] args) {
        List_07 L=new List_07();
    }
}

// B.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
        //         if(e.getSource()==B){
        //         L.setText(String.valueOf(C.getSelectedIndex()+1));

        //         }
        //     }
        // });
// F.add(L);
// F.add(B1);
// F.add(L1);
// C.addItemListener(this);
// Button B1=new Button("BUTTON_01");
        // List L=new List(5);
        // L.add("Hello");
        // L.add("Hii");

        // Label L1=new Label("Rajat Jangid");
        // L1.setBackground(Color.lightGray);
        // L1.setForeground(Color.BLUE);
        // L1.setFont(new Font("MV Boli", Font.BOLD, 32));
// public void actionPerformed(ActionEvent e){
    //     if(e.getSource()==C){
    //         // int x=C.getSelectedIndex;
    //         System.out.println("Index: " );
    //     }
    //     int idx=C.getSelectedIndex();
    //     System.out.println("Idx: " + idx);
    // }