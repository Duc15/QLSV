/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quan_li_sv;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Duc
 */
public class quan_li_sv extends javax.swing.JFrame {
    ImageIcon logo = new ImageIcon("logo.png");
    private static final String username ="root";
    private static final String password ="";
    private static final String dataConn ="jdbc:mysql://localhost:3306/java";
    Connection sqlConn = null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    int q,i,id,deleteItem;
    public quan_li_sv() {
        initComponents();
        jLabel8.setIcon(logo);
    }
    public void updateDB() {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn =  DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("select * from sinhvien");
        //câu lệnh tham số hóa hoặc truy vấn tham số hóa là một tính năng được sử dụng để biên dịch trước mã SQL, tách nó khỏi dữ liệu
        rs = pst.executeQuery();
        //ExecuteQuery (chỉ lấy hàng trong kho): sử dụng chủ yếu cho các câu query select.
        ResultSetMetaData stData = rs.getMetaData();
        //ResultSetMetaData trong java được sử dụng để lấy ra các metadata từ đối tượng ResultSet.
        q = stData.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        RecordTable.setRowCount(0);
        while(rs.next()){
        Vector columnData = new Vector();
        for(i = 1;i<=q;i++) {
            columnData.add(rs.getString("ID"));
            columnData.add(rs.getString("Masv"));
            columnData.add(rs.getString("Hoten"));
            columnData.add(rs.getString("Diachi"));
            columnData.add(rs.getString("SDT"));
            columnData.add(rs.getString("Khoa"));
            columnData.add(rs.getString("Lop"));
            columnData.add(rs.getString("Gioitinh"));
        }
        RecordTable.addRow(columnData);
                }
       
    }
     catch(ClassNotFoundException | SQLException ex) {
         JOptionPane.showMessageDialog(this,ex);
                }
    }
    
    public boolean checkEx(){
        if(nhapMsv.getText().equals("") 
                || nhapHoten.getText().equals("") 
                || nhapDiachi.getText().equals("") 
                ||nhapSdt.getText().equals("")
                ||nhapKhoa.getText().equals("") 
                ||nhapLop.getText().equals("") 
                || jComboBox1.getSelectedItem().toString().equals("")
                 ){
        return true;
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        buttonThoat = new javax.swing.JButton();
        buttonThem = new javax.swing.JButton();
        buttonSua = new javax.swing.JButton();
        buttonRest = new javax.swing.JButton();
        buttonIn = new javax.swing.JButton();
        buttonXoa = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nhapMsv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nhapHoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nhapDiachi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nhapSdt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nhapKhoa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nhapLop = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 160, 130));

        buttonThoat.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        buttonThoat.setText("Thoát");
        buttonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThoatActionPerformed(evt);
            }
        });
        jPanel3.add(buttonThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 170, 60));

        buttonThem.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        buttonThem.setText("Thêm");
        buttonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemActionPerformed(evt);
            }
        });
        jPanel3.add(buttonThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 60));

        buttonSua.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        buttonSua.setText("Sửa");
        buttonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaActionPerformed(evt);
            }
        });
        jPanel3.add(buttonSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, 60));

        buttonRest.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        buttonRest.setText("Reset");
        buttonRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestActionPerformed(evt);
            }
        });
        jPanel3.add(buttonRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 60));

        buttonIn.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        buttonIn.setText("In");
        buttonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInActionPerformed(evt);
            }
        });
        jPanel3.add(buttonIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 170, 60));

        buttonXoa.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        buttonXoa.setText("Xóa");
        buttonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaActionPerformed(evt);
            }
        });
        jPanel3.add(buttonXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, 60));

        buttonSearch.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        buttonSearch.setText("Tìm kiếm");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        jPanel3.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 210, 570));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("Mã sv");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 40));

        nhapMsv.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        nhapMsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapMsvActionPerformed(evt);
            }
        });
        jPanel5.add(nhapMsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 460, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("Họ tên");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 40));

        nhapHoten.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        nhapHoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapHotenActionPerformed(evt);
            }
        });
        jPanel5.add(nhapHoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 460, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setText("Địa chỉ");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, 40));

        nhapDiachi.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel5.add(nhapDiachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 460, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel5.setText("SĐT");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 40));

        nhapSdt.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel5.add(nhapSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 460, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã sv", "Họ tên", "Địa chỉ", "SĐT", "Khoa", "Lớp", "Giới tính"
            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 750, 220));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setText("Khoa");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 40));

        nhapKhoa.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel5.add(nhapKhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 210, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setText("Lớp");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, 40));

        nhapLop.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel5.add(nhapLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 210, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 110, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel11.setText("Giới tính");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 770, 570));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel9.setText("Trường Đại học Kiến Trúc Hà Nội");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 120));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setText("Trường Đại học Kiến trúc Hà Nội");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel10.setText("Quản lý sinh viên");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jButton1.setText("Nhóm 4");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "About us", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 170, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(frame, "Thành viên nhóm 4 gồm :\n Phạm Minh Đức (Nhóm trưởng) \n Trần Thu Hiền \n Nguyễn Minh Tuấn \n Đường Cảnh Dương \n Nguyễn Cảnh Phi");
    }//GEN-LAST:event_jButton1ActionPerformed
