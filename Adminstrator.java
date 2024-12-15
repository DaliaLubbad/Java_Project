package Forms;

import finalproject.DataBase;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Adminstrator extends javax.swing.JFrame {

    DataBase db;

    public Adminstrator() {
        db = new DataBase();
        initComponents();
        setComboBoxes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tabbedPane_course = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btn_addCourse = new javax.swing.JButton();
        txt_courseName = new javax.swing.JTextField();
        txt_courseBook = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_addCourseMessage = new javax.swing.JLabel();
        combo_depAddcourse = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        lbl_courseIDAddCourse = new javax.swing.JLabel();
        combo_instrAdd = new javax.swing.JComboBox<>();
        txt_yearAddCourse = new javax.swing.JTextField();
        comb_semesterAddCourse = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        comb_TAaddCourse = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        btn_deleteCourse = new javax.swing.JButton();
        combo_deleteCourse = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lbl_courseNameDelete = new javax.swing.JLabel();
        lbl_deleteCourseMessage = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbl_deptDeleteCourse = new javax.swing.JLabel();
        comb_yearDeleteCourse = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        comb_semesterDeleteCourse = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        combo_editCourse = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_newName = new javax.swing.JTextField();
        btn_editCourse = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_newBook = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        combo_newInstructor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        combo_newTA = new javax.swing.JComboBox<>();
        lbl_editCourseMessage = new javax.swing.JLabel();
        comb_yearEditCourse = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        comb_semesterEditCourse = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        combo_course = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        comb_TA = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        tabbed_TA = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        como_depAddTA = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txt_nameAddTA = new javax.swing.JTextField();
        txt_passAddTA = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        btn_addTA = new javax.swing.JButton();
        lbl_IDAddTA = new javax.swing.JLabel();
        lbl_addTAMessage = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        comb_TADelete = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbl_TANameDeleteTA = new javax.swing.JLabel();
        lbl_deptDeleteTA = new javax.swing.JLabel();
        btn_deleteTA = new javax.swing.JButton();
        lbl_DeleteTAMessage = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        comb_newDeptEditTA = new javax.swing.JComboBox<>();
        txt_newNameEditTA = new javax.swing.JTextField();
        btn_editTA = new javax.swing.JButton();
        lbl_updateTAMessage = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        comb_chooseTAedit = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        comb_instructor = new javax.swing.JComboBox<>();
        tabbed_instructor = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        comb_deptAddinstr = new javax.swing.JComboBox<>();
        txt_nameAddInstr = new javax.swing.JTextField();
        btn_addInstr = new javax.swing.JButton();
        lbl_addIntrMessage = new javax.swing.JLabel();
        lbl_IDAddInstr = new javax.swing.JLabel();
        txt_passAddInstr = new javax.swing.JPasswordField();
        jPanel17 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        comb_instrDelete = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lbl_DeleteInstrMessage = new javax.swing.JLabel();
        lbl_firstNameDeleteInstr = new javax.swing.JLabel();
        lbl_lastNameDeleteInstr = new javax.swing.JLabel();
        btn_deleteInstr = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        comb_newDeptEditInstr = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        txt_newNameEditInst = new javax.swing.JTextField();
        btn_editInstr = new javax.swing.JButton();
        lbl_editInstrMessage = new javax.swing.JLabel();
        comb_chooseinstr = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        comb_section = new javax.swing.JComboBox<>();
        tabbed_section = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        comb_courseIDaddSec = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comb_semesterAddsec = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        comb_yearAddSec = new javax.swing.JComboBox<>();
        comb_roomnumAddSec = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        lbl_addSecMessage = new javax.swing.JLabel();
        lbl_secIDAddSEC = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        comb_chooseCourseDeleteSec = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        comb_chooseSecDeleteSec = new javax.swing.JComboBox<>();
        lbl_DeleteSecMessage = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        comb_yearDeleteSec = new javax.swing.JComboBox<>();
        comb_semesterDeletesec = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        comb_CourseIDEditsec = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        comb_newRoomnum = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        comb_chooseSecEditSec = new javax.swing.JComboBox<>();
        lbl_updateSecMessage = new javax.swing.JLabel();
        comb_YearEditSec = new javax.swing.JComboBox<>();
        com_SemesterEditsec = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lbl_adminName = new javax.swing.JLabel();
        btn_Course = new javax.swing.JButton();
        btn_TA = new javax.swing.JButton();
        btn_Instructor = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();
        btn_section = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel24.setText("jLabel24");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        tabbedPane_course.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        btn_addCourse.setText("Add Course");
        btn_addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCourseActionPerformed(evt);
            }
        });

        jLabel2.setText("Course's Name");

        jLabel3.setText("Course's Book");

        jLabel8.setText("Instructor");

        jLabel9.setText("TA");

        lbl_addCourseMessage.setText(".............");

        combo_depAddcourse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_depAddcourseItemStateChanged(evt);
            }
        });
        combo_depAddcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_depAddcourseActionPerformed(evt);
            }
        });

        jLabel12.setText("Depatment");

        lbl_courseIDAddCourse.setText("..");

        comb_semesterAddCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Summer", "Fall", "Spring" }));

        jLabel16.setText("Semester");

        jLabel17.setText("Year");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_addCourseMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_addCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(combo_instrAdd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_yearAddCourse)
                                .addComponent(comb_semesterAddCourse, 0, 166, Short.MAX_VALUE)
                                .addComponent(txt_courseBook)
                                .addComponent(txt_courseName)
                                .addComponent(combo_depAddcourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comb_TAaddCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_courseIDAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_depAddcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_courseIDAddCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_courseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_courseBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comb_semesterAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yearAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comb_TAaddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(4, 4, 4)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_instrAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_addCourseMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_addCourse)
                .addGap(35, 35, 35))
        );

        tabbedPane_course.addTab("tab1", jPanel5);

        btn_deleteCourse.setText("Delete Course");
        btn_deleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteCourseActionPerformed(evt);
            }
        });

        combo_deleteCourse.setSelectedIndex(-1);
        combo_deleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_deleteCourseActionPerformed(evt);
            }
        });

        jLabel5.setText("Choose a Course");

        lbl_courseNameDelete.setText("..");

        lbl_deleteCourseMessage.setText("................");

        jLabel25.setText("Name");

        jLabel26.setText("Department");

        lbl_deptDeleteCourse.setText("..");

        comb_yearDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_yearDeleteCourseActionPerformed(evt);
            }
        });

        jLabel35.setText("Choose a Semester");

        jLabel38.setText("Choose a Year");

        jButton5.setText("Select");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("Select");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_deleteCourseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_deleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addGap(20, 20, 20)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_deptDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_courseNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comb_yearDeleteCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_deleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comb_semesterDeleteCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton8))
                .addGap(133, 133, 133))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_deleteCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38)
                    .addComponent(comb_yearDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(comb_semesterDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(lbl_deptDeleteCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(lbl_courseNameDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_deleteCourse)
                    .addComponent(lbl_deleteCourseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        tabbedPane_course.addTab("tab2", jPanel6);

        combo_editCourse.setSelectedIndex(-1);
        combo_editCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_editCourseActionPerformed(evt);
            }
        });

        jLabel4.setText("Choose A Course");

        jLabel6.setText("New Name");

        btn_editCourse.setText("Edit");
        btn_editCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editCourseActionPerformed(evt);
            }
        });

        jLabel1.setText("New Book");

        jLabel10.setText("New Instructor");

        combo_newInstructor.setSelectedIndex(-1);

        jLabel11.setText("New TA");

        combo_newTA.setSelectedIndex(-1);

        lbl_editCourseMessage.setText("............");

        comb_yearEditCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_yearEditCourseActionPerformed(evt);
            }
        });

        jLabel41.setText("year");

        jLabel45.setText("semester");

        jButton7.setText("Select");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Select");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_editCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combo_newTA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_newInstructor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_newBook, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_newName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(comb_yearEditCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(combo_editCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comb_semesterEditCourse, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_editCourseMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(369, 369, 369))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_editCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comb_yearEditCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(comb_semesterEditCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_newBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(combo_newInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(combo_newTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_editCourseMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editCourse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane_course.addTab("tab3", jPanel8);

        combo_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add Course", "Delete Course", "update Course " }));
        combo_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_courseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane_course, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_course, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(combo_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane_course, javax.swing.GroupLayout.PREFERRED_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comb_TA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add TA", "Delete TA", "Edit TA" }));
        comb_TA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_TAActionPerformed(evt);
            }
        });
        jPanel2.add(comb_TA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, 146, -1));

        tabbed_TA.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Department");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 80, -1));

        jPanel10.add(como_depAddTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 25, 141, -1));

        jLabel15.setText("Name");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 80, -1));
        jPanel10.add(txt_nameAddTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 51, 141, -1));
        jPanel10.add(txt_passAddTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 141, -1));

        jLabel19.setText("Passward");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        btn_addTA.setText("Add TA");
        btn_addTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTAActionPerformed(evt);
            }
        });
        jPanel10.add(btn_addTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 80, 20));

        lbl_IDAddTA.setText("..");
        jPanel10.add(lbl_IDAddTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 130, 40));

        lbl_addTAMessage.setText("..");
        jPanel10.add(lbl_addTAMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 140, 40));

        tabbed_TA.addTab("tab1", jPanel10);

        jLabel14.setText("Choose TA");

        comb_TADelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_TADeleteActionPerformed(evt);
            }
        });

        jLabel21.setText("Name");

        jLabel22.setText("Department");

        lbl_TANameDeleteTA.setText("..");

        lbl_deptDeleteTA.setText("..");

        btn_deleteTA.setText("Delete");
        btn_deleteTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteTAActionPerformed(evt);
            }
        });

        lbl_DeleteTAMessage.setText("..");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_deleteTA, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comb_TADelete, 0, 140, Short.MAX_VALUE)
                            .addComponent(lbl_TANameDeleteTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_deptDeleteTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40)
                .addComponent(lbl_DeleteTAMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comb_TADelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_TANameDeleteTA)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbl_DeleteTAMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_deptDeleteTA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_deleteTA)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tabbed_TA.addTab("tab2", jPanel11);

        jLabel36.setText("New Department");

        jLabel37.setText("New  Name");

        btn_editTA.setText("Edit");
        btn_editTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editTAActionPerformed(evt);
            }
        });

        lbl_updateTAMessage.setText("..");

        jLabel54.setText("Edit TA");

        comb_chooseTAedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_chooseTAeditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comb_newDeptEditTA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_newNameEditTA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comb_chooseTAedit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_editTA, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(lbl_updateTAMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(comb_chooseTAedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_updateTAMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comb_newDeptEditTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_newNameEditTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))))
                .addGap(17, 17, 17)
                .addComponent(btn_editTA)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        tabbed_TA.addTab("tab3", jPanel12);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(tabbed_TA, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(tabbed_TA, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));

        jTabbedPane1.addTab("tab2", jPanel2);

        comb_instructor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add Instructor", "Delete Instructor", "Edit Instructor" }));
        comb_instructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_instructorActionPerformed(evt);
            }
        });

        tabbed_instructor.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jLabel43.setText("Department");

        jLabel44.setText(" Name");

        jLabel46.setText("Passward");

        btn_addInstr.setText("Add");
        btn_addInstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addInstrActionPerformed(evt);
            }
        });

        lbl_addIntrMessage.setText("..");

        lbl_IDAddInstr.setText("..");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_addInstr, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comb_deptAddinstr, 0, 128, Short.MAX_VALUE)
                                        .addComponent(txt_nameAddInstr)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_passAddInstr))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_IDAddInstr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_addIntrMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 269, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(comb_deptAddinstr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nameAddInstr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_passAddInstr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbl_IDAddInstr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_addInstr)
                .addGap(15, 15, 15)
                .addComponent(lbl_addIntrMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbed_instructor.addTab("tab1", jPanel4);

        jLabel47.setText("Choose Instructor");

        comb_instrDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_instrDeleteActionPerformed(evt);
            }
        });

        jLabel48.setText("First Name");

        jLabel49.setText("Middle Name");

        lbl_DeleteInstrMessage.setText("..");

        lbl_firstNameDeleteInstr.setText("..");

        lbl_lastNameDeleteInstr.setText("..");

        btn_deleteInstr.setText("Delete");
        btn_deleteInstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteInstrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(lbl_DeleteInstrMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteInstr, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comb_instrDelete, 0, 152, Short.MAX_VALUE)
                            .addComponent(lbl_firstNameDeleteInstr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_lastNameDeleteInstr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comb_instrDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(lbl_firstNameDeleteInstr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(lbl_lastNameDeleteInstr))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_deleteInstr)
                    .addComponent(lbl_DeleteInstrMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tabbed_instructor.addTab("tab2", jPanel17);

        jLabel50.setText("New Department");

        jLabel51.setText("New Name");

        btn_editInstr.setText("Edit");
        btn_editInstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editInstrActionPerformed(evt);
            }
        });

        lbl_editInstrMessage.setText("..");

        comb_chooseinstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_chooseinstrActionPerformed(evt);
            }
        });

        jLabel52.setText("Choose Instructor");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(lbl_editInstrMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(btn_editInstr, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comb_chooseinstr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comb_newDeptEditInstr, 0, 130, Short.MAX_VALUE)
                            .addComponent(txt_newNameEditInst))))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_chooseinstr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addGap(5, 5, 5)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_newDeptEditInstr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_newNameEditInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(36, 36, 36)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_editInstrMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editInstr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tabbed_instructor.addTab("tab3", jPanel18);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comb_instructor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabbed_instructor)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(comb_instructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbed_instructor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        comb_section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add Section", "Delete Section", "Edit Section" }));
        comb_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_sectionActionPerformed(evt);
            }
        });

        tabbed_section.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        comb_courseIDaddSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_courseIDaddSecActionPerformed(evt);
            }
        });

        jLabel23.setText("Course ID");

        jLabel18.setText("Semester ");

        jLabel20.setText("Year");

        comb_yearAddSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_yearAddSecActionPerformed(evt);
            }
        });

        jLabel27.setText("Room Number");

        btn_add.setText("Add ");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        lbl_addSecMessage.setText("..");

        lbl_secIDAddSEC.setText("..");

        jButton6.setText("Select");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comb_roomnumAddSec, 0, 133, Short.MAX_VALUE)
                            .addComponent(comb_courseIDaddSec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_addSecMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comb_semesterAddsec, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comb_yearAddSec, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_secIDAddSEC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_courseIDaddSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comb_yearAddSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_semesterAddsec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comb_roomnumAddSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_addSecMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_secIDAddSEC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        tabbed_section.addTab("tab1", jPanel21);

        comb_chooseCourseDeleteSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_chooseCourseDeleteSecActionPerformed(evt);
            }
        });

        jLabel28.setText("Choose A Course");

        jLabel29.setText("Choose A Section");

        comb_chooseSecDeleteSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_chooseSecDeleteSecActionPerformed(evt);
            }
        });

        lbl_DeleteSecMessage.setText("..");

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel39.setText("Semester");

        jLabel40.setText("Year");

        comb_yearDeleteSec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comb_yearDeleteSecItemStateChanged(evt);
            }
        });
        comb_yearDeleteSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_yearDeleteSecActionPerformed(evt);
            }
        });

        comb_semesterDeletesec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comb_semesterDeletesecItemStateChanged(evt);
            }
        });
        comb_semesterDeletesec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_semesterDeletesecActionPerformed(evt);
            }
        });

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_DeleteSecMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comb_chooseCourseDeleteSec, 0, 131, Short.MAX_VALUE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comb_yearDeleteSec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comb_chooseSecDeleteSec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(comb_semesterDeletesec, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_chooseCourseDeleteSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_yearDeleteSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_semesterDeletesec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_chooseSecDeleteSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(33, 33, 33)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DeleteSecMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        tabbed_section.addTab("tab2", jPanel15);

        jLabel30.setText("Course ID");

        comb_CourseIDEditsec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_CourseIDEditsecActionPerformed(evt);
            }
        });

        jLabel31.setText("Year");

        jLabel32.setText("Semester");

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jLabel33.setText("New Room Num");

        jLabel34.setText("Section ID");

        lbl_updateSecMessage.setText("..");

        comb_YearEditSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_YearEditSecActionPerformed(evt);
            }
        });

        com_SemesterEditsec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_SemesterEditsecActionPerformed(evt);
            }
        });

        jButton3.setText("Select");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Seect");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_updateSecMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(comb_newRoomnum, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comb_CourseIDEditsec, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comb_chooseSecEditSec, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(com_SemesterEditsec, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE)
                                .addComponent(comb_YearEditSec, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_CourseIDEditsec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(comb_YearEditSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(com_SemesterEditsec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_chooseSecEditSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comb_newRoomnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_updateSecMessage)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        tabbed_section.addTab("tab3", jPanel22);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comb_section, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabbed_section)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comb_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbed_section))
        );

        jTabbedPane1.addTab("tab4", jPanel16);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 560, 380));

        lbl_adminName.setText("ADMIN");

        btn_Course.setText("Course");
        btn_Course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CourseActionPerformed(evt);
            }
        });

        btn_TA.setText(" TA");
        btn_TA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TAActionPerformed(evt);
            }
        });

        btn_Instructor.setText("Instructor");
        btn_Instructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InstructorActionPerformed(evt);
            }
        });

        btn_report.setText("Report");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        btn_section.setText("Section");
        btn_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_adminName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btn_Course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_TA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Instructor, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
            .addComponent(btn_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_section, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_Course)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_TA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Instructor)
                .addGap(5, 5, 5)
                .addComponent(btn_section)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_report)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InstructorActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btn_InstructorActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        AdminViews v = new AdminViews();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_reportActionPerformed

    private void btn_TAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TAActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_TAActionPerformed

    private void btn_CourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CourseActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btn_CourseActionPerformed

    private void combo_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_courseActionPerformed
        int index = combo_course.getSelectedIndex();
        tabbedPane_course.setSelectedIndex(index);
    }//GEN-LAST:event_combo_courseActionPerformed

    private void combo_deleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_deleteCourseActionPerformed
        ArrayList<String> years = db.getyear((String) combo_deleteCourse.getSelectedItem());
        if (comb_yearDeleteCourse.getItemCount() > 0) {
            comb_yearDeleteCourse.removeAllItems();
        }
        if (years.size() > 0) {
            for (int i = 0; i < years.size(); i++) {
                comb_yearDeleteCourse.addItem(years.get(i));
            }
            comb_yearDeleteCourse.setSelectedIndex(0);
        }


    }//GEN-LAST:event_combo_deleteCourseActionPerformed

    private void btn_deleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCourseActionPerformed
        try {
            String id = (String) combo_deleteCourse.getSelectedItem();
            String s = (String) comb_semesterDeleteCourse.getSelectedItem();
            int y = Integer.parseInt((String) comb_yearDeleteCourse.getSelectedItem());
            String msg = db.deleteCourse(id, s, y);
            if (!msg.equals("")) {
                lbl_deleteCourseMessage.setText(msg);
            } else {
                lbl_deleteCourseMessage.setText("something went wrong try again later..");
            }
            setComboBoxes();
            setcombpbpx2(evt);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_deleteCourseActionPerformed

    private void combo_depAddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_depAddcourseActionPerformed

    }//GEN-LAST:event_combo_depAddcourseActionPerformed

    private void combo_depAddcourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_depAddcourseItemStateChanged
        ArrayList<String> instructor_inDep
                = db.getinstrInDep((String) combo_depAddcourse.getSelectedItem());
        if (combo_instrAdd.getItemCount() > 0) {
            combo_instrAdd.removeAllItems();
        }
        for (int i = 0; i < instructor_inDep.size(); i++) {
            combo_instrAdd.addItem(instructor_inDep.get(i));
        }
        if (instructor_inDep.size() > 0) {
            combo_instrAdd.setSelectedIndex(0);
        } else {
            lbl_addCourseMessage.setText("there's no TA in this department yet.. ");
        }

        ArrayList<String> TAaddCourse = db.getTAInDep("" + combo_depAddcourse.getSelectedItem());
        if (comb_TAaddCourse.getItemCount() > 0) {
            comb_TAaddCourse.removeAllItems();
        }
        for (int i = 0; i < TAaddCourse.size(); i++) {
            comb_TAaddCourse.addItem(TAaddCourse.get(i));
        }
        if (TAaddCourse.size() > 0) {
            comb_TAaddCourse.setSelectedIndex(0);
        } else {
            lbl_addCourseMessage.setText("there's no TA in this department yet.. ");
        }
    }//GEN-LAST:event_combo_depAddcourseItemStateChanged

    private void btn_addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCourseActionPerformed
        try {

            String dept_name = combo_depAddcourse.getSelectedItem().toString();
            String titel = txt_courseName.getText();
            String book = txt_courseBook.getText();
            String instr = combo_instrAdd.getSelectedItem().toString();
            String year = txt_yearAddCourse.getText();
            String semester = comb_semesterAddCourse.getSelectedItem().toString();
            String TA = comb_TAaddCourse.getSelectedItem().toString();
            if (!db.isCourseExist(dept_name, titel, book, semester, Integer.parseInt(year))) {
                String msg = db.insertCourse(dept_name, titel, book, semester, instr, TA, Integer.parseInt(year));
                if (!msg.equals("")) {
                    lbl_addCourseMessage.setText("course added successfully..");
                    lbl_courseIDAddCourse.setText("course_id = " + msg);
                }
            } else {
                lbl_addCourseMessage.setText("Course Already Exists");
            }
            setComboBoxes();
            setcombpbpx2(evt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_addCourseActionPerformed

    private void comb_instructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_instructorActionPerformed
        int index = comb_instructor.getSelectedIndex();
        tabbed_instructor.setSelectedIndex(index);
    }//GEN-LAST:event_comb_instructorActionPerformed

    private void comb_TAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_TAActionPerformed
        int index = comb_TA.getSelectedIndex();
        tabbed_TA.setSelectedIndex(index);
    }//GEN-LAST:event_comb_TAActionPerformed

    private void combo_editCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_editCourseActionPerformed
        ArrayList<String> years = db.getyear((String) combo_editCourse.getSelectedItem());
        if (comb_yearEditCourse.getItemCount() > 0) {
            comb_yearEditCourse.removeAllItems();
        }
        if (years.size() > 0) {
            for (int i = 0; i < years.size(); i++) {
                comb_yearEditCourse.addItem(years.get(i));
            }
            comb_yearEditCourse.setSelectedIndex(0);
        }

        ArrayList<String> semesters = db.getsemester(combo_editCourse.getSelectedItem().toString(), Integer.parseInt(comb_yearEditCourse.getSelectedItem().toString()));
        if (comb_semesterEditCourse.getItemCount() > 0) {
            comb_semesterEditCourse.removeAllItems();
        }
        if (semesters.size() > 0) {
            for (int i = 0; i < semesters.size(); i++) {
                comb_semesterEditCourse.addItem(semesters.get(i));
            }
            comb_semesterEditCourse.setSelectedIndex(0);
        }

        ArrayList<String> instructor_inDep = db.getinstrIncourse((String) combo_editCourse.getSelectedItem());
        if (combo_newInstructor.getItemCount() > 0) {
            combo_newInstructor.removeAllItems();
        }

        if (instructor_inDep.size() > 0) {
            for (int i = 0; i < instructor_inDep.size(); i++) {
                combo_newInstructor.addItem(instructor_inDep.get(i));
            }

        } else {
            lbl_editCourseMessage.setText("there's no instructor in this department yet.. ");
        }
        ArrayList<String> TA_incourse = db.getTAIncourse((String) combo_editCourse.getSelectedItem());
        if (combo_newTA.getItemCount() > 0) {
            combo_newTA.removeAllItems();
        }
        if (TA_incourse.size() > 0) {
            for (int i = 0; i < TA_incourse.size(); i++) {
                combo_newTA.addItem(TA_incourse.get(i));
            }

        } else {
            lbl_editCourseMessage.setText("there's no TAs in this department yet.");
        }

    }//GEN-LAST:event_combo_editCourseActionPerformed

    private void comb_courseIDaddSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_courseIDaddSecActionPerformed
        ArrayList<String> room_Nums = db.getRoomNums((String) comb_courseIDaddSec.getSelectedItem());
        if (comb_roomnumAddSec.getItemCount() > 0) {
            comb_roomnumAddSec.removeAllItems();
        }
        if (room_Nums.size() > 0) {
            for (int i = 0; i < room_Nums.size(); i++) {
                comb_roomnumAddSec.addItem(room_Nums.get(i));
            }
            comb_roomnumAddSec.setSelectedIndex(0);
        }
        ArrayList<String> years = db.getyear((String) comb_courseIDaddSec.getSelectedItem());
        if (comb_yearAddSec.getItemCount() > 0) {
            comb_yearAddSec.removeAllItems();
        }
        if (years.size() > 0) {
            for (int i = 0; i < years.size(); i++) {
                comb_yearAddSec.addItem(years.get(i));
            }
            comb_yearAddSec.setSelectedIndex(0);

        }
        ArrayList<String> semesters = db.getsemester((String) comb_courseIDaddSec.getSelectedItem(),
                Integer.parseInt(comb_yearAddSec.getSelectedItem().toString()));
        if (comb_semesterAddsec.getItemCount() > 0) {
            comb_semesterAddsec.removeAllItems();
        }
        if (semesters.size() > 0) {
            for (int i = 0; i < semesters.size(); i++) {
                comb_semesterAddsec.addItem(semesters.get(i));
            }
            comb_semesterAddsec.setSelectedIndex(0);
        }
    }//GEN-LAST:event_comb_courseIDaddSecActionPerformed

    private void comb_CourseIDEditsecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_CourseIDEditsecActionPerformed
        ArrayList<String> room_Nums = db.getRoomNums((String) comb_courseIDaddSec.getSelectedItem());
        if (comb_newRoomnum.getItemCount() > 0) {
            comb_newRoomnum.removeAllItems();
        }
        for (int i = 0; i < room_Nums.size(); i++) {
            comb_newRoomnum.addItem(room_Nums.get(i));
        }
        comb_newRoomnum.setSelectedIndex(0);

        ArrayList<String> years = db.getyear((String) comb_CourseIDEditsec.getSelectedItem());
        if (comb_YearEditSec.getItemCount() > 0) {
            comb_YearEditSec.removeAllItems();
        }
        if (years.size() > 0) {
            for (int i = 0; i < years.size(); i++) {
                comb_YearEditSec.addItem(years.get(i));
            }
            comb_YearEditSec.setSelectedIndex(0);

        }
        ArrayList<String> semesters = db.getsemester((String) comb_CourseIDEditsec.getSelectedItem(),
                Integer.parseInt(comb_YearEditSec.getSelectedItem().toString()));
        if (com_SemesterEditsec.getItemCount() > 0) {
            com_SemesterEditsec.removeAllItems();
        }
        if (semesters.size() > 0) {
            for (int i = 0; i < semesters.size(); i++) {
                com_SemesterEditsec.addItem(semesters.get(i));
            }
            com_SemesterEditsec.setSelectedIndex(0);
        }

        ArrayList<String> sections = db.getSectionIncourse((String) comb_CourseIDEditsec.getSelectedItem(),
                com_SemesterEditsec.getSelectedItem().toString(),
                Integer.parseInt(comb_YearEditSec.getSelectedItem().toString()));
        if (comb_chooseSecEditSec.getItemCount() > 0) {
            comb_chooseSecEditSec.removeAllItems();
        }
        if (sections.size() > 0) {
            for (int i = 0; i < sections.size(); i++) {
                comb_chooseSecEditSec.addItem(sections.get(i));
            }
            comb_chooseSecEditSec.setSelectedIndex(0);
        }

    }//GEN-LAST:event_comb_CourseIDEditsecActionPerformed

    private void btn_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sectionActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btn_sectionActionPerformed

    private void comb_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_sectionActionPerformed
        int index = comb_section.getSelectedIndex();
        tabbed_section.setSelectedIndex(index);
    }//GEN-LAST:event_comb_sectionActionPerformed

    private void comb_chooseCourseDeleteSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_chooseCourseDeleteSecActionPerformed
        ArrayList<String> years = db.getyear((String) comb_chooseCourseDeleteSec.getSelectedItem());
        if (comb_yearDeleteSec.getItemCount() > 0) {
            comb_yearDeleteCourse.removeAllItems();
        }
        if (years.size() > 0) {
            for (int i = 0; i < years.size(); i++) {
                comb_yearDeleteSec.addItem(years.get(i));
            }
            comb_yearDeleteSec.setSelectedIndex(0);
        }
    }//GEN-LAST:event_comb_chooseCourseDeleteSecActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try {
            String course_id = comb_courseIDaddSec.getSelectedItem().toString();
            String year = comb_yearAddSec.getSelectedItem().toString();
            String semester = comb_semesterAddsec.getSelectedItem().toString();
            String room = comb_roomnumAddSec.getSelectedItem().toString();
            String building = db.getBuildigName(db.getdeptName(course_id));
            if (!db.isClassCross(building, room, semester, Integer.parseInt(year))) {
                String msg = db.insertSection(course_id, building, room, semester, Integer.parseInt(year));
                if (!msg.equals("")) {
                    lbl_addSecMessage.setText("section added successfully..");
                    lbl_secIDAddSEC.setText("sec_id = " + msg);
                }
            } else {
                lbl_addSecMessage.setText("Conflict in room");
            }
            setComboBoxes();
            setcombpbpx2(evt);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_addInstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addInstrActionPerformed
        try {
            String department = comb_deptAddinstr.getSelectedItem().toString();
            String name = txt_nameAddInstr.getText();
            String passward = txt_passAddInstr.getText();
            String msg = db.insertInstr(department, name, passward);
            if (!msg.equals("")) {
                lbl_addIntrMessage.setText("instructor added successfully..");
                lbl_IDAddInstr.setText("insrtructor's id = " + msg);
            } else {
                lbl_addIntrMessage.setText("somthing went wrong try again please..");
            }
            setComboBoxes();
            setcombpbpx2(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_addInstrActionPerformed

    private void btn_addTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTAActionPerformed
        try {
            String department = como_depAddTA.getSelectedItem().toString();
            String name = txt_nameAddTA.getText();
            String passward = txt_passAddTA.getText();
            String msg = db.insertTA(department, name, passward);
            if (!msg.equals("")) {
                lbl_addTAMessage.setText("TA added successfully..");
                lbl_IDAddTA.setText("TA'S id = " + msg);
            } else {
                lbl_addTAMessage.setText("somthing went wrong try again please..");
            }
            setComboBoxes();
            setcombpbpx2(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_addTAActionPerformed

    private void btn_deleteInstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteInstrActionPerformed
        try {
            String id = (String) comb_instrDelete.getSelectedItem();
            String msg = db.deleteinst(id);
            if (!msg.equals("")) {
                lbl_DeleteInstrMessage.setText(msg);
            } else {
                lbl_DeleteInstrMessage.setText("something went wrong try again later..");
            }
            setComboBoxes();
            setcombpbpx2(evt);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteInstrActionPerformed

    private void btn_deleteTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteTAActionPerformed
        try {
            String id = (String) comb_TADelete.getSelectedItem();
            String msg = db.deleteTA(id);
            if (!msg.equals("")) {
                lbl_DeleteTAMessage.setText(msg);
            } else {
                lbl_DeleteTAMessage.setText("something went wrong try again later..");
            }
            setComboBoxes();
            setcombpbpx2(evt);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_deleteTAActionPerformed

    private void comb_TADeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_TADeleteActionPerformed
        String TAID = comb_TADelete.getSelectedItem().toString();
        lbl_TANameDeleteTA.setText(db.getTAName(TAID));
        lbl_deptDeleteTA.setText(db.getdeptNameforTA(TAID));
    }//GEN-LAST:event_comb_TADeleteActionPerformed

    private void comb_instrDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_instrDeleteActionPerformed
        String instrID = comb_instrDelete.getSelectedItem().toString();
        lbl_firstNameDeleteInstr.setText(db.getinstrName(instrID));
        lbl_lastNameDeleteInstr.setText(db.getdeptNameforIns(instrID));
    }//GEN-LAST:event_comb_instrDeleteActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            String course_id = (String) comb_chooseCourseDeleteSec.getSelectedItem();
            String sec_id = (String) comb_chooseSecDeleteSec.getSelectedItem();
            String semester = (String) comb_semesterDeletesec.getSelectedItem();
            String year = comb_yearDeleteSec.getSelectedItem().toString();
            String msg = db.deletesec(course_id, sec_id, semester, Integer.parseInt(year));
            if (!msg.equals("")) {
                lbl_DeleteSecMessage.setText(msg);
            } else {
                lbl_DeleteSecMessage.setText("something went wrong try again later..");
            }
            setComboBoxes();
            setcombpbpx2(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editCourseActionPerformed
        try {
            String course_id = combo_editCourse.getSelectedItem().toString();
            String year = comb_yearEditCourse.getSelectedItem().toString();
            String semester = comb_semesterEditCourse.getSelectedItem().toString();
            String newname = txt_newName.getText();
            String book = txt_newBook.getText();
            String ta = combo_newTA.getSelectedItem().toString();
            String instructor = combo_newInstructor.getSelectedItem().toString();
            if (newname != null) {
                if (book != null) {
                    String msg = db.editCourse(course_id, newname, book, semester, instructor, ta, Integer.parseInt(year));
                    if (!msg.equals("")) {
                        lbl_editCourseMessage.setText(msg);
                    } else {
                        lbl_editCourseMessage.setText("something went wrong try again later..");
                    }
                    setComboBoxes();
                    setcombpbpx2(evt);
                }
            } else {
                lbl_editCourseMessage.setText("you have to fill all the planks");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }


    }//GEN-LAST:event_btn_editCourseActionPerformed

    private void btn_editTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editTAActionPerformed
        try {
            String id = comb_chooseTAedit.getSelectedItem().toString();
            String dept_name = comb_newDeptEditTA.getSelectedItem().toString();
            String newname = txt_newNameEditTA.getText();
            String msg = db.editTA(id, dept_name, newname);
            if (!msg.equals("")) {
                lbl_updateTAMessage.setText(msg);
            } else {
                lbl_updateTAMessage.setText("something went wrong try again later..");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_editTAActionPerformed

    private void btn_editInstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editInstrActionPerformed
        try {
            String id = comb_chooseinstr.getSelectedItem().toString();
            String dept_name = comb_newDeptEditInstr.getSelectedItem().toString();
            String newname = txt_newNameEditInst.getText();
            String msg = db.editInstructor(id, dept_name, newname);
            if (!msg.equals("")) {
                lbl_editInstrMessage.setText(msg);
            } else {
                lbl_editInstrMessage.setText("something went wrong try again later..");
            }
            setComboBoxes();
            setcombpbpx2(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "invalid", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_editInstrActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            String course_id = comb_CourseIDEditsec.getSelectedItem().toString();
            String year = comb_YearEditSec.getSelectedItem().toString();
            String sem = com_SemesterEditsec.getSelectedItem().toString();
            String sec_id = comb_chooseSecEditSec.getSelectedItem().toString();
            String room = comb_newRoomnum.getSelectedItem().toString();
            String msg = db.editsec(course_id, sec_id, sem, room, Integer.parseInt(year));
            if (!msg.equals("")) {
                lbl_updateSecMessage.setText(msg);
            } else {
                lbl_updateSecMessage.setText("something went wrong try again later..");
            }
            setComboBoxes();
            setcombpbpx2(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "invalid ", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void comb_yearEditCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_yearEditCourseActionPerformed

    }//GEN-LAST:event_comb_yearEditCourseActionPerformed

    private void comb_yearDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_yearDeleteCourseActionPerformed

    }//GEN-LAST:event_comb_yearDeleteCourseActionPerformed

    private void comb_yearDeleteSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_yearDeleteSecActionPerformed

    }//GEN-LAST:event_comb_yearDeleteSecActionPerformed

    private void comb_yearAddSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_yearAddSecActionPerformed


    }//GEN-LAST:event_comb_yearAddSecActionPerformed

    private void comb_YearEditSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_YearEditSecActionPerformed
    }//GEN-LAST:event_comb_YearEditSecActionPerformed

    private void comb_chooseinstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_chooseinstrActionPerformed
        String id = comb_chooseinstr.getSelectedItem().toString();
        comb_newDeptEditInstr.setSelectedItem(db.getdeptNameforIns(id));
        txt_newNameEditInst.setText(db.getinstrName(id));
//        txt_newPasswardEditInstr.setText();
    }//GEN-LAST:event_comb_chooseinstrActionPerformed

    private void comb_chooseTAeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_chooseTAeditActionPerformed
        String id = comb_chooseTAedit.getSelectedItem().toString();
        comb_newDeptEditTA.setSelectedItem(db.getdeptNameforTA(id));
        txt_newNameEditTA.setText(db.getTAName(id));
    }//GEN-LAST:event_comb_chooseTAeditActionPerformed

    private void comb_chooseSecDeleteSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_chooseSecDeleteSecActionPerformed

    }//GEN-LAST:event_comb_chooseSecDeleteSecActionPerformed

    private void comb_semesterDeletesecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_semesterDeletesecActionPerformed

    }//GEN-LAST:event_comb_semesterDeletesecActionPerformed

    private void comb_semesterDeletesecItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comb_semesterDeletesecItemStateChanged

    }//GEN-LAST:event_comb_semesterDeletesecItemStateChanged

    private void comb_yearDeleteSecItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comb_yearDeleteSecItemStateChanged

    }//GEN-LAST:event_comb_yearDeleteSecItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<String> semesters = db.getsemester((String) comb_chooseCourseDeleteSec.getSelectedItem(),
                Integer.parseInt(comb_yearDeleteSec.getSelectedItem().toString()));
        if (comb_semesterDeletesec.getItemCount() > 0) {
            comb_semesterDeletesec.removeAllItems();
        }
        if (semesters.size() > 0) {
            for (int i = 0; i < semesters.size(); i++) {
                comb_semesterDeletesec.addItem(semesters.get(i));
            }
            comb_semesterDeletesec.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<String> sections = db.getSectionIncourse((String) comb_chooseCourseDeleteSec.getSelectedItem(),
                comb_semesterDeletesec.getSelectedItem().toString(),
                Integer.parseInt(comb_yearDeleteSec.getSelectedItem().toString()));
        if (comb_chooseSecDeleteSec.getItemCount() > 0) {
            comb_chooseSecDeleteSec.removeAllItems();
        }
        if (sections.size() > 0) {
            for (int i = 0; i < sections.size(); i++) {
                comb_chooseSecDeleteSec.addItem(sections.get(i));
            }
            comb_chooseSecDeleteSec.setSelectedIndex(0);
        } else {
            lbl_DeleteSecMessage.setText("this course has no sections.. ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ArrayList<String> semesters = db.getsemester((String) comb_CourseIDEditsec.getSelectedItem(),
                Integer.parseInt(comb_YearEditSec.getSelectedItem().toString()));
        if (com_SemesterEditsec.getItemCount() > 0) {
            com_SemesterEditsec.removeAllItems();
        }
        if (semesters.size() > 0) {
            for (int i = 0; i < semesters.size(); i++) {
                com_SemesterEditsec.addItem(semesters.get(i));
            }
            com_SemesterEditsec.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void com_SemesterEditsecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_SemesterEditsecActionPerformed

    }//GEN-LAST:event_com_SemesterEditsecActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ArrayList<String> sections = db.getSectionIncourse((String) comb_CourseIDEditsec.getSelectedItem(),
                com_SemesterEditsec.getSelectedItem().toString(),
                Integer.parseInt(comb_YearEditSec.getSelectedItem().toString()));
        if (comb_chooseSecEditSec.getItemCount() > 0) {
            comb_chooseSecEditSec.removeAllItems();
        }
        if (sections.size() > 0) {
            for (int i = 0; i < sections.size(); i++) {
                comb_chooseSecEditSec.addItem(sections.get(i));
            }
            comb_chooseSecEditSec.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ArrayList<String> semesters = db.getsemester((String) comb_courseIDaddSec.getSelectedItem(),
                Integer.parseInt(comb_yearAddSec.getSelectedItem().toString()));
        if (comb_semesterAddsec.getItemCount() > 0) {
            comb_semesterAddsec.removeAllItems();
        }
        if (semesters.size() > 0) {
            for (int i = 0; i < semesters.size(); i++) {
                comb_semesterAddsec.addItem(semesters.get(i));
            }
            comb_semesterAddsec.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ArrayList<String> semesters = db.getsemester((String) combo_deleteCourse.getSelectedItem(),
                Integer.parseInt(comb_yearDeleteCourse.getSelectedItem().toString()));
        if (comb_semesterDeleteCourse.getItemCount() > 0) {
            comb_semesterDeleteCourse.removeAllItems();
        }
        if (semesters.size() > 0) {
            for (int i = 0; i < semesters.size(); i++) {
                comb_semesterDeleteCourse.addItem(semesters.get(i));
            }
            comb_semesterDeleteCourse.setSelectedIndex(0);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String id = (String) combo_deleteCourse.getSelectedItem();
        String s = (String) comb_semesterDeleteCourse.getSelectedItem();
        int y = Integer.parseInt((String) comb_yearDeleteCourse.getSelectedItem());
        lbl_courseNameDelete.setText(db.getcourseName(id, s, y));
        lbl_deptDeleteCourse.setText(db.getdeptName(id));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ArrayList<String> semesters = db.getsemester(combo_editCourse.getSelectedItem().toString(), Integer.parseInt(comb_yearEditCourse.getSelectedItem().toString()));
        if (comb_semesterEditCourse.getItemCount() > 0) {
            comb_semesterEditCourse.removeAllItems();
        }
        if (semesters.size() > 0) {
            for (int i = 0; i < semesters.size(); i++) {
                comb_semesterEditCourse.addItem(semesters.get(i));
            }
            comb_semesterEditCourse.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String course_id = "";
        String semester = "";
        String year = "";
        course_id = combo_editCourse.getSelectedItem().toString();
        semester = comb_semesterEditCourse.getSelectedItem().toString();
        year = comb_yearEditCourse.getSelectedItem().toString();
        combo_newInstructor.setSelectedItem(db.getinstIncourse2(course_id, semester, Integer.parseInt(year)));
        combo_newTA.setSelectedItem(db.getTAIncourse2(course_id, semester, Integer.parseInt(year)));
        txt_newName.setText(db.getcourseName(course_id, semester, Integer.parseInt(year)));
        txt_newBook.setText(db.getcourseBook(course_id, semester, Integer.parseInt(year)));
        lbl_editCourseMessage.setText("..");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void setComboBoxes() {

        ArrayList<String> ids = db.getCourseIDs();
        ArrayList<String> departments = db.getDepartments();
        ArrayList<String> instructors = db.getinstr();
        ArrayList<String> TA = db.getTA();

        for (int i = 0; i < ids.size(); i++) {
            combo_deleteCourse.addItem(ids.get(i));
            combo_editCourse.addItem(ids.get(i));
            comb_courseIDaddSec.addItem(ids.get(i));
            comb_CourseIDEditsec.addItem(ids.get(i));
            comb_chooseCourseDeleteSec.addItem(ids.get(i));
        }
        for (int i = 0; i < departments.size(); i++) {
            combo_depAddcourse.addItem(departments.get(i));
            comb_deptAddinstr.addItem(departments.get(i));
            comb_newDeptEditInstr.addItem(departments.get(i));
            comb_newDeptEditTA.addItem(departments.get(i));
            como_depAddTA.addItem(departments.get(i));
        }
        for (int i = 0; i < instructors.size(); i++) {
            comb_instrDelete.addItem(instructors.get(i));
            comb_chooseinstr.addItem(instructors.get(i));
        }
        for (int i = 0; i < TA.size(); i++) {
            comb_TADelete.addItem(TA.get(i));
            comb_chooseTAedit.addItem(TA.get(i));
        }
        combo_deleteCourse.setSelectedIndex(0);
        combo_editCourse.setSelectedIndex(0);
        combo_depAddcourse.setSelectedIndex(0);
        comb_instrDelete.setSelectedIndex(0);
        comb_TADelete.setSelectedIndex(0);
        comb_chooseCourseDeleteSec.setSelectedIndex(0);
    }

    public void setcombpbpx2(java.awt.event.ActionEvent evt) {
        combo_editCourseActionPerformed(evt);
        combo_deleteCourseActionPerformed(evt);
        combo_depAddcourseActionPerformed(evt);
        comb_TADeleteActionPerformed(evt);
        comb_instrDeleteActionPerformed(evt);
        comb_courseIDaddSecActionPerformed(evt);
        comb_CourseIDEditsecActionPerformed(evt);
        comb_yearEditCourseActionPerformed(evt);
        comb_yearDeleteSecActionPerformed(evt);
        comb_yearDeleteCourseActionPerformed(evt);
        comb_YearEditSecActionPerformed(evt);
        comb_yearAddSecActionPerformed(evt);
        comb_chooseinstrActionPerformed(evt);
        comb_chooseTAeditActionPerformed(evt);
        comb_chooseCourseDeleteSecActionPerformed(evt);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminstrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Course;
    private javax.swing.JButton btn_Instructor;
    private javax.swing.JButton btn_TA;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_addCourse;
    private javax.swing.JButton btn_addInstr;
    private javax.swing.JButton btn_addTA;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_deleteCourse;
    private javax.swing.JButton btn_deleteInstr;
    private javax.swing.JButton btn_deleteTA;
    private javax.swing.JButton btn_editCourse;
    private javax.swing.JButton btn_editInstr;
    private javax.swing.JButton btn_editTA;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_section;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> com_SemesterEditsec;
    private javax.swing.JComboBox<String> comb_CourseIDEditsec;
    private javax.swing.JComboBox<String> comb_TA;
    private javax.swing.JComboBox<String> comb_TADelete;
    private javax.swing.JComboBox<String> comb_TAaddCourse;
    private javax.swing.JComboBox<String> comb_YearEditSec;
    private javax.swing.JComboBox<String> comb_chooseCourseDeleteSec;
    private javax.swing.JComboBox<String> comb_chooseSecDeleteSec;
    private javax.swing.JComboBox<String> comb_chooseSecEditSec;
    private javax.swing.JComboBox<String> comb_chooseTAedit;
    private javax.swing.JComboBox<String> comb_chooseinstr;
    private javax.swing.JComboBox<String> comb_courseIDaddSec;
    private javax.swing.JComboBox<String> comb_deptAddinstr;
    private javax.swing.JComboBox<String> comb_instrDelete;
    private javax.swing.JComboBox<String> comb_instructor;
    private javax.swing.JComboBox<String> comb_newDeptEditInstr;
    private javax.swing.JComboBox<String> comb_newDeptEditTA;
    private javax.swing.JComboBox<String> comb_newRoomnum;
    private javax.swing.JComboBox<String> comb_roomnumAddSec;
    private javax.swing.JComboBox<String> comb_section;
    private javax.swing.JComboBox<String> comb_semesterAddCourse;
    private javax.swing.JComboBox<String> comb_semesterAddsec;
    private javax.swing.JComboBox<String> comb_semesterDeleteCourse;
    private javax.swing.JComboBox<String> comb_semesterDeletesec;
    private javax.swing.JComboBox<String> comb_semesterEditCourse;
    private javax.swing.JComboBox<String> comb_yearAddSec;
    private javax.swing.JComboBox<String> comb_yearDeleteCourse;
    private javax.swing.JComboBox<String> comb_yearDeleteSec;
    private javax.swing.JComboBox<String> comb_yearEditCourse;
    private javax.swing.JComboBox<String> combo_course;
    private javax.swing.JComboBox<String> combo_deleteCourse;
    private javax.swing.JComboBox<String> combo_depAddcourse;
    private javax.swing.JComboBox<String> combo_editCourse;
    private javax.swing.JComboBox<String> combo_instrAdd;
    private javax.swing.JComboBox<String> combo_newInstructor;
    private javax.swing.JComboBox<String> combo_newTA;
    private javax.swing.JComboBox<String> como_depAddTA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_DeleteInstrMessage;
    private javax.swing.JLabel lbl_DeleteSecMessage;
    private javax.swing.JLabel lbl_DeleteTAMessage;
    private javax.swing.JLabel lbl_IDAddInstr;
    private javax.swing.JLabel lbl_IDAddTA;
    private javax.swing.JLabel lbl_TANameDeleteTA;
    private javax.swing.JLabel lbl_addCourseMessage;
    private javax.swing.JLabel lbl_addIntrMessage;
    private javax.swing.JLabel lbl_addSecMessage;
    private javax.swing.JLabel lbl_addTAMessage;
    private javax.swing.JLabel lbl_adminName;
    private javax.swing.JLabel lbl_courseIDAddCourse;
    private javax.swing.JLabel lbl_courseNameDelete;
    private javax.swing.JLabel lbl_deleteCourseMessage;
    private javax.swing.JLabel lbl_deptDeleteCourse;
    private javax.swing.JLabel lbl_deptDeleteTA;
    private javax.swing.JLabel lbl_editCourseMessage;
    private javax.swing.JLabel lbl_editInstrMessage;
    private javax.swing.JLabel lbl_firstNameDeleteInstr;
    private javax.swing.JLabel lbl_lastNameDeleteInstr;
    private javax.swing.JLabel lbl_secIDAddSEC;
    private javax.swing.JLabel lbl_updateSecMessage;
    private javax.swing.JLabel lbl_updateTAMessage;
    private javax.swing.JTabbedPane tabbedPane_course;
    private javax.swing.JTabbedPane tabbed_TA;
    private javax.swing.JTabbedPane tabbed_instructor;
    private javax.swing.JTabbedPane tabbed_section;
    private javax.swing.JTextField txt_courseBook;
    private javax.swing.JTextField txt_courseName;
    private javax.swing.JTextField txt_nameAddInstr;
    private javax.swing.JTextField txt_nameAddTA;
    private javax.swing.JTextField txt_newBook;
    private javax.swing.JTextField txt_newName;
    private javax.swing.JTextField txt_newNameEditInst;
    private javax.swing.JTextField txt_newNameEditTA;
    private javax.swing.JPasswordField txt_passAddInstr;
    private javax.swing.JPasswordField txt_passAddTA;
    private javax.swing.JTextField txt_yearAddCourse;
    // End of variables declaration//GEN-END:variables
}
