
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author realinfo
 */
public class sw5 extends JFrame{
     JTable t;
    JPanel p;
    JScrollPane sp;
    
    public sw5()
    {
        p=new JPanel();
       // Vector heading=new Vector();
        Vector heading=new Vector();
        heading.add("Heading 1");
        heading.add("Heading 2");
        heading.add("Heading 3");
        
      Vector data=new Vector();
      char c='a';
      
      for(int i=0;i<5;i++)
      {
      Vector row1=new Vector();
      row1.add(c);
      row1.add(c);
      row1.add(c);
      data.add(row1);
      c++;
      }
        
      t=new JTable(data,heading);
      
      sp=new JScrollPane(t);
     // p.add(t);
      add(sp);
    }
    
    
     public static void main(String s[]) {
        sw5 a = new sw5();
        a.setSize(300, 300);
        a.setVisible(true);

    }
}
