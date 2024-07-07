
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;
public class AWT_BorderLayout {
    AWT_BorderLayout(){
        Frame f=new Frame();
        f.setLayout(new BorderLayout(5,5));
        f.setBackground(Color.black);
        Panel p1=new Panel();
        p1.setBackground(Color.BLUE);
        p1.setPreferredSize(new Dimension(30,30));
        // p1.setSize(100, 100);
        Panel p2=new Panel();
        p2.setBackground(Color.GREEN);
        // p2.setSize(100, 100);
        p2.setPreferredSize(new Dimension(30,30));

        Panel p3=new Panel();
        p3.setBackground(Color.ORANGE);
        // p3.setSize(100, 100);
        p3.setPreferredSize(new Dimension(30,30));
        
        Panel p4=new Panel();
        p4.setBackground(Color.RED);
        // p4.setSize(100, 100);
        p4.setPreferredSize(new Dimension(30,30));

        Panel p5=new Panel();
        p5.setBackground(Color.black);

        Panel p6=new Panel();
        p6.setBackground(Color.BLUE);
        p6.setPreferredSize(new Dimension(30,30));

        Panel p7=new Panel();
        p7.setBackground(Color.GREEN);
        p7.setPreferredSize(new Dimension(30,30));
        
        Panel p8=new Panel();
        p8.setBackground(Color.ORANGE);
        p8.setPreferredSize(new Dimension(30,30));
        
        Panel p9=new Panel();
        p9.setBackground(Color.RED);
        p9.setPreferredSize(new Dimension(30,30));
        
        p5.setLayout(new BorderLayout(5,5));
        p5.add(p7,"North");
        p5.add(p6,"South");
        p5.add(p9,"East");
        p5.add(p8,"West");
        Label L1=new Label("MY WISH(VISH)");
        L1.setForeground(Color.CYAN);
        L1.setFont(new Font("MV Boli",Font.ITALIC,100));
        // L1.setFont(new Font("MV Boli",Font.BOLD,100));


        p5.add(L1,"Center");

        f.add(p5,"Center");
        f.add(p1,"North");
        f.add(p2,"South");
        f.add(p3,"East");
        f.add(p4,"West");

        f.setSize(500, 500);
        f.setVisible(true);


        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            };
        });
    }
    public static void main(String[] args) {
        new AWT_BorderLayout();
    }    
}
