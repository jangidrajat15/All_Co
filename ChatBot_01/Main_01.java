import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Main_01{
    public static void main(String[] args) {
        new chatBot();
    }
}

class chatBot extends JFrame{
    private JTextArea ca=new JTextArea();
    private JTextField cf=new JTextField("Text");
    private JButton b=new JButton();
    private JLabel l=new JLabel("Send");
    chatBot(){
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        // f.setResizable(false);
        f.setLayout(null);
        f.setSize(400,400);
        f.setTitle("CHAT_BOT");
        f.add(ca);
        f.add(cf);
        f.add(b);
        b.add(l);
        ca.setSize(390,315);
        ca.setLocation(1,5);
        cf.setSize(300,20);
        cf.setLocation(1,330);
        b.setSize(80,20);
        b.setLocation(303,330);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==b){
                    String text=cf.getText().toLowerCase();
                    ca.append("You--> " + text + "\n");
                    cf.setText("");

                    if(text.contains("hi")){
                        Reply("Hi there");
                    }else{
                        Reply("I Can't Understand");
                    }
                }
            }
        });


    }
    public void Reply(String s){
        ca.append("ChatBot-->" + s  +"\n");
    }
}