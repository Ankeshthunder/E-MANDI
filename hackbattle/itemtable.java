/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackbattle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ankesh
 */
public class itemtable extends javax.swing.JInternalFrame {

    /**
     * Creates new form itemtable
     */
    public itemtable() {
        initComponents();
        showData();
    }

          void showData() {
try
{
        // Vector heading=new Vector();
        Vector heading = new Vector();
      heading.add("ITEM");
      heading.add("STATUS");
       heading.add("C.ID ");
  
      
       // String sd=id.getText();

        Class.forName("com.mysql.jdbc.Driver");
        String str = "jdbc:mysql://localhost/mandi";
        Connection x = DriverManager.getConnection(str, "root", "12345");
        String query = "select item,status,cid from itemstatus  ";
        PreparedStatement ps = x.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
         Vector data = new Vector();
        while(rs.next())
        {
             Vector row = new Vector();
             row.add(rs.getString("item"));
            row.add(rs.getString("status"));
            row.add(rs.getString("cid"));
            data.add(row);
        }
       
        DefaultTableModel d=new DefaultTableModel(data,heading);
       itmtbl.setModel(d);
}
catch(Exception ex)
{
 JOptionPane.showMessageDialog(this, ex.getMessage());
}
          }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        itmtbl = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ITEM STATUS");

        itmtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(itmtbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable itmtbl;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
