/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages.newpackage;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author User
 */
public class dashPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form dashPage
     */
    public dashPage() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        Border border=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_manageUserBorder.setBorder(border);
        jLabel_reportBorder.setBorder(border);
        jLabel_settingBorder.setBorder(border);
        jLabel_manageUser.setForeground(Color.white);
        jLabel_report.setForeground(Color.white);
        jLabel_setting.setForeground(Color.white);
        jPanel_upBody.setBackground(Color.GRAY);
        jPanel_downBody.setBackground(Color.BLACK);
        jLabel_title.setForeground(Color.WHITE);
        jLabel_description.setForeground(Color.WHITE);      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_upBody = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jLabel_description = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel_downBody = new javax.swing.JPanel();
        jLabel_managerUserIcon = new javax.swing.JLabel();
        jLabel_manageUser = new javax.swing.JLabel();
        jLabel_manageUserBorder = new javax.swing.JLabel();
        jLabel_reportIcon = new javax.swing.JLabel();
        jLabel_report = new javax.swing.JLabel();
        jLabel_reportBorder = new javax.swing.JLabel();
        jLabel_settingIcon = new javax.swing.JLabel();
        jLabel_setting = new javax.swing.JLabel();
        jLabel_settingBorder = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_upBody.setLayout(null);

        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_title.setText("TITLE v.001");
        jPanel_upBody.add(jLabel_title);
        jLabel_title.setBounds(10, 10, 85, 17);

        jLabel_description.setText("DESCRIPTION");
        jPanel_upBody.add(jLabel_description);
        jLabel_description.setBounds(10, 40, 180, 14);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        jPanel_upBody.add(jPanel3);
        jPanel3.setBounds(440, 10, 135, 145);

        getContentPane().add(jPanel_upBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 170));

        jPanel_downBody.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_downBody.setLayout(null);

        jLabel_managerUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manage user-50.png"))); // NOI18N
        jPanel_downBody.add(jLabel_managerUserIcon);
        jLabel_managerUserIcon.setBounds(100, 60, 50, 60);

        jLabel_manageUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_manageUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_manageUser.setText("MANAGER USER");
        jLabel_manageUser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel_manageUserComponentHidden(evt);
            }
        });
        jPanel_downBody.add(jLabel_manageUser);
        jLabel_manageUser.setBounds(50, 130, 150, 20);

        jLabel_manageUserBorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_manageUserBorderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_manageUserBorderMouseExited(evt);
            }
        });
        jPanel_downBody.add(jLabel_manageUserBorder);
        jLabel_manageUserBorder.setBounds(40, 50, 160, 140);

        jLabel_reportIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/report-50.png"))); // NOI18N
        jPanel_downBody.add(jLabel_reportIcon);
        jLabel_reportIcon.setBounds(270, 60, 50, 60);

        jLabel_report.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_report.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_report.setText("REPORTS");
        jPanel_downBody.add(jLabel_report);
        jLabel_report.setBounds(250, 130, 110, 20);

        jLabel_reportBorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_reportBorderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_reportBorderMouseExited(evt);
            }
        });
        jPanel_downBody.add(jLabel_reportBorder);
        jLabel_reportBorder.setBounds(210, 50, 160, 140);

        jLabel_settingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settings-50.png"))); // NOI18N
        jPanel_downBody.add(jLabel_settingIcon);
        jLabel_settingIcon.setBounds(450, 60, 60, 60);

        jLabel_setting.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_setting.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_setting.setText("SETTING");
        jPanel_downBody.add(jLabel_setting);
        jLabel_setting.setBounds(440, 130, 80, 20);

        jLabel_settingBorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_settingBorderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_settingBorderMouseExited(evt);
            }
        });
        jPanel_downBody.add(jLabel_settingBorder);
        jLabel_settingBorder.setBounds(400, 50, 160, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/image.jpg"))); // NOI18N
        jPanel_downBody.add(jLabel1);
        jLabel1.setBounds(-60, 0, 700, 350);

        getContentPane().add(jPanel_downBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 620, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_manageUserBorderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_manageUserBorderMouseEntered
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLUE);
        jLabel_manageUserBorder.setBorder(border);
        jLabel_manageUser.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel_manageUserBorderMouseEntered

    private void jLabel_manageUserBorderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_manageUserBorderMouseExited
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_manageUserBorder.setBorder(border);                        
        jLabel_manageUser.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_manageUserBorderMouseExited

    private void jLabel_manageUserComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel_manageUserComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_manageUserComponentHidden

    private void jLabel_reportBorderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_reportBorderMouseEntered
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLUE);
        jLabel_manageUserBorder.setBorder(border);
        jLabel_manageUser.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel_reportBorderMouseEntered

    private void jLabel_reportBorderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_reportBorderMouseExited
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_reportBorder.setBorder(border);
        jLabel_report.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_reportBorderMouseExited

    private void jLabel_settingBorderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_settingBorderMouseEntered
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLUE);
        jLabel_settingBorder.setBorder(border);
        jLabel_setting.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel_settingBorderMouseEntered

    private void jLabel_settingBorderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_settingBorderMouseExited
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_settingBorder.setBorder(border);
        jLabel_setting.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_settingBorderMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_description;
    private javax.swing.JLabel jLabel_manageUser;
    private javax.swing.JLabel jLabel_manageUserBorder;
    private javax.swing.JLabel jLabel_managerUserIcon;
    private javax.swing.JLabel jLabel_report;
    private javax.swing.JLabel jLabel_reportBorder;
    private javax.swing.JLabel jLabel_reportIcon;
    private javax.swing.JLabel jLabel_setting;
    private javax.swing.JLabel jLabel_settingBorder;
    private javax.swing.JLabel jLabel_settingIcon;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_downBody;
    private javax.swing.JPanel jPanel_upBody;
    // End of variables declaration//GEN-END:variables
}
