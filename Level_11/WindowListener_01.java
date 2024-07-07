package Java.Level_11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.*;

public class WindowListener_01{
    // Frame f1;
    WindowListener_01(){
        Frame f1=new Frame();
        f1.setTitle("First_Try");
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setBackground(Color.BLACK);
        f1.setSize(800,250);

        f1.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                // System.exit(0);
                f1.dispose();
            };
        });
    }
    // @Override
    // public void windowClosing(){

    // }
    public static void main(String[] args) {
        WindowListener_01 obj=new WindowListener_01();
    }
}
