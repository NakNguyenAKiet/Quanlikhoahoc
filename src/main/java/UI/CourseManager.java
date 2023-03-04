package UI;

import BLL.CourseBLL;
import BLL.CourseInstructorBLL;
import BLL.OnlinecourseBLL;
import BLL.OnsitecourseBLL;
import BLL.PersonBLL;
import BLL.StudentgradeBLL;
import DTO.Course;
import DTO.Person;
import Utils.CustomTable;
import Utils.Validate;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CourseManager extends javax.swing.JFrame {

    private static final CustomTable customTable = new CustomTable();

    /* ================================== Online course object ================================== */
    private static final OnlinecourseBLL onlineCourseBLL = new OnlinecourseBLL();

    /* ================================== Onsite course object ================================== */
    private static final OnsitecourseBLL onsiteCourseBLL = new OnsitecourseBLL();

    /* ================================== student grade object ================================== */
    private static final StudentgradeBLL studengradeBLL = new StudentgradeBLL();

    private static final PersonBLL personBLL = new PersonBLL();
    
    private static final CourseBLL courseBLL = new CourseBLL();

    private static final CourseInstructorBLL courseInstructorBLL = new CourseInstructorBLL();
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public CourseManager() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        customTable.customJTable(OnsiteCourse_CourseList_Table);
        customTable.customJTable(OnlineCourse_CourseList_Table);
        onlineCourseBLL.displayOnlineCoursesInTable(OnlineCourse_CourseList_Table);
        onsiteCourseBLL.displayOnsiteCoursesInTable(OnsiteCourse_CourseList_Table);

        customTable.customJTable(Studentgrade_Courses_Table);
        studengradeBLL.displayGradeOfCoursesInTable(Studentgrade_Courses_Table, studentgrade_studentName_ltitle, -1);

        customTable.customJTable(Studentgrade_StudentList_Table);
        personBLL.displayStudentListInTable(Studentgrade_StudentList_Table);
        Studentgrade_StudentList_Table.setRowSelectionInterval(0, 0);
        
        customTable.customJTable(Studentgrade_courseList_Table);
        courseBLL.displayAllCoursesInTable(Studentgrade_courseList_Table);
        
        customTable.customJTable(Studentgrade_studentGrade_Table);
        courseBLL.displayAllCoursesInTable(Studentgrade_courseList_Table);        
        Studentgrade_courseList_Table.setRowSelectionInterval(0, 0);
        studengradeBLL.displayGradeOfStudentInTable(Studentgrade_studentGrade_Table, studentgrade_courseName_ltitle, -1);
        
        courseInstructorBLL.dipslayDetailsCourseInstructorListInTable(CourseInstructor_List_Table1);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel89 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Studentgrade_StudentList_Table = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jPanel123 = new javax.swing.JPanel();
        studentlist_searchStudent_input = new javax.swing.JTextField();
        Studentgrade_studentList_search_btn = new javax.swing.JButton();
        jPanel106 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Studentgrade_Courses_Table = new javax.swing.JTable();
        studentgrade_studentName_ltitle = new javax.swing.JLabel();
        OnsiteCourse_Update_Button1 = new javax.swing.JButton();
        jPanel108 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Studentgrade_courseList_Table = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jPanel124 = new javax.swing.JPanel();
        studentlist_searchCourse_input = new javax.swing.JTextField();
        Studentgrade_courseList_search_btn = new javax.swing.JButton();
        jPanel107 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Studentgrade_studentGrade_Table = new javax.swing.JTable();
        studentgrade_courseName_ltitle = new javax.swing.JLabel();
        Studentgrade_UpdateStudentGrade_Button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel96 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        jPanel99 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        CourseInstructor_List_Table1 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jPanel125 = new javax.swing.JPanel();
        CourseInstructor_Search_TextField = new javax.swing.JTextField();
        CourseInstructor_Search_Button = new javax.swing.JButton();
        jPanel100 = new javax.swing.JPanel();
        jPanel101 = new javax.swing.JPanel();
        jPanel102 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        CourseIntructor_CourseID_TextField = new javax.swing.JTextField();
        jPanel104 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel105 = new javax.swing.JPanel();
        CourseIntructor_Title_TextField = new javax.swing.JTextField();
        jPanel110 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        CourseIntructor_PersonID_Panel = new javax.swing.JPanel();
        CourseIntructor_PersonID_TextField = new javax.swing.JTextField();
        jPanel112 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel113 = new javax.swing.JPanel();
        CourseIntructor_FirstName_TextField = new javax.swing.JTextField();
        jPanel114 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel115 = new javax.swing.JPanel();
        CourseIntructor_LastName_TextField = new javax.swing.JTextField();
        CourseIntructor_Delete_Button = new javax.swing.JButton();
        CourseIntructor_Reset_Button = new javax.swing.JButton();
        CourseIntructor_Create_Button = new javax.swing.JButton();
        CourseIntructor_Update_Button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        OnsiteCourse_ID_TextField = new javax.swing.JTextField();
        jPanel60 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        OnsiteCourse_Title_TextField = new javax.swing.JTextField();
        jPanel62 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        OnsiteCourse_Credits_TextField = new javax.swing.JTextField();
        jPanel64 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        OnsiteCourse_DepartmentID_TextField = new javax.swing.JTextField();
        jPanel66 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        OnsiteCourse_Location_TextField = new javax.swing.JTextField();
        OnsiteCourse_Create_Button = new javax.swing.JButton();
        OnsiteCourse_Update_Button = new javax.swing.JButton();
        OnsiteCourse_Delete_Button = new javax.swing.JButton();
        OnsiteCourse_Reset_Button = new javax.swing.JButton();
        jPanel68 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        OnsiteCourse_Time_TextField = new javax.swing.JTextField();
        jPanel70 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        OnsiteCourse_Days_TextField = new javax.swing.JTextField();
        jPanel72 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        OnsiteCourse_CourseList_Table = new javax.swing.JTable();
        OnsiteCourse_Refresh_Button = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        OnsiteCourse_Search_TextField = new javax.swing.JTextField();
        OnsiteCourse_Search_Button = new javax.swing.JButton();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        OnlineCourse_ID_TextField = new javax.swing.JTextField();
        jPanel79 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        OnlineCourse_Title_TextField = new javax.swing.JTextField();
        jPanel81 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        OnlineCourse_Credits_TextField = new javax.swing.JTextField();
        jPanel83 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        OnlineCourse_DepartmentID_TextField = new javax.swing.JTextField();
        jPanel85 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel86 = new javax.swing.JPanel();
        OnlineCourse_Url_TextField = new javax.swing.JTextField();
        OnlineCourse_Create_Button = new javax.swing.JButton();
        OnlineCourse_Update_Button = new javax.swing.JButton();
        OnlineCourse_Delete_Button = new javax.swing.JButton();
        OnlineCourse_Reset_Button = new javax.swing.JButton();
        jPanel87 = new javax.swing.JPanel();
        OnlineCourse_Refresh_Button = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        OnlineCourse_Search_TextField = new javax.swing.JTextField();
        OnlineCourse_Search_Button = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        OnlineCourse_CourseList_Table = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jTabbedPane4.setForeground(new java.awt.Color(0, 102, 255));
        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane4.setOpaque(true);

        jPanel90.setBackground(new java.awt.Color(255, 255, 255));
        jPanel90.setPreferredSize(new java.awt.Dimension(400, 0));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        jPanel92.setBackground(new java.awt.Color(255, 255, 255));
        jPanel92.setPreferredSize(new java.awt.Dimension(350, 100));

        Studentgrade_StudentList_Table.setAutoCreateRowSorter(true);
        Studentgrade_StudentList_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Studentgrade_StudentList_Table.setGridColor(new java.awt.Color(204, 204, 204));
        Studentgrade_StudentList_Table.setOpaque(false);
        Studentgrade_StudentList_Table.setRowHeight(30);
        Studentgrade_StudentList_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Studentgrade_StudentList_Table.setShowGrid(false);
        Studentgrade_StudentList_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Studentgrade_StudentList_TableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(Studentgrade_StudentList_Table);
        if (Studentgrade_StudentList_Table.getColumnModel().getColumnCount() > 0) {
            Studentgrade_StudentList_Table.getColumnModel().getColumn(0).setPreferredWidth(5);
            Studentgrade_StudentList_Table.getColumnModel().getColumn(1).setPreferredWidth(10);
            Studentgrade_StudentList_Table.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 153, 153));
        jLabel42.setText("STUDENT LIST");

        jPanel123.setBackground(new java.awt.Color(255, 255, 255));
        jPanel123.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        studentlist_searchStudent_input.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        studentlist_searchStudent_input.setBorder(null);
        studentlist_searchStudent_input.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                studentlist_searchStudent_inputCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel123Layout = new javax.swing.GroupLayout(jPanel123);
        jPanel123.setLayout(jPanel123Layout);
        jPanel123Layout.setHorizontalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel123Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentlist_searchStudent_input, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel123Layout.setVerticalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentlist_searchStudent_input, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Studentgrade_studentList_search_btn.setBackground(new java.awt.Color(0, 0, 0));
        Studentgrade_studentList_search_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Studentgrade_studentList_search_btn.setForeground(new java.awt.Color(255, 255, 255));
        Studentgrade_studentList_search_btn.setText("SEARCH");
        Studentgrade_studentList_search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Studentgrade_studentList_search_btnMouseClicked(evt);
            }
        });
        Studentgrade_studentList_search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Studentgrade_studentList_search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addComponent(jPanel123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Studentgrade_studentList_search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(120, 120, 120))))
            .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel92Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Studentgrade_studentList_search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jPanel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addComponent(jPanel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel92, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)))
        );

        jPanel106.setBackground(new java.awt.Color(255, 255, 255));

        Studentgrade_Courses_Table.setAutoCreateRowSorter(true);
        Studentgrade_Courses_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "ID", "Title", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Studentgrade_Courses_Table.setGridColor(new java.awt.Color(204, 204, 204));
        Studentgrade_Courses_Table.setOpaque(false);
        Studentgrade_Courses_Table.setRowHeight(30);
        Studentgrade_Courses_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Studentgrade_Courses_Table.setShowGrid(false);
        Studentgrade_Courses_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Studentgrade_Courses_TableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(Studentgrade_Courses_Table);
        if (Studentgrade_Courses_Table.getColumnModel().getColumnCount() > 0) {
            Studentgrade_Courses_Table.getColumnModel().getColumn(0).setPreferredWidth(5);
            Studentgrade_Courses_Table.getColumnModel().getColumn(1).setPreferredWidth(10);
            Studentgrade_Courses_Table.getColumnModel().getColumn(2).setPreferredWidth(100);
            Studentgrade_Courses_Table.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        studentgrade_studentName_ltitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studentgrade_studentName_ltitle.setForeground(new java.awt.Color(0, 153, 153));
        studentgrade_studentName_ltitle.setText("COURSE GRADE");

        OnsiteCourse_Update_Button1.setBackground(new java.awt.Color(255, 255, 0));
        OnsiteCourse_Update_Button1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnsiteCourse_Update_Button1.setForeground(new java.awt.Color(255, 255, 255));
        OnsiteCourse_Update_Button1.setText("UPDATE GRADE");
        OnsiteCourse_Update_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnsiteCourse_Update_Button1MouseClicked(evt);
            }
        });
        OnsiteCourse_Update_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnsiteCourse_Update_Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel106Layout = new javax.swing.GroupLayout(jPanel106);
        jPanel106.setLayout(jPanel106Layout);
        jPanel106Layout.setHorizontalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel106Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel106Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(OnsiteCourse_Update_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel106Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(studentgrade_studentName_ltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
        jPanel106Layout.setVerticalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel106Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(OnsiteCourse_Update_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel106Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(studentgrade_studentName_ltitle)
                    .addContainerGap(464, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel89Layout.createSequentialGroup()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel90, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jPanel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane4.addTab("PERSONAL", jPanel89);

        jPanel93.setBackground(new java.awt.Color(255, 255, 255));
        jPanel93.setPreferredSize(new java.awt.Dimension(400, 0));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        jPanel95.setBackground(new java.awt.Color(255, 255, 255));
        jPanel95.setPreferredSize(new java.awt.Dimension(350, 100));

        Studentgrade_courseList_Table.setAutoCreateRowSorter(true);
        Studentgrade_courseList_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID", "Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Studentgrade_courseList_Table.setGridColor(new java.awt.Color(204, 204, 204));
        Studentgrade_courseList_Table.setOpaque(false);
        Studentgrade_courseList_Table.setRowHeight(30);
        Studentgrade_courseList_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Studentgrade_courseList_Table.setShowGrid(false);
        Studentgrade_courseList_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Studentgrade_courseList_TableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(Studentgrade_courseList_Table);
        if (Studentgrade_courseList_Table.getColumnModel().getColumnCount() > 0) {
            Studentgrade_courseList_Table.getColumnModel().getColumn(0).setPreferredWidth(5);
            Studentgrade_courseList_Table.getColumnModel().getColumn(1).setPreferredWidth(10);
            Studentgrade_courseList_Table.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 153, 153));
        jLabel49.setText("COURSE LIST");

        jPanel124.setBackground(new java.awt.Color(255, 255, 255));
        jPanel124.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        studentlist_searchCourse_input.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        studentlist_searchCourse_input.setBorder(null);
        studentlist_searchCourse_input.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                studentlist_searchCourse_inputCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel124Layout = new javax.swing.GroupLayout(jPanel124);
        jPanel124.setLayout(jPanel124Layout);
        jPanel124Layout.setHorizontalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel124Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentlist_searchCourse_input)
                .addContainerGap())
        );
        jPanel124Layout.setVerticalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentlist_searchCourse_input, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Studentgrade_courseList_search_btn.setBackground(new java.awt.Color(0, 0, 0));
        Studentgrade_courseList_search_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Studentgrade_courseList_search_btn.setForeground(new java.awt.Color(255, 255, 255));
        Studentgrade_courseList_search_btn.setText("SEARCH");
        Studentgrade_courseList_search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Studentgrade_courseList_search_btnMouseClicked(evt);
            }
        });
        Studentgrade_courseList_search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Studentgrade_courseList_search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(Studentgrade_courseList_search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel95Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Studentgrade_courseList_search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jPanel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel95Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel93Layout.createSequentialGroup()
                        .addComponent(jPanel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel95, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)))
        );

        jPanel107.setBackground(new java.awt.Color(255, 255, 255));

        Studentgrade_studentGrade_Table.setAutoCreateRowSorter(true);
        Studentgrade_studentGrade_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID", "Name", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Studentgrade_studentGrade_Table.setGridColor(new java.awt.Color(204, 204, 204));
        Studentgrade_studentGrade_Table.setOpaque(false);
        Studentgrade_studentGrade_Table.setRowHeight(30);
        Studentgrade_studentGrade_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Studentgrade_studentGrade_Table.setShowGrid(false);
        Studentgrade_studentGrade_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Studentgrade_studentGrade_TableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(Studentgrade_studentGrade_Table);
        if (Studentgrade_studentGrade_Table.getColumnModel().getColumnCount() > 0) {
            Studentgrade_studentGrade_Table.getColumnModel().getColumn(0).setPreferredWidth(5);
            Studentgrade_studentGrade_Table.getColumnModel().getColumn(1).setPreferredWidth(10);
            Studentgrade_studentGrade_Table.getColumnModel().getColumn(2).setPreferredWidth(100);
            Studentgrade_studentGrade_Table.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        studentgrade_courseName_ltitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studentgrade_courseName_ltitle.setForeground(new java.awt.Color(0, 153, 153));
        studentgrade_courseName_ltitle.setText("STUDENT GRADE");

        Studentgrade_UpdateStudentGrade_Button.setBackground(new java.awt.Color(255, 255, 0));
        Studentgrade_UpdateStudentGrade_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Studentgrade_UpdateStudentGrade_Button.setForeground(new java.awt.Color(255, 255, 255));
        Studentgrade_UpdateStudentGrade_Button.setText("UPDATE GRADE");
        Studentgrade_UpdateStudentGrade_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Studentgrade_UpdateStudentGrade_ButtonMouseClicked(evt);
            }
        });
        Studentgrade_UpdateStudentGrade_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Studentgrade_UpdateStudentGrade_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel107Layout = new javax.swing.GroupLayout(jPanel107);
        jPanel107.setLayout(jPanel107Layout);
        jPanel107Layout.setHorizontalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel107Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel107Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Studentgrade_UpdateStudentGrade_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel107Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(studentgrade_courseName_ltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
        jPanel107Layout.setVerticalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel107Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Studentgrade_UpdateStudentGrade_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel107Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(studentgrade_courseName_ltitle)
                    .addContainerGap(464, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel108Layout = new javax.swing.GroupLayout(jPanel108);
        jPanel108.setLayout(jPanel108Layout);
        jPanel108Layout.setHorizontalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel108Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel108Layout.setVerticalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel108Layout.createSequentialGroup()
                .addGroup(jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel93, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jPanel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane4.addTab("COURSE", jPanel108);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("STUDENT GRADE", jPanel4);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jTabbedPane5.setForeground(new java.awt.Color(0, 102, 255));
        jTabbedPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane5.setOpaque(true);

        jPanel97.setBackground(new java.awt.Color(255, 255, 255));
        jPanel97.setPreferredSize(new java.awt.Dimension(400, 0));

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel99.setBackground(new java.awt.Color(255, 255, 255));
        jPanel99.setPreferredSize(new java.awt.Dimension(350, 100));

        CourseInstructor_List_Table1.setAutoCreateRowSorter(true);
        CourseInstructor_List_Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID Course", "Title", "ID Person", "FirstName", "LastName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CourseInstructor_List_Table1.setGridColor(new java.awt.Color(204, 204, 204));
        CourseInstructor_List_Table1.setOpaque(false);
        CourseInstructor_List_Table1.setRowHeight(30);
        CourseInstructor_List_Table1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        CourseInstructor_List_Table1.setShowGrid(false);
        CourseInstructor_List_Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseInstructor_List_Table1MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(CourseInstructor_List_Table1);
        if (CourseInstructor_List_Table1.getColumnModel().getColumnCount() > 0) {
            CourseInstructor_List_Table1.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 153, 153));
        jLabel43.setText("COURSE INSTRUCTOR LIST");

        jPanel125.setBackground(new java.awt.Color(255, 255, 255));
        jPanel125.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        CourseInstructor_Search_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CourseInstructor_Search_TextField.setBorder(null);
        CourseInstructor_Search_TextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CourseInstructor_Search_TextFieldCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel125Layout = new javax.swing.GroupLayout(jPanel125);
        jPanel125.setLayout(jPanel125Layout);
        jPanel125Layout.setHorizontalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel125Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CourseInstructor_Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel125Layout.setVerticalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CourseInstructor_Search_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        CourseInstructor_Search_Button.setBackground(new java.awt.Color(0, 0, 0));
        CourseInstructor_Search_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CourseInstructor_Search_Button.setForeground(new java.awt.Color(255, 255, 255));
        CourseInstructor_Search_Button.setText("SEARCH");
        CourseInstructor_Search_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseInstructor_Search_ButtonMouseClicked(evt);
            }
        });
        CourseInstructor_Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseInstructor_Search_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addComponent(jPanel125, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CourseInstructor_Search_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addGap(120, 120, 120))))
            .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel99Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CourseInstructor_Search_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jPanel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(442, Short.MAX_VALUE))
            .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel99Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel97Layout.createSequentialGroup()
                        .addComponent(jPanel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel99, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)))
        );

        jPanel100.setBackground(new java.awt.Color(255, 255, 255));
        jPanel100.setPreferredSize(new java.awt.Dimension(400, 0));

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel102.setBackground(new java.awt.Color(255, 255, 255));
        jPanel102.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel35.setText("Course ID:");

        jPanel103.setBackground(new java.awt.Color(255, 255, 255));
        jPanel103.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        CourseIntructor_CourseID_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CourseIntructor_CourseID_TextField.setBorder(null);
        CourseIntructor_CourseID_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseIntructor_CourseID_TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CourseIntructor_CourseID_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CourseIntructor_CourseID_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel102Layout = new javax.swing.GroupLayout(jPanel102);
        jPanel102.setLayout(jPanel102Layout);
        jPanel102Layout.setHorizontalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel102Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel102Layout.setVerticalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel102Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel104.setBackground(new java.awt.Color(255, 255, 255));
        jPanel104.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel36.setText("Title:");

        jPanel105.setBackground(new java.awt.Color(255, 255, 255));
        jPanel105.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        CourseIntructor_Title_TextField.setEditable(false);
        CourseIntructor_Title_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CourseIntructor_Title_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel105Layout = new javax.swing.GroupLayout(jPanel105);
        jPanel105.setLayout(jPanel105Layout);
        jPanel105Layout.setHorizontalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel105Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CourseIntructor_Title_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel105Layout.setVerticalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CourseIntructor_Title_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel104Layout = new javax.swing.GroupLayout(jPanel104);
        jPanel104.setLayout(jPanel104Layout);
        jPanel104Layout.setHorizontalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel104Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel104Layout.setVerticalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel104Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel110.setBackground(new java.awt.Color(255, 255, 255));
        jPanel110.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel37.setText("Person ID:");

        CourseIntructor_PersonID_Panel.setBackground(new java.awt.Color(255, 255, 255));
        CourseIntructor_PersonID_Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        CourseIntructor_PersonID_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CourseIntructor_PersonID_TextField.setBorder(null);
        CourseIntructor_PersonID_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseIntructor_PersonID_TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CourseIntructor_PersonID_PanelLayout = new javax.swing.GroupLayout(CourseIntructor_PersonID_Panel);
        CourseIntructor_PersonID_Panel.setLayout(CourseIntructor_PersonID_PanelLayout);
        CourseIntructor_PersonID_PanelLayout.setHorizontalGroup(
            CourseIntructor_PersonID_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseIntructor_PersonID_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CourseIntructor_PersonID_TextField)
                .addContainerGap())
        );
        CourseIntructor_PersonID_PanelLayout.setVerticalGroup(
            CourseIntructor_PersonID_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CourseIntructor_PersonID_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel110Layout = new javax.swing.GroupLayout(jPanel110);
        jPanel110.setLayout(jPanel110Layout);
        jPanel110Layout.setHorizontalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel110Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel110Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(CourseIntructor_PersonID_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel110Layout.setVerticalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel110Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CourseIntructor_PersonID_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel112.setBackground(new java.awt.Color(255, 255, 255));
        jPanel112.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel38.setText("First Name:");

        jPanel113.setBackground(new java.awt.Color(255, 255, 255));
        jPanel113.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        CourseIntructor_FirstName_TextField.setEditable(false);
        CourseIntructor_FirstName_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CourseIntructor_FirstName_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel113Layout = new javax.swing.GroupLayout(jPanel113);
        jPanel113.setLayout(jPanel113Layout);
        jPanel113Layout.setHorizontalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel113Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CourseIntructor_FirstName_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel113Layout.setVerticalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CourseIntructor_FirstName_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel112Layout = new javax.swing.GroupLayout(jPanel112);
        jPanel112.setLayout(jPanel112Layout);
        jPanel112Layout.setHorizontalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel112Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel112Layout.setVerticalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel112Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(10, 10, 10)
                .addComponent(jPanel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel114.setBackground(new java.awt.Color(255, 255, 255));
        jPanel114.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel39.setText("Last Name:");

        jPanel115.setBackground(new java.awt.Color(255, 255, 255));
        jPanel115.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        CourseIntructor_LastName_TextField.setEditable(false);
        CourseIntructor_LastName_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CourseIntructor_LastName_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel115Layout = new javax.swing.GroupLayout(jPanel115);
        jPanel115.setLayout(jPanel115Layout);
        jPanel115Layout.setHorizontalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel115Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CourseIntructor_LastName_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel115Layout.setVerticalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CourseIntructor_LastName_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel114Layout.createSequentialGroup()
                .addGroup(jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel114Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CourseIntructor_Delete_Button.setBackground(new java.awt.Color(255, 0, 102));
        CourseIntructor_Delete_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CourseIntructor_Delete_Button.setForeground(new java.awt.Color(255, 255, 255));
        CourseIntructor_Delete_Button.setText("DELETE");
        CourseIntructor_Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseIntructor_Delete_ButtonActionPerformed(evt);
            }
        });

        CourseIntructor_Reset_Button.setBackground(new java.awt.Color(51, 51, 255));
        CourseIntructor_Reset_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CourseIntructor_Reset_Button.setForeground(new java.awt.Color(255, 255, 255));
        CourseIntructor_Reset_Button.setText("RESET");
        CourseIntructor_Reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseIntructor_Reset_ButtonActionPerformed(evt);
            }
        });

        CourseIntructor_Create_Button.setBackground(new java.awt.Color(0, 255, 204));
        CourseIntructor_Create_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CourseIntructor_Create_Button.setForeground(new java.awt.Color(255, 255, 255));
        CourseIntructor_Create_Button.setText("CREATE");
        CourseIntructor_Create_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseIntructor_Create_ButtonActionPerformed(evt);
            }
        });

        CourseIntructor_Update_Button.setBackground(new java.awt.Color(255, 255, 0));
        CourseIntructor_Update_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CourseIntructor_Update_Button.setForeground(new java.awt.Color(255, 255, 255));
        CourseIntructor_Update_Button.setText("UPDATE");
        CourseIntructor_Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseIntructor_Update_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel100Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel100Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CourseIntructor_Update_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CourseIntructor_Create_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CourseIntructor_Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CourseIntructor_Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel100Layout.createSequentialGroup()
                                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel102, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel114, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel112, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jPanel110, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel100Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel104, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel100Layout.createSequentialGroup()
                        .addComponent(jPanel104, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel114, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel112, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel102, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel110, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourseIntructor_Create_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseIntructor_Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourseIntructor_Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseIntructor_Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel96Layout.createSequentialGroup()
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel100, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jPanel97, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane5.addTab("INSTRUCTOR", jPanel96);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        jTabbedPane5.getAccessibleContext().setAccessibleName("INTRUCTOR");

        jTabbedPane1.addTab("COURSE INTRUCTOR", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jTabbedPane3.setForeground(new java.awt.Color(0, 102, 255));
        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane3.setOpaque(true);

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setPreferredSize(new java.awt.Dimension(400, 0));

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setText("Course ID:");

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));
        jPanel59.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnsiteCourse_ID_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnsiteCourse_ID_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnsiteCourse_ID_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnsiteCourse_ID_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setText("Title:");

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnsiteCourse_Title_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnsiteCourse_Title_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnsiteCourse_Title_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnsiteCourse_Title_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jPanel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jPanel62.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setText("Credits:");

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnsiteCourse_Credits_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnsiteCourse_Credits_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnsiteCourse_Credits_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnsiteCourse_Credits_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setText("Department ID:");

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jPanel65.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnsiteCourse_DepartmentID_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnsiteCourse_DepartmentID_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnsiteCourse_DepartmentID_TextField)
                .addContainerGap())
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnsiteCourse_DepartmentID_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(10, 10, 10)
                .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setText("Location:");

        jPanel67.setBackground(new java.awt.Color(255, 255, 255));
        jPanel67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnsiteCourse_Location_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnsiteCourse_Location_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnsiteCourse_Location_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnsiteCourse_Location_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                    .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        OnsiteCourse_Create_Button.setBackground(new java.awt.Color(0, 255, 204));
        OnsiteCourse_Create_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnsiteCourse_Create_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnsiteCourse_Create_Button.setText("CREATE");
        OnsiteCourse_Create_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnsiteCourse_Create_ButtonActionPerformed(evt);
            }
        });

        OnsiteCourse_Update_Button.setBackground(new java.awt.Color(255, 255, 0));
        OnsiteCourse_Update_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnsiteCourse_Update_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnsiteCourse_Update_Button.setText("UPDATE");
        OnsiteCourse_Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnsiteCourse_Update_ButtonActionPerformed(evt);
            }
        });

        OnsiteCourse_Delete_Button.setBackground(new java.awt.Color(255, 0, 102));
        OnsiteCourse_Delete_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnsiteCourse_Delete_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnsiteCourse_Delete_Button.setText("DELETE");
        OnsiteCourse_Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnsiteCourse_Delete_ButtonActionPerformed(evt);
            }
        });

        OnsiteCourse_Reset_Button.setBackground(new java.awt.Color(51, 51, 255));
        OnsiteCourse_Reset_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnsiteCourse_Reset_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnsiteCourse_Reset_Button.setText("RESET");
        OnsiteCourse_Reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnsiteCourse_Reset_ButtonActionPerformed(evt);
            }
        });

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jPanel68.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel26.setText("Time (hh:mm:ss):");

        jPanel69.setBackground(new java.awt.Color(255, 255, 255));
        jPanel69.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnsiteCourse_Time_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnsiteCourse_Time_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnsiteCourse_Time_TextField)
                .addContainerGap())
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnsiteCourse_Time_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addComponent(jPanel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel70.setBackground(new java.awt.Color(255, 255, 255));
        jPanel70.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setText("Days (MTWHF):");

        jPanel71.setBackground(new java.awt.Color(255, 255, 255));
        jPanel71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnsiteCourse_Days_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnsiteCourse_Days_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnsiteCourse_Days_TextField)
                .addContainerGap())
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnsiteCourse_Days_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jPanel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(10, 10, 10)
                .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel56Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(OnsiteCourse_Create_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OnsiteCourse_Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(OnsiteCourse_Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OnsiteCourse_Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                            .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OnsiteCourse_Create_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OnsiteCourse_Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OnsiteCourse_Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OnsiteCourse_Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel72.setBackground(new java.awt.Color(255, 255, 255));

        OnsiteCourse_CourseList_Table.setAutoCreateRowSorter(true);
        OnsiteCourse_CourseList_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Credits", "Dep ID", "Location", "Days", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        OnsiteCourse_CourseList_Table.setGridColor(new java.awt.Color(204, 204, 204));
        OnsiteCourse_CourseList_Table.setOpaque(false);
        OnsiteCourse_CourseList_Table.setRowHeight(30);
        OnsiteCourse_CourseList_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        OnsiteCourse_CourseList_Table.setShowGrid(false);
        OnsiteCourse_CourseList_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnsiteCourse_CourseList_TableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(OnsiteCourse_CourseList_Table);
        if (OnsiteCourse_CourseList_Table.getColumnModel().getColumnCount() > 0) {
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(0).setPreferredWidth(10);
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(1).setPreferredWidth(100);
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(2).setPreferredWidth(10);
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(3).setPreferredWidth(10);
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(4).setPreferredWidth(10);
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(4).setHeaderValue("Location");
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(5).setPreferredWidth(20);
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(5).setHeaderValue("Days");
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(6).setPreferredWidth(20);
            OnsiteCourse_CourseList_Table.getColumnModel().getColumn(6).setHeaderValue("Time");
        }

        OnsiteCourse_Refresh_Button.setBackground(new java.awt.Color(102, 102, 255));
        OnsiteCourse_Refresh_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnsiteCourse_Refresh_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnsiteCourse_Refresh_Button.setText("REFRESH");
        OnsiteCourse_Refresh_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnsiteCourse_Refresh_ButtonActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 153));
        jLabel28.setText("COURSE LIST");

        jPanel73.setBackground(new java.awt.Color(255, 255, 255));
        jPanel73.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnsiteCourse_Search_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnsiteCourse_Search_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnsiteCourse_Search_TextField)
                .addContainerGap())
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnsiteCourse_Search_TextField)
        );

        OnsiteCourse_Search_Button.setBackground(new java.awt.Color(0, 0, 0));
        OnsiteCourse_Search_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnsiteCourse_Search_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnsiteCourse_Search_Button.setText("SEARCH");
        OnsiteCourse_Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnsiteCourse_Search_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel72Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(129, 129, 129))
                            .addComponent(jPanel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OnsiteCourse_Search_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OnsiteCourse_Refresh_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OnsiteCourse_Refresh_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OnsiteCourse_Search_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jPanel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jPanel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("ONSITE COURSE", jPanel55);

        jPanel75.setBackground(new java.awt.Color(255, 255, 255));
        jPanel75.setPreferredSize(new java.awt.Dimension(400, 0));

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel77.setBackground(new java.awt.Color(255, 255, 255));
        jPanel77.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel29.setText("Course ID:");

        jPanel78.setBackground(new java.awt.Color(255, 255, 255));
        jPanel78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnlineCourse_ID_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnlineCourse_ID_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnlineCourse_ID_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnlineCourse_ID_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jPanel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel79.setBackground(new java.awt.Color(255, 255, 255));
        jPanel79.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel30.setText("Title:");

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnlineCourse_Title_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnlineCourse_Title_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnlineCourse_Title_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnlineCourse_Title_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel81.setBackground(new java.awt.Color(255, 255, 255));
        jPanel81.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel31.setText("Credits:");

        jPanel82.setBackground(new java.awt.Color(255, 255, 255));
        jPanel82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnlineCourse_Credits_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnlineCourse_Credits_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnlineCourse_Credits_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnlineCourse_Credits_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel83.setBackground(new java.awt.Color(255, 255, 255));
        jPanel83.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel32.setText("Department ID:");

        jPanel84.setBackground(new java.awt.Color(255, 255, 255));
        jPanel84.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnlineCourse_DepartmentID_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnlineCourse_DepartmentID_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnlineCourse_DepartmentID_TextField)
                .addContainerGap())
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnlineCourse_DepartmentID_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jPanel84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(10, 10, 10)
                .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel85.setBackground(new java.awt.Color(255, 255, 255));
        jPanel85.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel33.setText("URL:");

        jPanel86.setBackground(new java.awt.Color(255, 255, 255));
        jPanel86.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnlineCourse_Url_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnlineCourse_Url_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnlineCourse_Url_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnlineCourse_Url_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jPanel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        OnlineCourse_Create_Button.setBackground(new java.awt.Color(0, 255, 204));
        OnlineCourse_Create_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnlineCourse_Create_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnlineCourse_Create_Button.setText("CREATE");
        OnlineCourse_Create_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineCourse_Create_ButtonActionPerformed(evt);
            }
        });

        OnlineCourse_Update_Button.setBackground(new java.awt.Color(255, 255, 0));
        OnlineCourse_Update_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnlineCourse_Update_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnlineCourse_Update_Button.setText("UPDATE");
        OnlineCourse_Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineCourse_Update_ButtonActionPerformed(evt);
            }
        });

        OnlineCourse_Delete_Button.setBackground(new java.awt.Color(255, 0, 102));
        OnlineCourse_Delete_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnlineCourse_Delete_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnlineCourse_Delete_Button.setText("DELETE");
        OnlineCourse_Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineCourse_Delete_ButtonActionPerformed(evt);
            }
        });

        OnlineCourse_Reset_Button.setBackground(new java.awt.Color(51, 51, 255));
        OnlineCourse_Reset_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnlineCourse_Reset_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnlineCourse_Reset_Button.setText("RESET");
        OnlineCourse_Reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineCourse_Reset_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OnlineCourse_Update_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(OnlineCourse_Create_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OnlineCourse_Reset_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OnlineCourse_Delete_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OnlineCourse_Create_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OnlineCourse_Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OnlineCourse_Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OnlineCourse_Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel87.setBackground(new java.awt.Color(255, 255, 255));

        OnlineCourse_Refresh_Button.setBackground(new java.awt.Color(102, 102, 255));
        OnlineCourse_Refresh_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnlineCourse_Refresh_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnlineCourse_Refresh_Button.setText("REFRESH");
        OnlineCourse_Refresh_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineCourse_Refresh_ButtonActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 153));
        jLabel34.setText("COURSE LIST");

        jPanel88.setBackground(new java.awt.Color(255, 255, 255));
        jPanel88.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        OnlineCourse_Search_TextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        OnlineCourse_Search_TextField.setBorder(null);

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OnlineCourse_Search_TextField)
                .addContainerGap())
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnlineCourse_Search_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        OnlineCourse_Search_Button.setBackground(new java.awt.Color(0, 0, 0));
        OnlineCourse_Search_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnlineCourse_Search_Button.setForeground(new java.awt.Color(255, 255, 255));
        OnlineCourse_Search_Button.setText("SEARCH");
        OnlineCourse_Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineCourse_Search_ButtonActionPerformed(evt);
            }
        });

        OnlineCourse_CourseList_Table.setAutoCreateRowSorter(true);
        OnlineCourse_CourseList_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Credits", "Dep ID", "URL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        OnlineCourse_CourseList_Table.setAlignmentX(0.0F);
        OnlineCourse_CourseList_Table.setAlignmentY(0.0F);
        OnlineCourse_CourseList_Table.setFocusable(false);
        OnlineCourse_CourseList_Table.setGridColor(new java.awt.Color(204, 204, 204));
        OnlineCourse_CourseList_Table.setOpaque(false);
        OnlineCourse_CourseList_Table.setRowHeight(30);
        OnlineCourse_CourseList_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        OnlineCourse_CourseList_Table.setShowGrid(true);
        OnlineCourse_CourseList_Table.setShowHorizontalLines(false);
        OnlineCourse_CourseList_Table.setShowVerticalLines(false);
        OnlineCourse_CourseList_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnlineCourse_CourseList_TableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(OnlineCourse_CourseList_Table);
        if (OnlineCourse_CourseList_Table.getColumnModel().getColumnCount() > 0) {
            OnlineCourse_CourseList_Table.getColumnModel().getColumn(0).setPreferredWidth(10);
            OnlineCourse_CourseList_Table.getColumnModel().getColumn(1).setPreferredWidth(100);
            OnlineCourse_CourseList_Table.getColumnModel().getColumn(2).setPreferredWidth(10);
            OnlineCourse_CourseList_Table.getColumnModel().getColumn(3).setPreferredWidth(10);
            OnlineCourse_CourseList_Table.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addGap(129, 129, 129))
                            .addComponent(jPanel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OnlineCourse_Search_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OnlineCourse_Refresh_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OnlineCourse_Refresh_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OnlineCourse_Search_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jPanel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel74Layout.createSequentialGroup()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jPanel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("ONLINE COURSE", jPanel74);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("COURSE MANAGEMENT", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tabQLKhoaHoc");
        jTabbedPane1.getAccessibleContext().setAccessibleParent(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /* ================================================================ ONLINE COURSE ================================================================ */

 /* ================================== Handle create online course ================================== */
    private void OnlineCourse_Create_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineCourse_Create_ButtonActionPerformed
        String error = onlineCourseBLL.handleCreateOnlineCourse(OnlineCourse_ID_TextField, OnlineCourse_Title_TextField, OnlineCourse_Credits_TextField, OnlineCourse_DepartmentID_TextField, OnlineCourse_Url_TextField);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Online course created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            onlineCourseBLL.displayOnlineCoursesInTable(OnlineCourse_CourseList_Table);
        }
    }//GEN-LAST:event_OnlineCourse_Create_ButtonActionPerformed
    /* ================================== Handle click JTABLE online course ================================== */
    private void OnlineCourse_CourseList_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnlineCourse_CourseList_TableMouseClicked
        OnlineCourse_ID_TextField.setEditable(false);
        OnlineCourse_ID_TextField.setBackground(Color.WHITE);
        int row = OnlineCourse_CourseList_Table.getSelectedRow();
        int courseID = (int) OnlineCourse_CourseList_Table.getModel().getValueAt(row, 0);
        String error = onlineCourseBLL.handleSelectedOnlineCourse(courseID, OnlineCourse_ID_TextField, OnlineCourse_Title_TextField, OnlineCourse_Credits_TextField, OnlineCourse_DepartmentID_TextField, OnlineCourse_Url_TextField);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OnlineCourse_CourseList_TableMouseClicked
    /* ================================== Handle delete online course ================================== */
    private void OnlineCourse_Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineCourse_Delete_ButtonActionPerformed
        int selectedRow = OnlineCourse_CourseList_Table.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this course?", "Yes", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int row = OnlineCourse_CourseList_Table.getSelectedRow();
                int courseID = (int) OnlineCourse_CourseList_Table.getModel().getValueAt(row, 0);
                String error = onlineCourseBLL.handleDeleteOnlineCourse(courseID, OnlineCourse_ID_TextField, OnlineCourse_Title_TextField, OnlineCourse_Credits_TextField, OnlineCourse_DepartmentID_TextField, OnlineCourse_Url_TextField);
                if (error != null) {
                    JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Delete the course successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    onlineCourseBLL.displayOnlineCoursesInTable(OnlineCourse_CourseList_Table);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course on the table to delete", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OnlineCourse_Delete_ButtonActionPerformed

    /* ================================== Handle update online course ================================== */
    private void OnlineCourse_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineCourse_Update_ButtonActionPerformed
        int selectedRow = OnlineCourse_CourseList_Table.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to update this course?", "Yes", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int row = OnlineCourse_CourseList_Table.getSelectedRow();
                int courseID = (int) OnlineCourse_CourseList_Table.getModel().getValueAt(row, 0);
                String error = onlineCourseBLL.handleUpdateOnlineCourse(courseID, OnlineCourse_ID_TextField, OnlineCourse_Title_TextField, OnlineCourse_Credits_TextField, OnlineCourse_DepartmentID_TextField, OnlineCourse_Url_TextField);
                if (error != null) {
                    JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Update the course successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    onlineCourseBLL.displayOnlineCoursesInTable(OnlineCourse_CourseList_Table);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course on the table to update", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OnlineCourse_Update_ButtonActionPerformed

    /* ================================== Handle reset online course ================================== */
    private void OnlineCourse_Reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineCourse_Reset_ButtonActionPerformed
        onlineCourseBLL.handleResetOnlineCourse(OnlineCourse_ID_TextField, OnlineCourse_Title_TextField, OnlineCourse_Credits_TextField, OnlineCourse_DepartmentID_TextField, OnlineCourse_Url_TextField);
        OnlineCourse_ID_TextField.setEditable(true);
        OnlineCourse_CourseList_Table.clearSelection();
    }//GEN-LAST:event_OnlineCourse_Reset_ButtonActionPerformed
    /* ================================== Handle search online course ================================== */
    private void OnlineCourse_Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineCourse_Search_ButtonActionPerformed
        String keyword = OnlineCourse_Search_TextField.getText().trim();
        onlineCourseBLL.handleSearchOnlineCourses(keyword, OnlineCourse_CourseList_Table);
    }//GEN-LAST:event_OnlineCourse_Search_ButtonActionPerformed
    /* ================================== Handle refresh JTABLE online course ================================== */
    private void OnlineCourse_Refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineCourse_Refresh_ButtonActionPerformed
        onlineCourseBLL.displayOnlineCoursesInTable(OnlineCourse_CourseList_Table);
    }//GEN-LAST:event_OnlineCourse_Refresh_ButtonActionPerformed

    /* ================================================================ ONSITE COURSE ================================================================ */
 /* ================================== Handle create onsite course ================================== */
    private void OnsiteCourse_Create_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnsiteCourse_Create_ButtonActionPerformed
        String error = onsiteCourseBLL.handleCreateOnsiteCourse(OnsiteCourse_ID_TextField, OnsiteCourse_Title_TextField, OnsiteCourse_Credits_TextField, OnsiteCourse_DepartmentID_TextField, OnsiteCourse_Location_TextField, OnsiteCourse_Days_TextField, OnsiteCourse_Time_TextField);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Onsite course created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            onsiteCourseBLL.displayOnsiteCoursesInTable(OnsiteCourse_CourseList_Table);
        }
    }//GEN-LAST:event_OnsiteCourse_Create_ButtonActionPerformed

    /* ================================== Handle click JTABLE onsite course ================================== */
    private void OnsiteCourse_CourseList_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnsiteCourse_CourseList_TableMouseClicked
        OnsiteCourse_ID_TextField.setEditable(false);
        OnsiteCourse_ID_TextField.setBackground(Color.WHITE);
        int row = OnsiteCourse_CourseList_Table.getSelectedRow();
        int courseID = (int) OnsiteCourse_CourseList_Table.getModel().getValueAt(row, 0);
        String error = onsiteCourseBLL.handleSelectedOnsiteCourse(courseID, OnsiteCourse_ID_TextField, OnsiteCourse_Title_TextField, OnsiteCourse_Credits_TextField, OnsiteCourse_DepartmentID_TextField, OnsiteCourse_Location_TextField, OnsiteCourse_Days_TextField, OnsiteCourse_Time_TextField);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OnsiteCourse_CourseList_TableMouseClicked

    /* ================================== Handle delete onsite course ================================== */
    private void OnsiteCourse_Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnsiteCourse_Delete_ButtonActionPerformed
        int selectedRow = OnsiteCourse_CourseList_Table.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this course?", "Yes", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int row = OnsiteCourse_CourseList_Table.getSelectedRow();
                int courseID = (int) OnsiteCourse_CourseList_Table.getModel().getValueAt(row, 0);
                String error = onsiteCourseBLL.handleDeleteOnsiteCourse(courseID, OnsiteCourse_ID_TextField, OnsiteCourse_Title_TextField, OnsiteCourse_Credits_TextField, OnsiteCourse_DepartmentID_TextField, OnsiteCourse_Location_TextField, OnsiteCourse_Days_TextField, OnsiteCourse_Time_TextField);
                if (error != null) {
                    JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Delete the course successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    onsiteCourseBLL.displayOnsiteCoursesInTable(OnsiteCourse_CourseList_Table);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course on the table to delete", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OnsiteCourse_Delete_ButtonActionPerformed

    /* ================================== Handle update onsite course ================================== */
    private void OnsiteCourse_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnsiteCourse_Update_ButtonActionPerformed
        int selectedRow = OnsiteCourse_CourseList_Table.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to update this course?", "Yes", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int row = OnsiteCourse_CourseList_Table.getSelectedRow();
                int courseID = (int) OnsiteCourse_CourseList_Table.getModel().getValueAt(row, 0);
                String error = onsiteCourseBLL.handleUpdateOnsiteCourse(courseID, OnsiteCourse_ID_TextField, OnsiteCourse_Title_TextField, OnsiteCourse_Credits_TextField, OnsiteCourse_DepartmentID_TextField, OnsiteCourse_Location_TextField, OnsiteCourse_Days_TextField, OnsiteCourse_Time_TextField);
                if (error != null) {
                    JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Update the course successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    onsiteCourseBLL.displayOnsiteCoursesInTable(OnsiteCourse_CourseList_Table);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course on the table to update", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OnsiteCourse_Update_ButtonActionPerformed

    /* ================================== Handle reset onsite course ================================== */
    private void OnsiteCourse_Reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnsiteCourse_Reset_ButtonActionPerformed
        onsiteCourseBLL.handleResetOnsiteCourse(OnsiteCourse_ID_TextField, OnsiteCourse_Title_TextField, OnsiteCourse_Credits_TextField, OnsiteCourse_DepartmentID_TextField, OnsiteCourse_Location_TextField, OnsiteCourse_Days_TextField, OnsiteCourse_Time_TextField);
        OnsiteCourse_ID_TextField.setEditable(true);
        OnsiteCourse_CourseList_Table.clearSelection();
    }//GEN-LAST:event_OnsiteCourse_Reset_ButtonActionPerformed

    /* ================================== Handle search onsite course ================================== */
    private void OnsiteCourse_Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnsiteCourse_Search_ButtonActionPerformed
        String keyword = OnsiteCourse_Search_TextField.getText().trim();
        onsiteCourseBLL.handleSearchOnsiteCourses(keyword, OnsiteCourse_CourseList_Table);
    }//GEN-LAST:event_OnsiteCourse_Search_ButtonActionPerformed

    /* ================================== Handle refresh JTABLE onsite course ================================== */
    private void OnsiteCourse_Refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnsiteCourse_Refresh_ButtonActionPerformed
        onsiteCourseBLL.displayOnsiteCoursesInTable(OnsiteCourse_CourseList_Table);
    }//GEN-LAST:event_OnsiteCourse_Refresh_ButtonActionPerformed

    private void OnsiteCourse_Update_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnsiteCourse_Update_Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OnsiteCourse_Update_Button1ActionPerformed

    private void Studentgrade_Courses_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Studentgrade_Courses_TableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Studentgrade_Courses_TableMouseClicked

    private void Studentgrade_studentList_search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Studentgrade_studentList_search_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Studentgrade_studentList_search_btnActionPerformed

    private void Studentgrade_StudentList_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Studentgrade_StudentList_TableMouseClicked
        int row = Studentgrade_StudentList_Table.getSelectedRow();
        int studentID = (int) Studentgrade_StudentList_Table.getModel().getValueAt(row, 1);
        studengradeBLL.displayGradeOfCoursesInTable(Studentgrade_Courses_Table, studentgrade_studentName_ltitle, studentID);
