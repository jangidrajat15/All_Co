package Java.Level_11;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Awt_001 extends Frame{
    Awt_001(){
        
        Label L1=new Label("Hello_Rajat");
        L1.setLocation(500, 50);
        L1.setBounds(50, 50, 150, 30);
        L1.setBackground(Color.LIGHT_GRAY);
        L1.setForeground(Color.BLACK);

        //Making Buttons
        // Frame f=new Frame("Hello");
        Button B=new Button("Click here ");   //for making new button in frame
        B.setBounds(50,100,80,30);           //for setting postion of the button
        B.setBackground(Color.BLACK);
        B.setForeground(Color.WHITE);
        //ActionListener
        B.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                L1.setText("You Clicked on Button");
            };
        });

        Button B2=new Button("Don't click here");
        B2.setBounds(50,140,100,30);

        Checkbox C1=new Checkbox("Maths",null,true);            //Using CheckBox
        C1.setBounds(250,50,100,30);
        C1.setBackground(Color.YELLOW);

        Checkbox C2=new Checkbox("Physics",null,false);
        C2.setBounds(250,80,100,30);

        CheckboxGroup cbg=new CheckboxGroup();          //For using Radio Button
        
        Checkbox C3=new Checkbox("Maths_1",cbg,true);
        C3.setBounds(250,120,100,30);

        Checkbox C4=new Checkbox("Physics_1",cbg,false);
        C4.setBounds(250,150,100,30);
        
        // cbg.addActionListener(new AccountException){
        if(cbg.getSelectedCheckbox()==C3){
            C4.setBackground(Color.GREEN);
        }
        List list=new List(2,true);
        list.add("Hello");
        list.add("Byyy");

        Choice Ch1=new Choice();
        //Choice
        Ch1.add("Rajat");
        Ch1.add("Chetan");
        Ch1.add("Tara");
        Ch1.add("Rameshwar");
        Ch1.setBounds(50,180,100,20);

        TextField T1=new TextField(10);
        T1.setBounds(50, 180, 100, 30);
        
        TextArea TA=new TextArea(5,50);
        TA.setBounds(250,200,200,100);

        //Menu_ALL

        //Menu Bar 
        MenuBar MB=new MenuBar();
        setMenuBar(MB);
        Menu file =new Menu("File");
        // MenuItem i1,i2;
        file.add(new MenuItem("New_001"));
        file.add(new MenuItem("New_002"));

        //setLayout(BorderLayout());         //for setting Border layout

        //Scroll Bar
        Scrollbar SB=new Scrollbar();
        SB.setOrientation(Scrollbar.HORIZONTAL);
        SB.setBounds(250, 300, 300,25);
        
        //Adding Components in the frame
        MB.add(file);
        add(B);
        add(B2);
        add(L1);
        add(C2);
        add(C1);
        add(C3);
        add(C4);
        add(list);
        add(T1);
        add(Ch1);
        add(TA);
        add(SB);

        
        //Setting Frame Size,Layout and Visiblity
        setSize(800,400);                     //for setting size of the frame
        setLayout(null);                       //for setting default layout(i.e. flow layout)
        setVisible(true);                     //for setting visiblity true

        //Working of exit button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                //dispose();     we can use this also but we make object for this
                Frame frame=(Frame)e.getSource();
                frame.dispose();
            };
        });


    }
    public static void main(String[] args) {
        Awt_001 obj=new Awt_001();
    }
}