private JFrame frame;
    private void buttonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThoatActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Bạn chắc chắn muốn thoát chứ ?","Nhóm 4",
               JOptionPane.YES_NO_OPTION )==JOptionPane.YES_OPTION) {
            //Lớp JOptionPane trong Java Swing là một thành phần cung cấp các phương thức chuẩn để gọi một hộp
            //thoại dialog chuẩn cho một giá trị hoặc thông báo người dùng
            System.exit(0);
        }
    }//GEN-LAST:event_buttonThoatActionPerformed

    private void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemActionPerformed
        if(checkEx()) {
        JOptionPane.showMessageDialog(null,"Bạn chưa điền hết thông tin của sinh viên","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn =  DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("INSERT INTO sinhvien(Masv,Hoten,Diachi,SDT,Khoa,Lop,Gioitinh) VALUES (?,?,?,?,?,?,?)");
        pst.setString(1, nhapMsv.getText());
        pst.setString(2, nhapHoten.getText());
        pst.setString(3, nhapDiachi.getText());
        pst.setString(4, nhapSdt.getText());
        pst.setString(5, nhapKhoa.getText());
        pst.setString(6, nhapLop.getText());
        pst.setString(7, (String)jComboBox1.getSelectedItem());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Đã thêm");
        updateDB();  
        nhapMsv.setText("");
        nhapHoten.setText("");
        nhapDiachi.setText("");
        nhapSdt.setText("");
        nhapKhoa.setText("");
        nhapLop.setText("");
    }                                          
catch(  ClassNotFoundException | SQLException ex) {
    java.util.logging.Logger.getLogger(quan_li_sv.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
    JOptionPane.showMessageDialog(null,"Sai kiểu dữ liệu");
    
}
  
    }//GEN-LAST:event_buttonThemActionPerformed
}
    private void buttonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        id = Integer.parseInt(RecordTable.getValueAt(SelectedRows,0).toString());
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn =  DriverManager.getConnection(dataConn,username,password);
         pst = sqlConn.prepareStatement("update sinhvien set Masv =?,Hoten =?,Diachi =?, SDT =?,Khoa =?,Lop =?,Gioitinh =? where ID ="+id);
        pst.setString(1, nhapMsv.getText());
        pst.setString(2, nhapHoten.getText());
        pst.setString(3, nhapDiachi.getText());
        pst.setString(4, nhapSdt.getText());
        pst.setString(5, nhapKhoa.getText());
        pst.setString(6, nhapLop.getText());
        pst.setString(7, (String)jComboBox1.getSelectedItem());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Cập nhật thành công");
        updateDB();   
    }        
         