//        JOptionPane.showMessageDialog(this, studentID, "Error", JOptionPane.ERROR_MESSAGE);
//        String error = onsiteCourseBLL.handleSelectedOnsiteCourse(courseID, OnsiteCourse_ID_TextField, OnsiteCourse_Title_TextField, OnsiteCourse_Credits_TextField, OnsiteCourse_DepartmentID_TextField, OnsiteCourse_Location_TextField, OnsiteCourse_Days_TextField, OnsiteCourse_Time_TextField);
//        if(error != null) {
//            JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
//        } 
    }//GEN-LAST:event_Studentgrade_StudentList_TableMouseClicked

    private void Studentgrade_studentList_search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Studentgrade_studentList_search_btnMouseClicked
        String keyWord = studentlist_searchStudent_input.getText().trim();
        if (!keyWord.isEmpty()) {
            personBLL.displayStudentListInTableBySearchFunction(Studentgrade_StudentList_Table, keyWord);
        }
    }//GEN-LAST:event_Studentgrade_studentList_search_btnMouseClicked

    private void studentlist_searchStudent_inputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_studentlist_searchStudent_inputCaretUpdate
        String keyWord = studentlist_searchStudent_input.getText().trim();
        if (keyWord.isEmpty()) {
            personBLL.displayStudentListInTable(Studentgrade_StudentList_Table);
        } else {
            personBLL.displayStudentListInTableBySearchFunction(Studentgrade_StudentList_Table, keyWord);
        }
    }//GEN-LAST:event_studentlist_searchStudent_inputCaretUpdate

    private void OnsiteCourse_Update_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnsiteCourse_Update_Button1MouseClicked
        // Update student grade
        int rowStudent = Studentgrade_StudentList_Table.getSelectedRow();
        int rowCourse = Studentgrade_Courses_Table.getSelectedRow();
        if (rowStudent == -1 || rowCourse == -1) {
            if (rowStudent == -1) {
                JOptionPane.showMessageDialog(this, "Please, choose a student yout want to update grade!", "Alert", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Please, choose a course yout want to update grade!", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            int studentID = (int) Studentgrade_StudentList_Table.getModel().getValueAt(rowStudent, 1);
            String studentName = (String) Studentgrade_StudentList_Table.getModel().getValueAt(rowStudent, 2);
            int courseID = (int) Studentgrade_Courses_Table.getModel().getValueAt(rowCourse, 1);
            String courseTitle = (String) Studentgrade_Courses_Table.getModel().getValueAt(rowCourse, 2);
            String input = JOptionPane.showInputDialog(this,
                    "Enter Grade of Course: " + courseTitle,
                    "Edit Grade of Student: " + studentName,
                    JOptionPane.INFORMATION_MESSAGE);
            Validate validate = new Validate();
            if (validate.isNumeric(input)) {
                // Insert grade to DB   
//                Float grade = Float.parseFloat(input);
                String grade = String.format("%.02f", Float.parseFloat(input));
                if (studengradeBLL.updateGrade(studentID, courseID, grade)) {
                    JOptionPane.showMessageDialog(this, "The grade had updated!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    Studentgrade_Courses_Table.getModel().setValueAt(grade, rowCourse, 3);
                } else {
                    JOptionPane.showMessageDialog(this, "Fail to update grade!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "The grade must be numeric!", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_OnsiteCourse_Update_Button1MouseClicked

    private void Studentgrade_courseList_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Studentgrade_courseList_TableMouseClicked
        // Click cousre
        int row = Studentgrade_courseList_Table.getSelectedRow();
        int courseID = (int) Studentgrade_courseList_Table.getModel().getValueAt(row, 1);
        studengradeBLL.displayGradeOfStudentInTable(Studentgrade_studentGrade_Table, studentgrade_courseName_ltitle, courseID);
    }//GEN-LAST:event_Studentgrade_courseList_TableMouseClicked

    private void studentlist_searchCourse_inputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_studentlist_searchCourse_inputCaretUpdate
        // Search course
        String keyWord = studentlist_searchCourse_input.getText().trim();
        if (keyWord.isEmpty()) {
            courseBLL.displayAllCoursesInTable(Studentgrade_courseList_Table);
        } else {
            courseBLL.displayStudentListInTableBySearchFunction(Studentgrade_courseList_Table, keyWord);
        }
    }//GEN-LAST:event_studentlist_searchCourse_inputCaretUpdate

    private void Studentgrade_courseList_search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Studentgrade_courseList_search_btnMouseClicked
        String keyWord = studentlist_searchCourse_input.getText().trim();
        if (!keyWord.isEmpty()) {
            courseBLL.displayStudentListInTableBySearchFunction(Studentgrade_courseList_Table, keyWord);
        }
    }//GEN-LAST:event_Studentgrade_courseList_search_btnMouseClicked

    private void Studentgrade_courseList_search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Studentgrade_courseList_search_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Studentgrade_courseList_search_btnActionPerformed

    private void Studentgrade_studentGrade_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Studentgrade_studentGrade_TableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Studentgrade_studentGrade_TableMouseClicked

    private void Studentgrade_UpdateStudentGrade_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Studentgrade_UpdateStudentGrade_ButtonMouseClicked
        int rowStudent = Studentgrade_studentGrade_Table.getSelectedRow();
        int rowCourse = Studentgrade_courseList_Table.getSelectedRow();
        if (rowStudent == -1 || rowCourse == -1) {
            if (rowStudent == -1) {
                JOptionPane.showMessageDialog(this, "Please, choose a student yout want to update grade!", "Alert", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Please, choose a course yout want to update grade!", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            int studentID = (int) Studentgrade_studentGrade_Table.getModel().getValueAt(rowStudent, 1);
            String studentName = (String) Studentgrade_studentGrade_Table.getModel().getValueAt(rowStudent, 2);
            int courseID = (int) Studentgrade_courseList_Table.getModel().getValueAt(rowCourse, 1);
            String courseTitle = (String) Studentgrade_courseList_Table.getModel().getValueAt(rowCourse, 2);
            String input = JOptionPane.showInputDialog(this,
                    "Enter Grade of Student: " + studentName,
                    "Edit Grade of Course: " + courseTitle,
                    JOptionPane.INFORMATION_MESSAGE);
            Validate validate = new Validate();
            if (validate.isNumeric(input)) {
                // Insert grade to DB   
//                Float grade = Float.parseFloat(input);
                String grade = String.format("%.02f", Float.parseFloat(input));
                if (studengradeBLL.updateGrade(studentID, courseID, grade)) {
                    JOptionPane.showMessageDialog(this, "The grade had updated!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    Studentgrade_studentGrade_Table.getModel().setValueAt(grade, rowCourse, 3);
                } else {
                    JOptionPane.showMessageDialog(this, "Fail to update grade!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "The grade must be numeric!", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_Studentgrade_UpdateStudentGrade_ButtonMouseClicked

    private void Studentgrade_UpdateStudentGrade_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Studentgrade_UpdateStudentGrade_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Studentgrade_UpdateStudentGrade_ButtonActionPerformed

    private void CourseInstructor_Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseInstructor_Search_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseInstructor_Search_ButtonActionPerformed

    private void CourseInstructor_Search_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseInstructor_Search_ButtonMouseClicked
        // TODO add your handling code here:
        String keyWord = CourseInstructor_Search_TextField.getText().trim();
        if (!keyWord.isEmpty()) {
            courseInstructorBLL.displayStudentListInTableBySearchFunction(CourseInstructor_List_Table1, keyWord);
        }
    }//GEN-LAST:event_CourseInstructor_Search_ButtonMouseClicked

    private void CourseInstructor_Search_TextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CourseInstructor_Search_TextFieldCaretUpdate
        // TODO add your handling code here:
        String keyWord = CourseInstructor_Search_TextField.getText().trim();
        if (keyWord.isEmpty()) {
            courseInstructorBLL.dipslayDetailsCourseInstructorListInTable(CourseInstructor_List_Table1);
        } else {
            courseInstructorBLL.displayStudentListInTableBySearchFunction(CourseInstructor_List_Table1, keyWord);
        }
        
    }//GEN-LAST:event_CourseInstructor_Search_TextFieldCaretUpdate

    private void CourseIntructor_Create_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseIntructor_Create_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseIntructor_Create_ButtonActionPerformed

    private void CourseIntructor_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseIntructor_Update_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseIntructor_Update_ButtonActionPerformed

    private void CourseIntructor_Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseIntructor_Delete_ButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = CourseInstructor_List_Table1.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this course instructor?", "Yes", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int rowID = CourseInstructor_List_Table1.getSelectedRow();
                int courseID = (int) CourseInstructor_List_Table1.getModel().getValueAt(rowID, 1);
                int personID = (int) CourseInstructor_List_Table1.getModel().getValueAt(rowID, 3);
                String error = courseInstructorBLL.handleDeleteCourseInstructor(courseID, personID, CourseIntructor_Title_TextField, CourseIntructor_FirstName_TextField, CourseIntructor_LastName_TextField, CourseIntructor_CourseID_TextField, CourseIntructor_PersonID_TextField);
                if (error != null) {
                    JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Delete the course instructor successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    courseInstructorBLL.dipslayDetailsCourseInstructorListInTable(CourseInstructor_List_Table1);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course instructor on the table to delete", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CourseIntructor_Delete_ButtonActionPerformed

    private void CourseIntructor_Reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseIntructor_Reset_ButtonActionPerformed
        courseInstructorBLL.handleResetCourseInstructor(CourseIntructor_Title_TextField, CourseIntructor_FirstName_TextField, CourseIntructor_LastName_TextField, CourseIntructor_CourseID_TextField, CourseIntructor_PersonID_TextField);
        CourseInstructor_List_Table1.clearSelection();
    }//GEN-LAST:event_CourseIntructor_Reset_ButtonActionPerformed

    private void CourseInstructor_List_Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseInstructor_List_Table1MouseClicked
        //OnsiteCourse_ID_TextField.setEditable(false);
        //OnsiteCourse_ID_TextField.setBackground(Color.WHITE);
        int rowID = CourseInstructor_List_Table1.getSelectedRow();
        int courseID = (int) CourseInstructor_List_Table1.getModel().getValueAt(rowID, 1);
        String Title = (String) CourseInstructor_List_Table1.getModel().getValueAt(rowID, 2);
        int personID = (int) CourseInstructor_List_Table1.getModel().getValueAt(rowID, 3);
        String FirstName = (String) CourseInstructor_List_Table1.getModel().getValueAt(rowID, 4);
        String LastName = (String) CourseInstructor_List_Table1.getModel().getValueAt(rowID, 5);
        String error = courseInstructorBLL.handleSelectedCourseInstructor(courseID, personID, Title, FirstName, LastName, CourseIntructor_Title_TextField, CourseIntructor_FirstName_TextField, CourseIntructor_LastName_TextField, CourseIntructor_CourseID_TextField, CourseIntructor_PersonID_TextField);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CourseInstructor_List_Table1MouseClicked

    private void CourseIntructor_CourseID_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseIntructor_CourseID_TextFieldActionPerformed
        String courseIDText = CourseIntructor_CourseID_TextField.getText();
        if (courseIDText != null && !courseIDText.isEmpty()) {
            int CourseID = Integer.parseInt(courseIDText);
            Course course = courseBLL.getCourseByID(CourseID);
            if(course.getTilte() == null){
                JOptionPane.showMessageDialog(this, "Not available for CourseID, please check and type again", "Alert", JOptionPane.WARNING_MESSAGE);
                CourseIntructor_CourseID_TextField.setText("");
                CourseIntructor_Title_TextField.setText("");
            }else{
                CourseIntructor_Title_TextField.setText(course.getTilte());
            }      
        } else {
            JOptionPane.showMessageDialog(this, "You haven't entered anything in CourseID", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CourseIntructor_CourseID_TextFieldActionPerformed

    private void CourseIntructor_PersonID_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseIntructor_PersonID_TextFieldActionPerformed
        // TODO add your handling code here:
        String personIDText = CourseIntructor_PersonID_TextField.getText();
        if (personIDText != null && !personIDText.isEmpty()) {
            int PersonID = Integer.parseInt(personIDText);
            Person person = personBLL.getPersonByID(PersonID);
            if(person.getPersonID() == 0){
                JOptionPane.showMessageDialog(this, "Not available for PersonID, please check and type again", "Alert", JOptionPane.WARNING_MESSAGE);
                CourseIntructor_PersonID_TextField.setText("");
                CourseIntructor_LastName_TextField.setText("");
                CourseIntructor_FirstName_TextField.setText("");
            }else{
                if(personBLL.checkPersonIsStudentOrTeacher(PersonID)){ //check if person is teacher
                    CourseIntructor_LastName_TextField.setText(person.getLastname());
                    CourseIntructor_FirstName_TextField.setText(person.getFirstname());  
                }else{
                    JOptionPane.showMessageDialog(this, "PersonID isn't teacher, please check and type again", "Alert", JOptionPane.WARNING_MESSAGE);
                    CourseIntructor_PersonID_TextField.setText("");
                    CourseIntructor_LastName_TextField.setText("");
                    CourseIntructor_FirstName_TextField.setText("");
                }
            }      
        } else {
            JOptionPane.showMessageDialog(this, "You haven't entered anything in PersonID", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CourseIntructor_PersonID_TextFieldActionPerformed

    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new CourseManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CourseInstructor_List_Table1;
    private javax.swing.JButton CourseInstructor_Search_Button;
    private javax.swing.JTextField CourseInstructor_Search_TextField;
    private javax.swing.JTextField CourseIntructor_CourseID_TextField;
    private javax.swing.JButton CourseIntructor_Create_Button;
    private javax.swing.JButton CourseIntructor_Delete_Button;
    private javax.swing.JTextField CourseIntructor_FirstName_TextField;
    private javax.swing.JTextField CourseIntructor_LastName_TextField;
    private javax.swing.JPanel CourseIntructor_PersonID_Panel;
    private javax.swing.JTextField CourseIntructor_PersonID_TextField;
    private javax.swing.JButton CourseIntructor_Reset_Button;
    private javax.swing.JTextField CourseIntructor_Title_TextField;
    private javax.swing.JButton CourseIntructor_Update_Button;
    private javax.swing.JTable OnlineCourse_CourseList_Table;
    private javax.swing.JButton OnlineCourse_Create_Button;
    private javax.swing.JTextField OnlineCourse_Credits_TextField;
    private javax.swing.JButton OnlineCourse_Delete_Button;
    private javax.swing.JTextField OnlineCourse_DepartmentID_TextField;
    private javax.swing.JTextField OnlineCourse_ID_TextField;
    private javax.swing.JButton OnlineCourse_Refresh_Button;
    private javax.swing.JButton OnlineCourse_Reset_Button;
    private javax.swing.JButton OnlineCourse_Search_Button;
    private javax.swing.JTextField OnlineCourse_Search_TextField;
    private javax.swing.JTextField OnlineCourse_Title_TextField;
    private javax.swing.JButton OnlineCourse_Update_Button;
    private javax.swing.JTextField OnlineCourse_Url_TextField;
    private javax.swing.JTable OnsiteCourse_CourseList_Table;
    private javax.swing.JButton OnsiteCourse_Create_Button;
    private javax.swing.JTextField OnsiteCourse_Credits_TextField;
    private javax.swing.JTextField OnsiteCourse_Days_TextField;
    private javax.swing.JButton OnsiteCourse_Delete_Button;
    private javax.swing.JTextField OnsiteCourse_DepartmentID_TextField;
    private javax.swing.JTextField OnsiteCourse_ID_TextField;
    private javax.swing.JTextField OnsiteCourse_Location_TextField;
    private javax.swing.JButton OnsiteCourse_Refresh_Button;
    private javax.swing.JButton OnsiteCourse_Reset_Button;
    private javax.swing.JButton OnsiteCourse_Search_Button;
    private javax.swing.JTextField OnsiteCourse_Search_TextField;
    private javax.swing.JTextField OnsiteCourse_Time_TextField;
    private javax.swing.JTextField OnsiteCourse_Title_TextField;
    private javax.swing.JButton OnsiteCourse_Update_Button;
    private javax.swing.JButton OnsiteCourse_Update_Button1;
    private javax.swing.JTable Studentgrade_Courses_Table;
    private javax.swing.JTable Studentgrade_StudentList_Table;
    private javax.swing.JButton Studentgrade_UpdateStudentGrade_Button;
    private javax.swing.JTable Studentgrade_courseList_Table;
    private javax.swing.JButton Studentgrade_courseList_search_btn;
    private javax.swing.JTable Studentgrade_studentGrade_Table;
    private javax.swing.JButton Studentgrade_studentList_search_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel studentgrade_courseName_ltitle;
    private javax.swing.JLabel studentgrade_studentName_ltitle;
    private javax.swing.JTextField studentlist_searchCourse_input;
    private javax.swing.JTextField studentlist_searchStudent_input;
    // End of variables declaration//GEN-END:variables
}
