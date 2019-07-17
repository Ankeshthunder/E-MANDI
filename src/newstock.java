
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankesh
 */
public class newstock extends javax.swing.JInternalFrame {
    String adhaarno;
    /**
     * Creates new form newstock
     */
    public newstock(String adhaarno) {
        initComponents();
        this.adhaarno=adhaarno;
        fillcombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    void fillcombo()
    {
    try
 {
 Class.forName("com.mysql.jdbc.Driver");
 String str="jdbc:mysql://localhost/mandi";
 Connection x=DriverManager.getConnection(str,"root","12345");

String query="select Cropname from cat";

PreparedStatement ps=x.prepareStatement(query);
ResultSet rs=ps.executeQuery();
 while (rs.next())
 {
    String s=rs.getString("Cropname");
     getname.addItem(s);
 }
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        getquant = new javax.swing.JTextField();
        getrate = new javax.swing.JTextField();
        getdeo = new javax.swing.JTextField();
        getname = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Crop name");

        jLabel2.setText("Quantity(kg)");

        jLabel3.setText("Rate(per kg)");

        jLabel4.setText("D.O.ENTRY");

        getquant.setBackground(new java.awt.Color(8, 214, 195));

        getrate.setBackground(new java.awt.Color(20, 223, 223));

        getdeo.setBackground(new java.awt.Color(17, 243, 249));
        getdeo.setText("yyyy/mm/dd");
        getdeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getdeoActionPerformed(evt);
            }
        });

        getname.setBackground(new java.awt.Color(33, 235, 243));
        getname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getnameActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(233, 6, 38));
        save.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(226, 7, 42));
        back.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(getdeo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(getquant)
                                .addComponent(getrate)
                                .addComponent(getname, 0, 197, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getdeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getdeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getdeoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getdeoActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String Cropname=(String)getname.getSelectedItem();
        String quantity=getquant.getText();
        String rate=getrate.getText();
        String deo=getdeo.getText();
        try
          {
            Class.forName("com.mysql.jdbc.Driver");
            String str="jdbc:mysql://localhost/mandi";
            Connection x=DriverManager.getConnection(str,"root","12345");


            String query="insert into Stck (adharno,Cropname,Quantity,rate,doe) values(?,?,?,?,?)";
            PreparedStatement ps=x.prepareStatement(query);
            ps.setString(1,adhaarno);
            ps.setString(2,Cropname);
            ps.setString(3,quantity);
            ps.setString(4,rate);
            ps.setString(5,deo);
            int ch=ps.executeUpdate();
            if(ch==1)
            {
            JOptionPane.showMessageDialog(this,"Successfully added");
            }
           else
            {
               JOptionPane.showMessageDialog(this,"error"); 
            }
        
          }
                     catch(Exception ex)
                      {
                      ex.printStackTrace();
                      JOptionPane.showMessageDialog(this,ex.getMessage());
                       }
        
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void getnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getnameActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField getdeo;
    private javax.swing.JComboBox<String> getname;
    private javax.swing.JTextField getquant;
    private javax.swing.JTextField getrate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}