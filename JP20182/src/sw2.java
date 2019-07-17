
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author realinfo
 */
public class sw2 extends JFrame {
    JLabel l;
    JPanel p;
    public sw2()
    {
        p=new JPanel();
        l=new JLabel(); 
        l.setText("Hello");
        p.add(l);
        add(p);
    }
    
    
    public static void main(String s[]) {
       sw2 a = new sw2();
        a.setSize(300, 300);
        a.setVisible(true);

    } 
    
}
