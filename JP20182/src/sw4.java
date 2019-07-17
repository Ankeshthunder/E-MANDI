
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
public class sw4 extends JFrame{
   
    
    JTable t;
    JPanel p;
    JScrollPane sp;
    public sw4()
    {
        p=new JPanel();
        String heading[]=new String[3];
        heading[0]="Heading 1";
        heading[1]="Heading 2";
        heading[2]="Heading 3";
        
        String data[][]={{"aa","bb","cc"},{"ee","ff","gg"}};
        
      t=new JTable(data,heading);
      
      sp=new JScrollPane(t);
     // p.add(t);
      add(sp);
    }
    
    
     public static void main(String s[]) {
        sw4 a = new sw4();
        a.setSize(300, 300);
        a.setVisible(true);

    }
}
