package View;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author sandhanu
 */
public class Helicopter extends javax.swing.JFrame implements DefenceUnitInterface{
//    private MainController MC;
    /**
     * Creates new form Helicopter
     */
    public Helicopter() {
        initComponents();
        setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        isAreaClearHelicopter = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnLaser = new javax.swing.JButton();
        jSpinnerSoldierCount = new javax.swing.JSpinner();
        jSpinnerAmmoCount = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HelicopterTextArea = new javax.swing.JTextArea();
        jTextFieldHelicopter = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jSlider2 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");

        isAreaClearHelicopter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        isAreaClearHelicopter.setText("Area Not Cleared");

        btnShoot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);

        btnMissile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMissile.setText("Missile");
        btnMissile.setEnabled(false);

        btnLaser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLaser.setText("Laser");
        btnLaser.setEnabled(false);
        btnLaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaserActionPerformed(evt);
            }
        });

        jSpinnerSoldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerSoldierCountStateChanged(evt);
            }
        });

        jSpinnerAmmoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerAmmoCountStateChanged(evt);
            }
        });

        jLabel2.setText("Soldier Count");

        jLabel1.setText("Ammo Count");

        HelicopterTextArea.setColumns(20);
        HelicopterTextArea.setRows(5);
        jScrollPane1.setViewportView(HelicopterTextArea);

        jTextFieldHelicopter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHelicopterActionPerformed(evt);
            }
        });

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jSlider2.setForeground(new java.awt.Color(0, 204, 0));
        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setToolTipText("");
        jSlider2.setValue(80);

        jLabel3.setText("Energy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jSpinnerAmmoCount)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(isAreaClearHelicopter)))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLaser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMissile, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHelicopter, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jSpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLaser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isAreaClearHelicopter)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldHelicopter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinnerSoldierCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerSoldierCountStateChanged
       int temp= (Integer)jSpinnerSoldierCount.getValue();
       if (temp < 0) {
        jSpinnerSoldierCount.setValue(0); // Reset spinner to 0 if a negative value is entered
        temp = 0;
    }
        MainController.getInstant().setLblHelicopterSoldierCount(temp);
        
    }//GEN-LAST:event_jSpinnerSoldierCountStateChanged

    private void jSpinnerAmmoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerAmmoCountStateChanged
         int temp= (Integer)jSpinnerAmmoCount.getValue();
        if (temp < 0) {
        jSpinnerAmmoCount.setValue(0); // Reset spinner to 0 if a negative value is entered
        temp = 0;
    }
        MainController.getInstant().setLblHelicopterAmmoCount(temp);
    }//GEN-LAST:event_jSpinnerAmmoCountStateChanged

    private void jTextFieldHelicopterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHelicopterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHelicopterActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
       String tempmsg="Heicopter msgCenter :- "+jTextFieldHelicopter.getText()+"\n";
        HelicopterTextArea.setText(HelicopterTextArea.getText()+tempmsg);
        MainController.getInstant().AddTextArea(tempmsg);
         
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnLaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaserActionPerformed

    @Override
    public void sendMsg(String tempMmsg, int tempIndex) {
      if(tempIndex==0 || tempIndex==1){
       HelicopterTextArea.setText(HelicopterTextArea.getText()+tempMmsg);
      }
    }

    
   
    
    /**
     * @param args the command line arguments
     */

    @Override
    public void isAreaChecked(String CheckedValue) {
     isAreaClearHelicopter.setText(CheckedValue);
    }

    @Override
    public void PositionValueMethod(int positionValue) {
       btnShoot.setEnabled(positionValue >= 25);
       btnMissile.setEnabled(positionValue >= 50);
       btnLaser.setEnabled(positionValue >=75);
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea HelicopterTextArea;
    private javax.swing.JButton btnLaser;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JLabel isAreaClearHelicopter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinnerAmmoCount;
    private javax.swing.JSpinner jSpinnerSoldierCount;
    private javax.swing.JTextField jTextFieldHelicopter;
    // End of variables declaration//GEN-END:variables
}
