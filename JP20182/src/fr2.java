
import java.awt.*;
import java.awt.Frame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author realinfo
 */
public class fr2 extends Frame {

    TextField t1;
    Button b1;
    Checkbox ch1, ch2;
    CheckboxGroup cg1;
    Checkbox chx1, chx2, chx3, chx4;
    TextArea tx;
    Choice c1;
    Panel p;

    public fr2() {
        p = new Panel();
   
        t1 = new TextField(20);
        b1 = new Button("Save");
     
        ch1 = new Checkbox();
        ch2 = new Checkbox();
        cg1 = new CheckboxGroup();

        chx1 = new Checkbox("aa", cg1, true);
        chx2 = new Checkbox("bb", cg1, false);
        chx3 = new Checkbox("cc", cg1, false);
        chx4 = new Checkbox("dd", cg1, false);

        tx = new TextArea(5, 10);
        c1 = new Choice();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        p.add(t1);

        p.add(ch1);
        p.add(ch2);

        p.add(chx1);
        p.add(chx2);
        p.add(chx3);
        p.add(chx4);
        p.add(tx);
        p.add(c1);
        p.add(b1);
        add(p);
    }

    public static void main(String s[]) {
        fr2 a = new fr2();
        a.setSize(300, 300);
        a.setVisible(true);
        

    }

}
