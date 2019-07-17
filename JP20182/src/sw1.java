
import javafx.scene.control.RadioButton;
import javax.swing.JFrame;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author realinfo
 */
public class sw1 extends JFrame {

    JTextField t1;
    JButton b1;
    JCheckBox ch1, ch2;
    JTextArea tx;
    JComboBox c1;
    JPanel p;
    JRadioButton r1, r2, r3, r4;
    ButtonGroup gp;
    
    JComboBox cb1;

    public sw1() {
        p = new JPanel();
        JTextField t1 = new JTextField(20);
        JButton b1 = new JButton("Save");
        p.add(t1);
        p.add(b1);

        r1 = new JRadioButton("AA");
        r2 = new JRadioButton("BB");
        r3 = new JRadioButton("CC");
        r4 = new JRadioButton("DD");

        gp = new ButtonGroup();
        
        cb1=new JComboBox();
        cb1.addItem("A");
        cb1.addItem("B");
        cb1.addItem("C");

        gp.add(r1);
        gp.add(r2);
        gp.add(r3);
        gp.add(r4);

        p.add(r1);
        p.add(r2);
        p.add(r3);
        p.add(r4);
       p.add(cb1);
        add(p);
    }

    public static void main(String s[]) {
        sw1 a = new sw1();
        a.setSize(300, 300);
        a.setVisible(true);

    }

}