catch(  ClassNotFoundException | SQLException ex) {
    java.util.logging.Logger.getLogger(quan_li_sv.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
     JOptionPane.showMessageDialog(null,"Sai kiểu dữ liệu");
}
         finally {
             updateDB();  
         }
        
    }//GEN-LAST:event_buttonSuaActionPerformed

    private void buttonRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestActionPerformed
        nhapMsv.setText("");
        nhapHoten.setText("");
        nhapDiachi.setText("");
        nhapSdt.setText("");
        nhapKhoa.setText("");
        nhapLop.setText("");
    }//GEN-LAST:event_buttonRestActionPerformed

    private void buttonInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInActionPerformed
        MessageFormat header = new MessageFormat("Đang in");
        MessageFormat footer = new MessageFormat("Trang{0,number,integer}");
        try{
        jTable1.print(JTable.PrintMode.NORMAL,header,footer);
                }
        catch(java.awt.print.PrinterException e) {
        System.err.format("Không tìm thấy máy in nào",e.getMessage());
                }
        
    }//GEN-LAST:event_buttonInActionPerformed

    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        //DefaultTableModel lưu trữ dữ liệu cho JTable trong một > Vector > Vectors 
        //model đại diện cho dữ liệu trong ứng
        int SelectedRows = jTable1.getSelectedRow();
        try{
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows,0).toString());
            deleteItem = JOptionPane.showConfirmDialog(null,"Bạn có chắc muốn xóa không","Cảnh báo",JOptionPane.YES_NO_CANCEL_OPTION);
            if(deleteItem == JOptionPane.YES_OPTION) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn =  DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("delete from sinhvien where id = ?");
        pst.setInt(1, id);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this,"Đã xóa sinh viên được chọn");
        updateDB();
        nhapMsv.setText("");
        nhapHoten.setText("");
        nhapDiachi.setText("");
        nhapSdt.setText("");
        nhapKhoa.setText("");
        nhapLop.setText("");
            }
        } catch(ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(quan_li_sv.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
         JOptionPane.showMessageDialog(null,"Sai kiểu dữ liệu");
        }
    }//GEN-LAST:event_buttonXoaActionPerformed

    private void nhapMsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapMsvActionPerformed
    }//GEN-LAST:event_nhapMsvActionPerformed

    private void nhapHotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapHotenActionPerformed
    }//GEN-LAST:event_nhapHotenActionPerformed
String a;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
    int SelectedRows = jTable1.getSelectedRow();
    nhapMsv.setText(RecordTable.getValueAt(SelectedRows,1).toString());
    nhapHoten.setText(RecordTable.getValueAt(SelectedRows,2).toString());
    nhapDiachi.setText(RecordTable.getValueAt(SelectedRows,3).toString());
    nhapSdt.setText(RecordTable.getValueAt(SelectedRows,4).toString());
    nhapKhoa.setText(RecordTable.getValueAt(SelectedRows,5).toString());
    nhapLop.setText(RecordTable.getValueAt(SelectedRows,6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        updateDB();
    }//GEN-LAST:event_formWindowOpened

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        tim_kiem search = new tim_kiem();
        search.show();
        this.dispose();
    }//GEN-LAST:event_buttonSearchActionPerformed
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
String gioitinh2 = (String)jComboBox1.getSelectedItem();
String gioitinh = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

  
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(quan_li_sv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quan_li_sv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quan_li_sv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quan_li_sv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quan_li_sv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIn;
    private javax.swing.JButton buttonRest;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonSua;
    private javax.swing.JButton buttonThem;
    private javax.swing.JButton buttonThoat;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nhapDiachi;
    private javax.swing.JTextField nhapHoten;
    private javax.swing.JTextField nhapKhoa;
    private javax.swing.JTextField nhapLop;
    private javax.swing.JTextField nhapMsv;
    private javax.swing.JTextField nhapSdt;
    // End of variables declaration//GEN-END:variables
}
