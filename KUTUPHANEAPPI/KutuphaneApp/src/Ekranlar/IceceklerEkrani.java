/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ekranlar;

import Operasyonlar.DatabaseIslemleri;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author Şeyma
 */
public class IceceklerEkrani extends javax.swing.JFrame {

    DatabaseIslemleri dbIslemleri = new DatabaseIslemleri();

    public IceceklerEkrani() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cayRadio = new javax.swing.JRadioButton();
        kahveRadio = new javax.swing.JRadioButton();
        limonataRadio = new javax.swing.JRadioButton();
        suRadio = new javax.swing.JRadioButton();
        madenSuyuRadio = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        icecekOdeBtn = new javax.swing.JButton();
        uyeAdiArea = new javax.swing.JTextField();
        uyeSoyadiArea = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        fisArea = new javax.swing.JTextArea();
        geriBtn = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("İÇECEKLER");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(5);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n*ÇAY:3 TL \n              \n*KAHVE:7 TL\n\n*LİMONATA:12 TL\n\n*SU:2 TL\n\n*MADEN SUYU:5 TL\n\n\n\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("ÜYE ADI:");

        jLabel3.setText("ÜYE SOYADI:");

        jLabel4.setText("İÇECEK SEÇİMİ");

        buttonGroup1.add(cayRadio);
        cayRadio.setText("ÇAY");

        buttonGroup1.add(kahveRadio);
        kahveRadio.setText("KAHVE");

        buttonGroup1.add(limonataRadio);
        limonataRadio.setText("LİMONATA");

        buttonGroup1.add(suRadio);
        suRadio.setText("SU");

        buttonGroup1.add(madenSuyuRadio);
        madenSuyuRadio.setText("MADEN SUYU");

        icecekOdeBtn.setText("ÖDE");
        icecekOdeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icecekOdeBtnActionPerformed(evt);
            }
        });

        fisArea.setEditable(false);
        fisArea.setColumns(20);
        fisArea.setRows(5);
        jScrollPane2.setViewportView(fisArea);

        geriBtn.setText("GERİ");
        geriBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel4))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cayRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kahveRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limonataRadio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(icecekOdeBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(madenSuyuRadio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uyeAdiArea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uyeSoyadiArea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(geriBtn)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(uyeAdiArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(uyeSoyadiArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cayRadio)
                            .addComponent(kahveRadio)
                            .addComponent(limonataRadio)
                            .addComponent(suRadio)
                            .addComponent(madenSuyuRadio))
                        .addGap(18, 18, 18)
                        .addComponent(icecekOdeBtn)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(geriBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriBtnActionPerformed
        MenuEkrani anaMenu = new MenuEkrani();
        anaMenu.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_geriBtnActionPerformed

    //radiobutton secilen elementin textini döner..
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    private void icecekOdeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icecekOdeBtnActionPerformed

        String uyeAdi = uyeAdiArea.getText();
        String uyeSoyadi = uyeSoyadiArea.getText();
        String secilenIcecek = getSelectedButtonText(buttonGroup1);

        boolean platinMİ = dbIslemleri.platinMi(uyeAdi, uyeSoyadi);

        if (platinMİ) {
          //PLATİNSE
            if (secilenIcecek == "ÇAY") {
                fisArea.setText("Platin Üyelere ÇAY 2 TL'dir");
            }
            if (secilenIcecek == "KAHVE") {
                fisArea.setText("Platin Üyelere KAHVE 5 TL'dir");
            }
            if (secilenIcecek == "LİMONATA") {
                fisArea.setText("Platin Üyelere LİMONATA 7 TL'dir");
            }
            if (secilenIcecek == "SU") {
                fisArea.setText("Platin Üyelere SU 1 TL'dir");
            }
            if (secilenIcecek == "MADEN SUYU") {
                fisArea.setText("Platin Üyelere MADEN SUYU 3 TL'dir");
            }
        } else {
          //NORMALSE
           if (secilenIcecek == "ÇAY") {
                fisArea.setText("Normal Üyelere ÇAY 3 TL'dir");
            }
            if (secilenIcecek == "KAHVE") {
                fisArea.setText("Normal Üyelere KAHVE 7 TL'dir");
            }
            if (secilenIcecek == "LİMONATA") {
                fisArea.setText("Normal Üyelere LİMONATA 12 TL'dir");
            }
            if (secilenIcecek == "SU") {
                fisArea.setText("Normal Üyelere SU 2 TL'dir");
            }
            if (secilenIcecek == "MADEN SUYU") {
                fisArea.setText("Normal Üyelere MADEN SUYU 5 TL'dir");
            }
        }

    }//GEN-LAST:event_icecekOdeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(IceceklerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IceceklerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IceceklerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IceceklerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IceceklerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cayRadio;
    private javax.swing.JTextArea fisArea;
    private javax.swing.JButton geriBtn;
    private javax.swing.JButton icecekOdeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton kahveRadio;
    private javax.swing.JRadioButton limonataRadio;
    private javax.swing.JRadioButton madenSuyuRadio;
    private javax.swing.JRadioButton suRadio;
    private javax.swing.JTextField uyeAdiArea;
    private javax.swing.JTextField uyeSoyadiArea;
    // End of variables declaration//GEN-END:variables
}
