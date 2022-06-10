/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import main.Main;
import Connection.KetNoiMSSQL;
import java.awt.Dimension;
import java.awt.Toolkit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Main;

/**
 *
 * @author LENOVO
 */
public class frmDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form frmDangNhap
     */
    public frmDangNhap() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tendangnhapTF = new javax.swing.JTextField();
        matkhauP = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnDangNhap1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên đăng nhập");

        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        jLabel2.setText("Mật khẩu");

        tendangnhapTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tendangnhapTFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ĐĂNG NHẬP");

        btnDangNhap1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangNhap1.setText("Thoát");
        btnDangNhap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhap1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDangNhap)
                        .addGap(18, 18, 18)
                        .addComponent(btnDangNhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tendangnhapTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matkhauP, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tendangnhapTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matkhauP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangNhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tendangnhapTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tendangnhapTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tendangnhapTFActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        String tendangnhap = tendangnhapTF.getText().toString();
        //char[] matkhau = matkhauP.getPassword().toString(); -- toString tra ve ko dung cai da nhap
        String matkhau = String.valueOf(matkhauP.getPassword());
        if (tendangnhap.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống tên đăng nhập");
        } else if (matkhau.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "không để trống mật khẩu");
        } else {
            try {
                Main.kn = KetNoiMSSQL.getKetNoi(tendangnhap, matkhau);
                if (Main.kn == null) {
                    JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không đúng");
                } 
                else {
                    PreparedStatement pre = Main.kn.prepareStatement(
                            " DECLARE @UID INT"
                            + " DECLARE @MAGV NVARCHAR(100)"
                            + " SELECT @UID = uid, @MAGV = name FROM SYS.sysusers"
                            + "	WHERE sid = SUSER_SID(?)"
                            + " SELECT MAGV = @MAGV,"
                            + "		TENNHOM= name"
                            + "		FROM SYS.sysusers"
                            + "		WHERE uid = (SELECT groupuid FROM SYS.sysmembers WHERE memberuid = @UID)"
                    );
                    pre.setString(1, tendangnhap);
                    ResultSet re = pre.executeQuery();
                    while (re.next()) {
                        
                        Main.role = re.getString("TENNHOM");
                        Main.user = re.getString("MAGV");
                        System.out.println("role bang"+Main.role);
                        System.out.println("user bang"+Main.user);
                    }
                    pre = Main.kn.prepareStatement("SELECT MAKHOA FROM GIANGVIEN WHERE MAGV = '" + Main.user + "'");
                    re = pre.executeQuery();
                    while(re.next()) {
                        Main.khoa = re.getString(1);
                    }
                    System.out.println("khoa" + Main.khoa);
                    dispose();
                    Main.loginName = tendangnhap;
                    Main.password = matkhau;
                 
                    MainForm f = new MainForm();
                    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                    int w = f.getSize().width;
                    int h = f.getSize().height;
                    int x = (dim.width-w)/2;
                    int y = (dim.height-h)/2;
                    f.setLocation(x, y);
                    f.setVisible(true);

                }
            } catch (SQLException ex) {
                Logger.getLogger(frmDangNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       

    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangNhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhap1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnDangNhap1ActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(frmDangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnDangNhap1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField matkhauP;
    private javax.swing.JTextField tendangnhapTF;
    // End of variables declaration//GEN-END:variables
}
