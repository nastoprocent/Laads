/*
*Kareem Al Tulaihi
*Java Project
*Section:Brain
*/
package laad;

/**
 *
 * @author Kareem
 */
public class BrainQA extends javax.swing.JPanel {

    /**
     * Creates new form Brain
     */
    public BrainQA() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laad/brain.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 20, 150, 150);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Answer Q2: Occipital lobe");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 250, 210, 20);

        jButton1.setText("Back to Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 370, 110, 50);

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 510, 59, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Here's the answer for the 10 Q test");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(90, 190, 300, 40);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer Q3:  Brain and Spinal Cord");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 270, 180, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer Q4: Think");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 290, 110, 20);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Answer Q6: 3 pounds (1.4 kilograms)");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 230, 180, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Answer Q1: Pons");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 230, 110, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Answer Q7: Cerebrum");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 250, 110, 20);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Answer Q8: Cerebellum");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 270, 130, 20);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Answer Q10: Nervous system");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(310, 310, 160, 20);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Answer Q5: Brain, spinal cord, and nerves");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(60, 310, 210, 20);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Answer Q9: Brain stem");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(310, 290, 120, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laad/bg1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Home k = new Home();
    k.setVisible(true);  
    dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Home a = new Home();
    a.setVisible(true);  
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}