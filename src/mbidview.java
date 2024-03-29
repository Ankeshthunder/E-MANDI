
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankesh
 */
public class mbidview extends javax.swing.JInternalFrame {

    /**
     * Creates new form mbidview
     */String adhar;
    public mbidview(String adhar) {
        initComponents();
        this.adhar=adhar;
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */    void showData() {
try
{
        // Vector heading=new Vector();
        Vector heading = new Vector();
      heading.add("S ID");
      heading.add("M ID");
      heading.add("Amount");
      heading.add("Status");
  
      
       // String sd=id.getText();

        Class.forName("com.mysql.jdbc.Driver");
        String str = "jdbc:mysql://localhost/mandi";
        Connection x = DriverManager.getConnection(str, "root", "12345");
        String query = "select sid, M_ID,Amount,Status from Status where M_ID=? ";
        PreparedStatement ps = x.prepareStatement(query);
        ps.setString(1, adhar);
        ResultSet rs=ps.executeQuery();
         Vector data = new Vector();
        while(rs.next())
        {
             Vector row = new Vector();
             row.add(rs.getString("sid"));
            row.add(rs.getString("M_ID"));
            row.add(rs.getString("Amount"));
             row.add(rs.getString("Status"));
               data.add(row);
        }
       
        DefaultTableModel d=new DefaultTableModel(data,heading);
       mbid.setModel(d);
       
        
}
catch(Exception ex)
{
 JOptionPane.showMessageDialog(this, ex.getMessage());
}
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mbid = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        mbid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S ID", "M ID", "AMOUNT", "STATUS"
            }
        ));
        mbid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbidMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mbid);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mbidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbidMouseClicked
        // TODO add your handling code here:
        int index= mbid.getSelectedRow();
       
        TableModel tm=mbid.getModel();
        String sid=(String) tm.getValueAt(index, 0);
       String mid=(String) tm.getValueAt(index, 1);
       try
       {
           
        Class.forName("com.mysql.jdbc.Driver");
        String str = "jdbc:mysql://localhost/mandi";
        Connection x = DriverManager.getConnection(str, "root", "12345");
        String query = "delete from Status where sid=? and M_ID=?  and Status=?";
        PreparedStatement ps = x.prepareStatement(query);
        ps.setString(1, sid);
        ps.setString(2, mid);
        ps.setString(3,"REJECTED");
          int ch=ps.executeUpdate();
          if (ch==1)
         {
          JOptionPane.showMessageDialog(this,"REJECTED BID DELETED");
          showData();
        }
          else
          {
              JOptionPane.showMessageDialog(this,"Status is pending");
             showData();
              
          }
       }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
 
        
    }//GEN-LAST:event_mbidMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mbid;
    // End of variables declaration//GEN-END:variables
}
