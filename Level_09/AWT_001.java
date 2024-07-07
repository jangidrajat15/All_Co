package Level_09;

import java.awt.*;   //for making frames and only for output.
import java.awt.event.*;   //for working all kind of buttons in that frame.
import java.net.http.WebSocket.Listener;

public class AWT_001 {
    public static void main(String[] args){
        Frame f=new Frame("First Frame");   //Making First frame with name "First Frame"
        f.setVisible(true);
        f.setSize(2000,400);
        f.setBackground(Color.yellow);
        // addWindowListener(new WindowAdapter()){
        //     public void WindowClosing(WindowEvent e){
        //         System.exit(0);
        //     }
        // }
    }
}

// class MyFrameListener implements Listener{

// }

// class MyFrameListener_01 extends WindowAdapter{
//     public void WindowAdapter(WindowEvent e){
//         System.exit(0);
//     }
// }