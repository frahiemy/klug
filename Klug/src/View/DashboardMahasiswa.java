/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author faiz
 */
public class DashboardMahasiswa extends javax.swing.JFrame implements View{

    /**
     * Creates new form Login
     */
    public DashboardMahasiswa() {
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

        backgroundKlug1 = new img.BackgroundKlug();
        btn_materi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        btn_tugas = new javax.swing.JButton();
        btn_quiz = new javax.swing.JButton();
        btn_pelaporan = new javax.swing.JButton();
        btn_akun = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);

        backgroundKlug1.setMaximumSize(new java.awt.Dimension(800, 600));
        backgroundKlug1.setMinimumSize(new java.awt.Dimension(800, 600));
        backgroundKlug1.setPreferredSize(new java.awt.Dimension(800, 600));

        btn_materi.setBackground(new java.awt.Color(255, 255, 255));
        btn_materi.setFont(new java.awt.Font("Aller", 0, 24)); // NOI18N
        btn_materi.setForeground(new java.awt.Color(238, 95, 1));
        btn_materi.setText("Materi");
        btn_materi.setBorderPainted(false);

        jLabel3.setFont(new java.awt.Font("Aller", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard Mahasiswa");

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setFont(new java.awt.Font("Aller", 0, 18)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });

        close1.setBackground(new java.awt.Color(255, 255, 255));
        close1.setFont(new java.awt.Font("Aller", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                close1MouseReleased(evt);
            }
        });

        btn_tugas.setBackground(new java.awt.Color(255, 255, 255));
        btn_tugas.setFont(new java.awt.Font("Aller", 0, 24)); // NOI18N
        btn_tugas.setForeground(new java.awt.Color(238, 95, 1));
        btn_tugas.setText("Tugas");
        btn_tugas.setBorderPainted(false);

        btn_quiz.setBackground(new java.awt.Color(255, 255, 255));
        btn_quiz.setFont(new java.awt.Font("Aller", 0, 24)); // NOI18N
        btn_quiz.setForeground(new java.awt.Color(238, 95, 1));
        btn_quiz.setText("Quiz");
        btn_quiz.setBorderPainted(false);

        btn_pelaporan.setBackground(new java.awt.Color(255, 255, 255));
        btn_pelaporan.setFont(new java.awt.Font("Aller", 0, 24)); // NOI18N
        btn_pelaporan.setForeground(new java.awt.Color(238, 95, 1));
        btn_pelaporan.setText("Pelaporan");
        btn_pelaporan.setBorderPainted(false);

        btn_akun.setBackground(new java.awt.Color(255, 255, 255));
        btn_akun.setFont(new java.awt.Font("Aller", 0, 24)); // NOI18N
        btn_akun.setForeground(new java.awt.Color(238, 95, 1));
        btn_akun.setText("Akun");
        btn_akun.setBorderPainted(false);

        btn_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout.setFont(new java.awt.Font("Aller", 0, 24)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(238, 95, 1));
        btn_logout.setText("Logout");
        btn_logout.setBorderPainted(false);

        javax.swing.GroupLayout backgroundKlug1Layout = new javax.swing.GroupLayout(backgroundKlug1);
        backgroundKlug1.setLayout(backgroundKlug1Layout);
        backgroundKlug1Layout.setHorizontalGroup(
            backgroundKlug1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundKlug1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(backgroundKlug1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(backgroundKlug1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_akun, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pelaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tugas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_materi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundKlug1Layout.setVerticalGroup(
            backgroundKlug1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundKlug1Layout.createSequentialGroup()
                .addGroup(backgroundKlug1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundKlug1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(close1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundKlug1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)))
                .addGap(90, 90, 90)
                .addComponent(btn_materi)
                .addGap(18, 18, 18)
                .addComponent(btn_tugas)
                .addGap(18, 18, 18)
                .addComponent(btn_quiz)
                .addGap(18, 18, 18)
                .addComponent(btn_pelaporan)
                .addGap(18, 18, 18)
                .addComponent(btn_akun)
                .addGap(18, 18, 18)
                .addComponent(btn_logout)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundKlug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundKlug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseReleased
        this.setState(DashboardMahasiswa.ICONIFIED);
    }//GEN-LAST:event_close1MouseReleased

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        System.exit(0);
    }//GEN-LAST:event_closeMouseReleased

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
            java.util.logging.Logger.getLogger(DashboardMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private img.BackgroundKlug backgroundKlug1;
    private javax.swing.JButton btn_akun;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_materi;
    private javax.swing.JButton btn_pelaporan;
    private javax.swing.JButton btn_quiz;
    private javax.swing.JButton btn_tugas;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_akun() {
        return btn_akun;
    }

    public JButton getBtn_logout() {
        return btn_logout;
    }

    public JButton getBtn_materi() {
        return btn_materi;
    }

    public JButton getBtn_pelaporan() {
        return btn_pelaporan;
    }

    public JButton getBtn_quiz() {
        return btn_quiz;
    }

    public JButton getBtn_tugas() {
        return btn_tugas;
    }
    
    @Override
    public void addActionListener(ActionListener e) {
        btn_akun.addActionListener(e);
        btn_logout.addActionListener(e);
        btn_materi.addActionListener(e);
        btn_pelaporan.addActionListener(e);
        btn_quiz.addActionListener(e);
        btn_tugas.addActionListener(e);
    }
}
