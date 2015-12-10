package Frame;

import database.ConnectionFunction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.ui.RefineryUtilities;
import src.FrequencyChart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NguyenVanDung
 */
public class MainFrame extends javax.swing.JFrame {

    public static Connection con = null;
    public static ResultSet rs = null;
    public static PreparedStatement stm = null;
    public static float diemKhoiA = (float)17.5;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        panel2 = new java.awt.Panel();
        label2 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label4 = new java.awt.Label();
        textField3 = new java.awt.TextField();
        label6 = new java.awt.Label();
        textField5 = new java.awt.TextField();
        label8 = new java.awt.Label();
        textField7 = new java.awt.TextField();
        label3 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        label5 = new java.awt.Label();
        textField4 = new java.awt.TextField();
        label7 = new java.awt.Label();
        textField6 = new java.awt.TextField();
        label9 = new java.awt.Label();
        textField8 = new java.awt.TextField();
        panel3 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label10 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        panel5 = new java.awt.Panel();
        label17 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        label15 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(new java.awt.GridLayout(1, 1));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label1.setText("Điểm Thi");
        panel1.add(label1);

        panel2.setLayout(new java.awt.GridLayout(2, 8));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label2.setText("Toán");
        panel2.add(label2);

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        panel2.add(textField1);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setText("Lí");
        panel2.add(label4);
        panel2.add(textField3);

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label6.setText("Hóa");
        panel2.add(label6);
        panel2.add(textField5);

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label8.setText("Sinh");
        panel2.add(label8);
        panel2.add(textField7);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label3.setText("Anh");
        panel2.add(label3);
        panel2.add(textField2);

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label5.setText("Văn");
        panel2.add(label5);
        panel2.add(textField4);

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label7.setText("Sử");
        panel2.add(label7);
        panel2.add(textField6);

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label9.setText("Địa");
        panel2.add(label9);
        panel2.add(textField8);

        panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel3.setLayout(new java.awt.GridLayout(1, 4));
        panel3.add(jLabel4);
        panel3.add(jLabel1);

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label10.setText("Quê quán");
        panel3.add(label10);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "\tAn Giang", "\tBà Rịa - Vũng Tàu", "\tBắc Giang", "\tBắc Kạn", "\tBạc Liêu", "\tBắc Ninh", "\tBến Tre", "\tBình Định", "\tBình Dương", "\tBình Phước", "\tBình Thuận", "\tCà Mau", "\tCần Thơ", "\tCao Bằng", "\tĐà Nẵng", "\tĐắk Lắk", "\tĐắk Nông", "\tĐiện Biên", "\tĐồng Nai", "\tĐồng Tháp", "\tGia Lai", "\tHà Giang", "\tHà Nam", "\tHà Nội", "\tHà Tĩnh", "\tHải Dương", "\tHải Phòng", "\tHậu Giang", "\tHòa Bình", "\tHưng Yên", "\tKhánh Hòa", "\tKiên Giang", "\tKon Tum", "\tLai Châu", "\tLâm Đồng", "\tLạng Sơn", "\tLào Cai", "\tLong An", "\tNam Định", "\tNghệ An", "\tNinh Bình", "\tNinh Thuận", "\tPhú Thọ", "\tPhú Yên", "\tQuảng Bình", "\tQuảng Nam", "\tQuảng Ngãi", "\tQuảng Ninh", "\tQuảng Trị", "\tSóc Trăng", "\tSơn La", "\tTây Ninh", "\tThái Bình", "\tThái Nguyên", "\tThanh Hóa", "\tThừa Thiên Huế", "\tTiền Giang", "\tTP HCM", "\tTrà Vinh", "\tTuyên Quang", "\tVĩnh Long", "\tVĩnh Phúc", "\tYên Bái" }));
        panel3.add(jComboBox1);
        panel3.add(jLabel2);
        panel3.add(jLabel3);

        panel4.setLayout(new java.awt.GridLayout(1, 4));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn Trường", "Học Viện An Ninh Nhân Dân", "Học Viện Báo Chí – Tuyên Truyền", "Học Viên Chính Sách và Phát Triển", "Học Viện Công Nghệ Bưu Chính Viễn Thông ( Phía Bắc )", "Học Viện Kỹ Thuật Mật Mã", "Học Viện Ngân Hàng", "Học Viện Ngoại Giao", "Học Viện Tài Chính", "Học Điện Lực", "Khoa Luật – Đại Học Quốc Gia Hà Nội\t", "Khoa Y Dược ĐH QGHN", "Viện Đại Học Mở Hà Nội", "Đại Học Bách Khoa Hà Nội", "Đại học Công nghệ Giao thông vận tải", "Đại Học Công Nghệ – Đại Học Quốc Gia Hà Nội", "Đại Học Công Nghiệp Hà Nội", "Đại Học Công Nghiệp Việt Hung", "Đại Học Công Đoàn", "Đại Học Dầu Khí Việt Nam", "Đại Học Dược Hà Nội", "Đại Học Giao Thông Vận Tải ( Cơ sở Phía Bắc )", "Đại Học Hà Nội", "Đại Học Khoa Học Tự Nhiên", "Đại Học Khoa Học Tự Nhiên – Đại Học Quốc Gia Hà Nội", "Đại Học Khoa Học Xã Hội và Nhân Văn – Đại Học Quốc Gia Hà Nội", "Đại Học Kiến Trúc Hà Nội", "Đại Học Kinh Tế Kỹ Thuật Công Nghiệp", "Đại Học Kinh Tế Quốc Dân", "Đại Học Kinh Tế – Đại Học Quốc Gia Hà Nội", "Đại Học Lâm Nghiệp", "Đại Học Lâm Nghiệp ( Cơ sở 1 )", "Đại Học Lao Động – Xã Hội ( Cơ sở Hà Nội )", "Đại Học Lao Động – Xã Hội ( Cơ sở Sơn Tây )\t", "Đại Học Lao Động – Xã Hội ( Cơ sở Sơn Tây )", "Đại Học Luật Hà Nội", "Đại Học Mỏ Địa Chất", "Đại Học Ngoại Ngữ – Đại Học Quốc Gia Hà Nội\t", "Đại Học Ngoại Thương ( Cơ sở phía Bắc )\t", "Đại Học Ngoại Thương ( Cơ sở phía Bắc )", "Đại Học Nội Vụ", "Đại học Nông Nghiệp Hà Nội", "Đại Học Quốc Gia Hà Nội", "Đại Học Sư Phạm Hà Nội", "Đại học Tài Nguyên và Môi Trường Hà Nội", "Đại Học Thương Mại", "Đại Học Thủy Lợi ( Cơ sở 1 )", "Đại Học Văn Hóa Hà Nội", "Đại Học Y Hà Nội", "Đại Học Điện Lực" }));
        panel4.add(jComboBox2);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn Ngành", "Báo Chí", "Công nghệ Hạt Nhân", "Công Nghệ Sinh Học", "Công Nghệ Thông Tin", "Dầu Khí", "Hóa Dược", "Kế Toán", "Khoa Học Môi Trường", "Kĩ Thuậ Cơ Khí", "Kĩ Thuật Xây Dựng Công Trình", "Kĩ Thuật Điện Điện Tử", "Luật", "Marketing", "Quản Trị Dịch Vụ Du Lịch Và Lữ Hành", "Quản Trị Kinh Doanh", "Quản Trị Nhân Lực", "Tài Chính Ngân Hàng", "Tiếng Nhật", "Văn Học", "Y Đa Khoa" }));
        panel4.add(jComboBox3);

        panel5.setLayout(new java.awt.GridLayout(1, 5));
        panel5.add(label17);

        jButton1.setText("Trợ giúp");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        panel5.add(jButton1);
        panel5.add(label15);

        jMenu2.setText("Phổ điểm  khối");

        jMenuItem1.setText("Khối A");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Khối B");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Khối C");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Khối D");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Phổ điểm môn");

        jMenuItem5.setText("Toán");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Lí");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Hóa");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Sinh");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Anh");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Văn");
        jMenuItem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem10MouseReleased(evt);
            }
        });
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Sử");
        jMenuItem11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem11MouseReleased(evt);
            }
        });
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Địa");
        jMenuItem12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem12MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(839, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked

    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int toan = Integer.parseInt(textField1.getText().toString());
        int ly = Integer.parseInt(textField3.getText().toString());
        int hoa = Integer.parseInt(textField5.getText().toString());
        diemKhoiA = toan + ly + hoa;

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChoosenMajorChoosingSchool chose = new ChoosenMajorChoosingSchool();
                chose.queryDatabase();
                for (int i = 0; i < chose.importance.length; i++) {
                    chose.importance[i] = "Quan trọng";
                }
                for (int i = 0; i < chose.prefer.length; i++) {
                    chose.prefer[i] = "Thích";
                }
                chose.setVisible(true);
            }
        });

    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseReleased
        showPhoDiemMonToanQuoc(1, "toán");

    }//GEN-LAST:event_jMenuItem5MouseReleased

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem10MouseReleased
        showPhoDiemMonToanQuoc(2, "văn học");
    }//GEN-LAST:event_jMenuItem10MouseReleased

    private void jMenuItem9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseReleased
        showPhoDiemMonToanQuoc(3, "tiếng anh");
    }//GEN-LAST:event_jMenuItem9MouseReleased

    private void jMenuItem6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseReleased
        showPhoDiemMonToanQuoc(4, "vật lí");
    }//GEN-LAST:event_jMenuItem6MouseReleased

    private void jMenuItem7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseReleased
        showPhoDiemMonToanQuoc(5, "hóa học");
    }//GEN-LAST:event_jMenuItem7MouseReleased

    private void jMenuItem8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseReleased
        showPhoDiemMonToanQuoc(6, "sinh học");
    }//GEN-LAST:event_jMenuItem8MouseReleased

    private void jMenuItem11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseReleased
        showPhoDiemMonToanQuoc(7, "lịch sử");
    }//GEN-LAST:event_jMenuItem11MouseReleased

    private void jMenuItem12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem12MouseReleased
        showPhoDiemMonToanQuoc(8, "địa lí");
    }//GEN-LAST:event_jMenuItem12MouseReleased

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
        String sql = "SELECT diem_thi.Toan + diem_thi.Ly + diem_thi.Hoa FROM `data`.diem_thi WHERE diem_thi.Toan > -1 AND diem_thi.Ly > -1 AND diem_thi.Hoa > -1";
        showPhoDiemToanQuocTheoKhoi("A", sql);
    }//GEN-LAST:event_jMenuItem1MouseReleased

    private void jMenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseReleased
        String sql = "SELECT diem_thi.Toan + diem_thi.Sinh + diem_thi.Hoa FROM `data`.diem_thi WHERE diem_thi.Toan > -1 AND diem_thi.Sinh > -1 AND diem_thi.Hoa > -1";
        showPhoDiemToanQuocTheoKhoi("B", sql);
    }//GEN-LAST:event_jMenuItem2MouseReleased

    private void jMenuItem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseReleased
        String sql = "SELECT diem_thi.Van+diem_thi.Su+diem_thi.Dia FROM `data`.diem_thi WHERE  diem_thi.Van > -1 AND diem_thi.Su > -1 AND diem_thi.Dia > -1";
        showPhoDiemToanQuocTheoKhoi("C", sql);
    }//GEN-LAST:event_jMenuItem3MouseReleased

    private void jMenuItem4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseReleased
        String sql = "SELECT diem_thi.Toan+diem_thi.Van+diem_thi.NgoaiNgu FROM `data`.diem_thi WHERE  diem_thi.Toan > -1 AND diem_thi.Van > -1 AND diem_thi.NgoaiNgu > -1 ";
        showPhoDiemToanQuocTheoKhoi("D", sql);
    }//GEN-LAST:event_jMenuItem4MouseReleased

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                queryDatabase();

            }
        });
    }

    public void showPhoDiemToanQuocTheoKhoi(String khoi, String sql) {
        //String sql = "SELECT diem_thi.Toan + diem_thi.Ly + diem_thi.Hoa FROM `data`.diem_thi WHERE diem_thi.Toan > -1 AND diem_thi.Ly > -1 AND diem_thi.Hoa > -1";
        float[] data = new float[21];
        try {
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();

            float temp = 0;
            while (rs.next()) {
                temp = Float.parseFloat(rs.getString(1));
                temp = 2 * (temp / 3);
                data[(int) temp]++;

            }

            String headTitle = "Phổ điểm khối " + khoi;
            String title = "Phổ điểm khối " + khoi + " trên toàn quốc";
            FrequencyChart chart = new FrequencyChart(headTitle, title, data, "khoảng", "số lượng");
            chart.pack();
            RefineryUtilities.centerFrameOnScreen(chart);
            chart.setVisible(true);

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public void showPhoDiemMonToanQuoc(int monhoc, String tenmon) {

        float[] data = new float[21];
        String sql = "SELECT * FROM data.pho_dai_hoc_toan_quoc WHERE ID_mon_thi = " + String.valueOf(monhoc);
        try {
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                for (int i = 0; i < 21; i++) {
                    data[i] = Float.parseFloat(rs.getString(i + 2));
                }
            }

            String headTitle = "Phổ điểm " + tenmon;
            String title = "Phổ điểm " + tenmon + " toàn quốc";
            FrequencyChart chart = new FrequencyChart(headTitle, title, data, "khoảng", "số lượng");
            chart.pack();
            RefineryUtilities.centerFrameOnScreen(chart);
            chart.setVisible(true);

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void queryDatabase() {
        try {
            con = ConnectionFunction.getConnection();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label15;
    private java.awt.Label label17;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    // End of variables declaration//GEN-END:variables
}
