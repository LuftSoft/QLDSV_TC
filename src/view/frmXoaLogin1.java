/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import main.Main;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class frmXoaLogin1 extends javax.swing.JFrame {

    /**
     * Creates new form frmXoaLogin
     */
    static ArrayList<String> dsServerRole;
    String user;
    int checksoluong = 0;

    public frmXoaLogin1() {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.loadDsLogin();
    }

    public static ArrayList<String> getDsLogin() {
        ArrayList<String> dsLogin = new ArrayList<String>();
        try {
            PreparedStatement pr = Main.kn.prepareStatement(
                    "SELECT name "
                    + "FROM sys.server_principals "
                    + "WHERE TYPE = 'S' "
                    + "except "
                    + "SELECT name FROM sys.server_principals "
                    + "where name='sa' or name LIKE '%##%'");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                dsLogin.add(rs.getString(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsLogin;

    }

    public void loadDsLogin() {
        ArrayList<String> dsLogin = this.getDsLogin();
        for (String e : dsLogin) {
            dslogin.addItem(e);
        }

        dslogin.setSelectedIndex(0);

    }

    public String getRole(String login) {
        String role = "";
        try {
            PreparedStatement pre = Main.kn.prepareStatement(
                    "DECLARE @UID INT"
                    + "                            DECLARE @MAGV NVARCHAR(100)"
                    + "                         SELECT @UID = uid, @MAGV = name FROM SYS.sysusers"
                    + "                            	WHERE sid = SUSER_SID(?)"
                    + "                            SELECT MAGV = @MAGV, TENNHOM= name"
                    + "                          		FROM SYS.sysusers"
                    + "                           	WHERE uid = (SELECT groupuid FROM SYS.sysmembers WHERE memberuid = @UID)"
            );
            pre.setString(1, login);
            ResultSet re = pre.executeQuery();
            ArrayList<String> dsr = new ArrayList<String>();
            while (re.next()) {
                user = re.getString(1);
                role = re.getString(2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }

    public void loadDsRole(String login) {
      
        dsrole.removeAllItems();
        dsServerRole = this.getDsServerRole(login);
        if (dsServerRole.size() == 0) {
            for (String s : dsServerRole) {
                checksoluong = 1;
               dsrole.addItem(s);
            }
        }
        if (!this.getRole(login).equals("")) {
            checksoluong = 1;
            dsrole.addItem(this.getRole(login));
        }
        
       
    }

    public ArrayList<String> getDsRole(String login) {

        dsServerRole = this.getDsServerRole(login);
        ArrayList<String> dsRole = new ArrayList<String>();
        for (String s : dsServerRole) {
            dsRole.add(s);
        }
        if (!this.getRole(login).equals("")) {
            dsRole.add(this.getRole(login));
        }
        return dsRole;
    }

    public static ArrayList<String> getDsServerRole(String login) {
        ArrayList<String> dsServerRole = new ArrayList<String>();
        try {
            PreparedStatement pr = Main.kn.prepareCall("{Call SP_GET_SERVER_ROLE(?)}");

            pr.setString(1, login);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                dsServerRole.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsServerRole;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dslogin = new javax.swing.JComboBox<>();
        dsrole = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dslogin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dsloginItemStateChanged(evt);
            }
        });
        dslogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsloginActionPerformed(evt);
            }
        });

        dsrole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsroleActionPerformed(evt);
            }
        });

        jLabel1.setText("XÓA LOGIN KHỎI ROLE");

        jLabel2.setText("Role");

        btn.setText("OK");
        btn.setEnabled(false);
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jLabel3.setText("Login");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(dslogin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dsrole, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dslogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dsrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn)
                    .addComponent(jButton2))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:

        String role = dsrole.getSelectedItem().toString();
        String login = dslogin.getSelectedItem().toString();
        if (!dsServerRole.isEmpty()) {
            for (String s : dsServerRole) {
                if (s.equals(role)) { // xoa server role

                    try {
                        PreparedStatement pre = Main.kn.prepareCall("{CALL sp_dropsrvrolemember(?,?)}");
                        pre.setString(1, login);
                        pre.setString(2, role);
                        pre.execute();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        } else {
            try {
                PreparedStatement pre = Main.kn.prepareCall("{CALL sp_droprolemember(?,?)}");
                pre.setString(1, role);
                pre.setString(2, user);
                pre.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        JOptionPane.showMessageDialog(this, "Xoa login thanh cong");
         dsrole.setEnabled(false);
              btn.setEnabled(false);
        this.loadDsRole(login);


    }//GEN-LAST:event_btnActionPerformed

    private void dsroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsroleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsroleActionPerformed

    private void dsloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsloginActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dsloginActionPerformed

    private void dsloginItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dsloginItemStateChanged
        // TODO add your handling code here:

        this.loadDsRole(dslogin.getSelectedItem().toString());
          if(checksoluong == 0) {
              dsrole.setEnabled(false);
              btn.setEnabled(false);
              
          }
          else {
              dsrole.setEnabled(true);
              checksoluong =0;
              btn.setEnabled(true);
          }
    }//GEN-LAST:event_dsloginItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        MainForm f = new MainForm();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Determine the new location of the window
        int w = f.getSize().width;
        int h = f.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        // Move the window
        f.setLocation(x, y);
        f.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmXoaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmXoaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmXoaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmXoaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmXoaLogin1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JComboBox<String> dslogin;
    private javax.swing.JComboBox<String> dsrole;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
