/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import static Frame.ChoosenMajorChoosingSchool.con;
import static Frame.ChoosenMajorChoosingSchool.rs;
import static Frame.ChoosenMajorChoosingSchool.stm;
import database.ConnectionFunction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import src.AssignmentManager;
import src.StandadizedMethod;
import src.weightManager;

/**
 *
 * @author NguyenVanDung
 */
public class ChosenSchoolChoosingMajor extends javax.swing.JFrame {

    public String[] importance = new String[6];
    public String[] prefer = new String[17];

    public float[] imWeight;
    public float[] preWeight;

    float[] diemDauVao;
    float[] diemNamNgoai;
    float[] diem2NamTruoc;
    float[] diem3NamTruoc;
    float[] tiLeThapHon;
    float[] xuHuong;
    int N = 17;

    public static Connection con = null;
    public static ResultSet rs = null;
    public static PreparedStatement stm = null;

    public static float[] stantadizedData;
    public static float[] weightedData;

    public static String[] university = {
        "Học Viện An Ninh Nhân Dân",
        "Học Viện Công Nghệ Bưu Chính Viễn Thông(Phía Bắc)",
        "Đại học Tài Nguyên và Môi Trường Hà Nội",
        "Đại Học Bách Khoa Hà Nội",
        "Đại Học Hà Nội",
        "Đại Học Giao Thông Vận Tải ( Cơ sở Phía Bắc )",
        "Đại Học Điện Lực",
        "Học Viện Kỹ Thuật Mật Mã",
        "Đại Học Sư Phạm Hà Nội",
        "Đại Học Kinh Tế Kỹ Thuật Công Nghiệp",
        "Viện Đại Học Mở Hà Nội",
        "Đại Học Thủy Lợi ( Cơ sở 1 )",
        "Đại Học Mỏ Địa Chất",
        "Đại học Nông Nghiệp Hà Nội",
        "Đại Học Lâm Nghiệp ( Cơ sở 1 )",
        "Đại Học Công Nghiệp Việt Hung",
        "Đại Học Công Nghiệp Hà Nội"
    };

