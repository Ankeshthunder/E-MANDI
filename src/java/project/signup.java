package java.project;


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
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sname = new javax.swing.JLabel();
        spwd = new javax.swing.JLabel();
        srpwd = new javax.swing.JLabel();
        shint = new javax.swing.JLabel();
        slogin = new javax.swing.JButton();
        getsuser = new javax.swing.JTextField();
        getadhr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        hnt = new javax.swing.JLabel();
        gethint = new javax.swing.JTextField();
        getconpwd = new javax.swing.JPasswordField();
        getpwd = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sname.setText("Farmer name");

        spwd.setText("password");

        srpwd.setText("con.password");

        shint.setText("Aadhar no");

        slogin.setBackground(new java.awt.Color(220, 15, 73));
        slogin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        slogin.setText("SAVE");
        slogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sloginActionPerformed(evt);
            }
        });

        getsuser.setBackground(new java.awt.Color(37, 245, 240));

        getadhr.setBackground(new java.awt.Color(28, 205, 239));
        getadhr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getadhrActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("FARMER SIGNUP PANEL");

        hnt.setText("Fav  crop");

        gethint.setBackground(new java.awt.Color(30, 226, 230));

        getconpwd.setBackground(new java.awt.Color(23, 209, 231));

        getpwd.setBackground(new java.awt.Color(32, 232, 242));

        back.setBackground(new java.awt.Color(249, 3, 47));
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
                        .addGap(68, 68, 68)
                        .addComponent(slogin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spwd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(srpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hnt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shint, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getadhr, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(getsuser, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(getconpwd)
                                .addComponent(getpwd))
                            .addComponent(gethint, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getsuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spwd, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getconpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srpwd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getadhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shint, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gethint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hnt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slogin)
                    .addComponent(back))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getadhrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getadhrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getadhrActionPerformed

    private void sloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sloginActionPerformed
        String uname =getsuser.getText();
        String pass = getpwd.getText();
        String conpass=getconpwd.getText();
        String adhr=getadhr.getText();
        String hnt=gethint.getText();
        System.out.println(pass);
        System.out.println(conpass);
        if(uname.endsWith("@gmail.com"))
        {
          if ( adhr.length()==12) 
          {
            if (pass.equals(conpass))
                {
                    try
                    {   
                    Class.forName("com.mysql.jdbc.Driver");
                    String str="jdbc:mysql://localhost/mandi";
                    Connection x=DriverManager.getConnection(str,"root","12345");
            //System.out.println("ankesh");

                    String query="insert into farmer(user,pwd,adhar,hint) values(?,?,?,?)";

                    PreparedStatement ps=x.prepareStatement(query);
                    ps.setString(1, uname);
                    ps.setString(2, pass);
                    ps.setString(3,adhr );
                    ps.setString(4,hnt );
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Successfully register");

                    flogin s= new flogin();
                    s.setVisible(true);
                    this.dispose();
                    }

                  catch(Exception ex)
                    {
                    ex.printStackTrace();
                    }
        
                }
                  else
                 {
                 JOptionPane.showMessageDialog(this,"passwd do not match");
                 JOptionPane.showMessageDialog(this,"please re-register yourself");
                 signup u= new signup();
                 u.setVisible(true);
                 this.dispose();
                 }
          }
          else
          {
                 JOptionPane.showMessageDialog(this,"INVALID ADHAAR");
                 JOptionPane.showMessageDialog(this,"ADHAAR NO MUST BE OF 12 CHARACTER"); 
                  signup u= new signup();
                  u.setVisible(true);
                  this.dispose();
          }
        }
        else
        {
                  JOptionPane.showMessageDialog(this,"INVALID USERNAME");
                  JOptionPane.showMessageDialog(this,"MUST BE GMAIL ACCOUNT ");
                  signup u= new signup();
                  u.setVisible(true);
                  this.dispose();
        }
                
       
    }//GEN-LAST:event_sloginActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        flogin f =new flogin();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField getadhr;
    private javax.swing.JPasswordField getconpwd;
    private javax.swing.JTextField gethint;
    private javax.swing.JPasswordField getpwd;
    private javax.swing.JTextField getsuser;
    private javax.swing.JLabel hnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel shint;
    private javax.swing.JButton slogin;
    private javax.swing.JLabel sname;
    private javax.swing.JLabel spwd;
    private javax.swing.JLabel srpwd;
    // End of variables declaration//GEN-END:variables
}
