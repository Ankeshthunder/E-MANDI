
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author realinfo
 */
public class fr1 extends Frame  implements WindowListener {
    
    public fr1()
    {
        
       addWindowListener(this); 
    }
    
    
    
    
    public static void main(String s[])
    {
       fr1 a=new fr1();
       a.setSize(300,300);
       a.setVisible(true);
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
     System.out.println("Opened");   
    
    }

    @Override
    public void windowClosing(WindowEvent e) {
     System.out.println("Closing");   
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    System.out.println("Closed");    
    
    }

    @Override
    public void windowIconified(WindowEvent e) {
      System.out.println("ICONIFIED");  
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Deactivated");
    }
    
    
}