    /**
     * Creates new form ChoosingSchool
     */
    public ChosenSchoolChoosingMajor() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jComboBox19 = new javax.swing.JComboBox();
        jComboBox20 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chọn Ngành IT Trường Bách  Khoa Hà Nội");
        jPanel1.add(jLabel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quyết định", "Cực kì quan trọng", "Rất quan trọng", "Quan trọng", "Không quan trọng lắm", "Không quan trọng", "Không ảnh hưởng" }));
        jPanel2.add(jComboBox8);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quyết định", "Cực kì quan trọng", "Rất quan trọng", "Quan trọng", "Không quan trọng lắm", "Không quan trọng", "Không ảnh hưởng" }));
        jPanel2.add(jComboBox4);

        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setText("Mức độ quan trọng (khách quan)");
        jPanel4.add(jCheckBox2);

        jPanel5.setLayout(new java.awt.GridLayout(1, 1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText("Mức độ yêu thích");
        jPanel5.add(jCheckBox1);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rất rất thích", "Rất thích", "Thích", "Không thích lắm", "Không thích", "Ghét" }));
        jPanel6.add(jComboBox19);

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rất rất thích", "Rất thích", "Thích", "Không thích lắm", "Không thích", "Ghét" }));
        jPanel6.add(jComboBox20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        jPanel7.setLayout(new java.awt.GridLayout(1, 3));
        jPanel7.add(jLabel13);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Trợ giúp");
        jPanel7.add(jButton1);
        jPanel7.add(jLabel12);

        jMenu1.setText("Bảng dữ liệu");

        jMenuItem1.setText("Bảng dữ liệu");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Bảng dữ liệu đã nhân trọng số");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Bộ trọng số");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Xu hướng");

        jMenuItem4.setText("IT");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Kĩ thuật vật liệu");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 384, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(412, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ChosenSchoolChoosingMajor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChosenSchoolChoosingMajor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChosenSchoolChoosingMajor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChosenSchoolChoosingMajor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChosenSchoolChoosingMajor().setVisible(true);
            }
        });
    }

    public void getRawData() {
        String sql = "";
        //Lay du lie hien tai
        sql = "SELECT `data`.diem_dau_vao.t10\n"
                + "FROM `data`.diem_dau_vao";
        diemDauVao = getData(sql, N);
        //Lay diem nam ngoai
        sql = "SELECT `data`.choosing_university.last_score\n"
                + "FROM `data`.choosing_university\n"
                + "WHERE `data`.choosing_university.id < 18";
        diemNamNgoai = getData(sql, N);
        //Lay diem 2 nam truoc
        sql = "SELECT `data`.choosing_university.last_2_year_score\n"
                + "FROM `data`.choosing_university\n"
                + "WHERE `data`.choosing_university.id < 18";
        diem2NamTruoc = getData(sql, N);
        //Lay diem 3 nam truoc
        sql = "SELECT `data`.choosing_university.last_3_year_score\n"
                + "FROM `data`.choosing_university\n"
                + "WHERE `data`.choosing_university.id < 18";
        diem3NamTruoc = getData(sql, N);
        //Lay ti le sinh vien co diem cao hon
        tiLeThapHon = new float[N];
        float sum = 0;
        float thap = 0;
        float stopPositon = MainFrame.diemKhoiA * 2;
        for (int i = 0; i < N; i++) {
            sql = "SELECT `data`.sinh_vien_muc_diem.truong" + String.valueOf(i + 1) + "\n"
                    + "FROM `data`.sinh_vien_muc_diem";

            try {
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                int index = 0;
                while (rs.next()) {
                    sum += Float.parseFloat(rs.getString(1));
                    if (index < stopPositon) {
                        thap = sum;
                        index++;
                    }
                }
                tiLeThapHon[i] = thap / sum;
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            } catch (Exception e) {
                System.out.println(e.toString());
            }

        }
    }

    //Lay diem dau vao cua cac truong qua cac nam truoc day
    public float[] getData(String sql, int length) {
        //Lay diem dau vao
        float[] data = new float[length];
        try {
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            int index = 0;
            while (rs.next()) {
                data[index] = Float.parseFloat(rs.getString(1));
                index++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return data;
    }
//Hàm xử lý lấy dữ liệu đã nhân trọng số

    public void getWeightedData() {
        weightManager manager = new weightManager(
                importance,
                AssignmentManager.importance,
                AssignmentManager.importance_value,
                prefer,
                AssignmentManager.loveLevel,
                AssignmentManager.lovelevel_value);

        float[] importanceWeight = manager.getImportanceWeight();
        float[] preferWeight = manager.getPreferWeight();

    }

    //Hàm tạo kết nối cơ sở dữ liệu
    public static void queryDatabase() {
        try {
            con = ConnectionFunction.getConnection();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void weighProcessing() {
        weightManager manager = new weightManager(
                importance,
                AssignmentManager.importance,
                AssignmentManager.importance_value,
                prefer,
                AssignmentManager.loveLevel,
                AssignmentManager.lovelevel_value
        );

        imWeight = manager.getImportanceWeight();
        preWeight = manager.getPreferWeight();
    }
//Chuan hoa bang du lieu tho
//Tra lai bang du lieu da chuan hoa

   

    public void showTable(float[] table, int row, int column) {
        //Tao ten cot
        Vector col = new Vector();
        col.addElement("Điểm đầu vào");
        col.addElement("Điểm năm ngoái");
        col.addElement("Điểm năm kia");
        col.addElement("Điểm 3 năm trước");
        col.addElement("Tỉ lệ cao điểm hơn");
        col.addElement("Xu hướng điểm");
        //Tao vector data
        Vector data = new Vector();

        for (int i = 0; i < row; i++) {
            Vector vv = new Vector();
            for (int j = 0; j < column; j++) {
                vv.addElement(table[i * column + j]);
            }
            data.add(vv);
        }

        jTable1.setModel(new DefaultTableModel(data, col));

    }

    //Nhan du lieu bang voi bo trong so
    public float[] getWeightData(float[] data, float[] importance, float[] prefer) {
        int row = prefer.length;
        int col = importance.length;
        //Nhân bộ trọng số sở thích
        if (jCheckBox1.isSelected()) {
            for (int i = 0; i < row; i++) {
                for (int t = i * col; t < (i + 1) * col; t++) {
                    data[t] = prefer[i] * data[t];
                }
            }
        }

        //Nhân bộ trọng số quan trọng các thuộc tính
        if (jCheckBox2.isSelected()) {
            for (int i = 0; i < data.length; i++) {
                int r = i % col;
                data[i] *= importance[r];
            }
        }
        return data;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
