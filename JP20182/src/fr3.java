
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author realinfo
 */
public class fr3 extends Frame {

    MenuBar mb;
    Menu m1;
    MenuItem mt1, mt2, mt3;

    public fr3() {

        mb = new MenuBar();

        m1 = new Menu("File");

        mt1 = new MenuItem("New");
        mt2 = new MenuItem("Open");
        mt3 = new MenuItem("Save");

        m1.add(mt1);
        m1.add(mt2);
        m1.add(mt3);

        mb.add(m1);

        setMenuBar(mb);

    }

    public static void main(String s[]) {
        fr3 a = new fr3();
        a.setSize(300, 300);
        a.setVisible(true);

    }

}
