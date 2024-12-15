/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import finalproject.ConnectToDB;
import finalproject.DataBase;
import finalproject.Views;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class MoreThan25ta extends javax.swing.JFrame {

    DataBase db;
    ConnectToDB db2;
    String id;
    int year;
    String sem;
    boolean isFromIns;

    public MoreThan25ta() {
        initComponents();
        db = new DataBase();
        db2 = new ConnectToDB();
        setComboBoxes();
    }

    public MoreThan25ta(String id, int year, String sem, boolean is_from_inst) {
        initComponents();
        db = new DataBase();
        db2 = new ConnectToDB();
        this.id = id;
        this.isFromIns = is_from_inst;
        this.year = year;
        this.sem = sem;
        setComboBoxes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        courses = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_show = new javax.swing.JButton();
        btn_export = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Students who skipped more than 25% of courses lectures");

        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
            }
        });

        jLabel2.setText("Coose Course");

        btn_show.setText("show");
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        btn_export.setText("Export to Excel");
        btn_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Std_id", "Sec_id"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btn_export, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btn_show))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_show))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btn_export)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
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

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        Views v = new Views();
        try {
            if (jTable1.getRowCount() > 0) {
                ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
            }
            v.getMoreThan25(courses.getSelectedItem().toString(), jTable1, year, sem);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btn_showActionPerformed

    private void btn_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportActionPerformed

        JFileChooser fchooser = new JFileChooser();
        int option = fchooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String name = fchooser.getSelectedFile().getName();
            String path = fchooser.getSelectedFile().getParentFile().getParent();
            String file = Paths.get(path, name).toString();
            export(jTable1, fchooser.getSelectedFile());
        }
    }//GEN-LAST:event_btn_exportActionPerformed
    public void add2combo(String ID, int year, String sem) {
        if (isFromIns) {
            ObservableList<String> coursesL = FXCollections.observableList(db2.getInstructorCourse_id2(ID,
                    year, sem));
            for (int i = 0; i < coursesL.size(); i++) {
                courses.addItem(coursesL.get(i));

            }
        } else {
            ObservableList<String> coursesL = FXCollections.observableList(db2.gettaCourse_id(ID,
                    year, sem));
            for (int i = 0; i < coursesL.size(); i++) {
                courses.addItem(coursesL.get(i));

            }

        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         if (isFromIns) {
            Reports r = new Reports(id, year, sem, true);
            this.setVisible(false);
            r.setVisible(true);}
        else{
           Reports r = new Reports(id, year, sem, false);
            this.setVisible(false);
            r.setVisible(true);  
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesActionPerformed

    public void export(JTable table, File file) {
        try {
            HSSFWorkbook info = new HSSFWorkbook();
            HSSFSheet sheet = info.createSheet();
            HSSFRow row = sheet.createRow((short) 0);
            TableModel model = table.getModel();
            for (int i = 0; i < model.getColumnCount(); i++) {
                row.createCell((short) i).setCellValue(model.getColumnName(i));
            }
            for (int i = 0; i < table.getRowCount(); i++) {
                HSSFRow row2 = sheet.createRow((short) i + 1);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    row2.createCell((short) j).setCellValue(table.getValueAt(i, j) == null ? "" : table.getValueAt(i, j) + "");
                }

            }
            try (FileOutputStream fileOut = new FileOutputStream(file)) {
                info.write(fileOut);
            }
            JOptionPane.showMessageDialog(null, "sucessfully");
        } catch (HeadlessException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void setComboBoxes() {
        if (isFromIns) {
            ArrayList<String> ids = db2.getInsCourseIDs(id);
            for (int i = 0; i < ids.size(); i++) {
                courses.addItem(ids.get(i));
            }
            //courses.setSelectedIndex(0);
        } else {
            ArrayList<String> ids = db2.gettaCourse_id2(id);
            for (int i = 0; i < ids.size(); i++) {
                courses.addItem(ids.get(i));
            }
            //courses.setSelectedIndex(0);
        }
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_export;
    private javax.swing.JButton btn_show;
    private javax.swing.JComboBox<String> courses;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
