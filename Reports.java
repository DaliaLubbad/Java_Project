package Forms;

public class Reports extends javax.swing.JFrame {

    String ID;
    int chosenyear;
    String chosenSem;
    boolean isFromIns;

    public Reports(String ID, int chosenyear, String chosenSem, boolean isFromIns) {
        this.ID = ID;
        this.chosenyear = chosenyear;
        this.chosenSem = chosenSem;
        this.isFromIns = isFromIns;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LA = new javax.swing.JButton();
        CL = new javax.swing.JButton();
        SA = new javax.swing.JButton();
        sa25 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REPORTS");

        LA.setText("Lecture Attencence");
        LA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAActionPerformed(evt);
            }
        });

        CL.setText("Courses Lectures ");
        CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLActionPerformed(evt);
            }
        });

        SA.setText("Search By Title");
        SA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAActionPerformed(evt);
            }
        });

        sa25.setText("Student Absent more than 25%");
        sa25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sa25ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sa25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LA)
                .addGap(18, 18, 18)
                .addComponent(CL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SA)
                .addGap(18, 18, 18)
                .addComponent(sa25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAActionPerformed
   
        if (isFromIns) {
             view1 v1 = new view1(ID, chosenyear, chosenSem, true);
            v1.add2combo(ID, chosenyear, chosenSem);
            this.setVisible(false);
            v1.setVisible(true);
        } else {
                
        view1 v2 = new view1(ID, chosenyear, chosenSem, false);
            v2.add2combo(ID, chosenyear, chosenSem);
            this.setVisible(false);
            v2.setVisible(true);
        }

    }//GEN-LAST:event_LAActionPerformed

    private void sa25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sa25ActionPerformed

        if (isFromIns) {
            MoreThan25ta mta = new MoreThan25ta(ID, chosenyear, chosenSem, true);
            mta.add2combo(ID, chosenyear, chosenSem);
            this.setVisible(false);
            mta.setVisible(true);
        } else {
            MoreThan25ta mta2 = new MoreThan25ta(ID, chosenyear, chosenSem, false);

            mta2.add2combo(ID, chosenyear, chosenSem);
            this.setVisible(false);
            mta2.setVisible(true);
        }

    }//GEN-LAST:event_sa25ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isFromIns) {
            instructor i = new instructor(ID);
            i.userName(ID);
            this.setVisible(false);
            i.setVisible(true);

        } else {
            TeacherAssistant t = new TeacherAssistant(ID);
            t.userName(ID);
            this.setVisible(false);
            t.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAActionPerformed

        if (isFromIns) {
            lecTitle l1 = new lecTitle(ID, chosenyear, chosenSem, true);
            this.setVisible(false);
            l1.setVisible(true);
        } else {
            lecTitle l2 = new lecTitle(ID, chosenyear, chosenSem, false);
            this.setVisible(false);
            l2.setVisible(true);
        }
    }//GEN-LAST:event_SAActionPerformed

    private void CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLActionPerformed

        if (isFromIns) {
            lectureViewit l1 = new lectureViewit(ID, chosenyear, chosenSem, true);
            this.setVisible(false);
            l1.setVisible(true);
        } else {
            lectureViewit l2 = new lectureViewit(ID, chosenyear, chosenSem, false);
            this.setVisible(false);
            l2.setVisible(true);
        }

    }//GEN-LAST:event_CLActionPerformed
    public int getYear() {
        return this.chosenyear;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CL;
    private javax.swing.JButton LA;
    private javax.swing.JButton SA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sa25;
    // End of variables declaration//GEN-END:variables
}
