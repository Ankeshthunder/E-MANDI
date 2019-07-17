
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author realinfo
 */
public class sw3 extends JFrame {

    Panel p;
    JScrollPane sp;
    public sw3() {
        p = new Panel();
        JButton b[] = new JButton[400];
        GridLayout g=new GridLayout(2,200);
        p.setLayout(g);
        for (int i = 0; i < b.length; i++) {
            b[i] = new JButton("Save " + i);
            p.add(b[i]);
        }
        sp=new JScrollPane(p);
        add(sp);
        
        
    }

    public static void main(String s[]) {
        sw3 a = new sw3();
        a.setSize(300, 300);
        a.setVisible(true);

    }
}
