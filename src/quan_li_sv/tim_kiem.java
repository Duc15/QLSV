package quan_li_sv;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tim_kiem extends javax.swing.JFrame {
    private static final String username ="root";
    private static final String password ="";
    private static final String dataConn ="jdbc:mysql://localhost:3306/java";
    Connection sqlConn = null;
    Statement st;
    PreparedStatement pst =null;
    ResultSet rs = null;
    int q,i,id,deleteItem;
    public tim_kiem() {
        initComponents();
    }
public void updateDB() {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn =  DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("select * from sinhvien");
        
        rs = pst.executeQuery();
        ResultSetMetaData stData = rs.getMetaData();
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
          JOptionPane.showMessageDialog(null,"Sai kiểu dữ liệu");
                }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldMasv = new javax.swing.JTextField();
        jButtonTim = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonBack = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã sinh viên", "Tên", "Địa chỉ", "SDT", "Khoa", "Lớp", "Giới tính"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextFieldMasv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMasvActionPerformed(evt);
            }
        });

        jButtonTim.setText("Tìm");
        jButtonTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sinh viên", "Tên sinh viên", "Khoa", "Lớp" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonSua.setText("Sửa");

        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jLabel1.setText("Tìm kiếm theo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldMasv, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86)
                                        .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addComponent(jButtonTim, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldMasv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonTim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkSearch(){
    if(jTextFieldMasv.getText().equals("")) {
    return true;
    }
    return false;
    }
    private void jButtonTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimActionPerformed
                if((String) jComboBox1.getSelectedItem() =="Mã sinh viên") {
                    if(checkSearch()) {
                    updateDB();
                    }
                    else{
                         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn =  DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("select * from sinhvien where Masv =?");
        int Masv = Integer.parseInt(jTextFieldMasv.getText()) ;
        pst.setInt(1, Masv);
        rs = pst.executeQuery();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        RecordTable.setRowCount(0);
        while(rs.next()){
        Vector columnData = new Vector();
        columnData.add(rs.getString("ID"));
            columnData.add(rs.getString("Masv"));
            columnData.add(rs.getString("Hoten"));
            columnData.add(rs.getString("Diachi"));
            columnData.add(rs.getString("SDT"));
            columnData.add(rs.getString("Khoa"));
            columnData.add(rs.getString("Lop"));
            columnData.add(rs.getString("Gioitinh"));
        RecordTable.addRow(columnData);
                }
       
    }
     catch(ClassNotFoundException | SQLException ex) {
         JOptionPane.showMessageDialog(this,ex);
          JOptionPane.showMessageDialog(null,"Sai kiểu dữ liệu");
                }
                    }
           
        }
        
        
        if((String) jComboBox1.getSelectedItem() =="Tên sinh viên") {
            if((String) jComboBox1.getSelectedItem() =="Mã sinh viên") {
                    if(checkSearch()) {
                    updateDB();
                    }
                    else{
             try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn =  DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("select * from sinhvien where Hoten =?");
        String Hoten = jTextFieldMasv.getText() ;
        pst.setString(1, Hoten);
        rs = pst.executeQuery();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        RecordTable.setRowCount(0);
        while(rs.next()){
        Vector columnData = new Vector();
        columnData.add(rs.getString("ID"));
            columnData.add(rs.getString("Masv"));
            columnData.add(rs.getString("Hoten"));
            columnData.add(rs.getString("Diachi"));
            columnData.add(rs.getString("SDT"));
            columnData.add(rs.getString("Khoa"));
            columnData.add(rs.getString("Lop"));
            columnData.add(rs.getString("Gioitinh"));
        
        RecordTable.addRow(columnData);
                }
       
    }
     catch(ClassNotFoundException | SQLException ex) {
         JOptionPane.showMessageDialog(this,ex);
          JOptionPane.showMessageDialog(null,"Sai kiểu dữ liệu");
                }
                    }
        }
       if((String) jComboBox1.getSelectedItem() =="Khoa") {
           if((String) jComboBox1.getSelectedItem() =="Mã sinh viên") {
                    if(checkSearch()) {
                    updateDB();
                    }
                    else{
       }
             try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn =  DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("select * from sinhvien where Khoa =?");
        String Khoa = jTextFieldMasv.getText() ;
        pst.setString(1, Khoa);
        rs = pst.executeQuery();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        RecordTable.setRowCount(0);
        while(rs.next()){
        Vector columnData = new Vector();
                    columnData.add(rs.getString("ID"));
            columnData.add(rs.getString("Masv"));
            columnData.add(rs.getString("Hoten"));
            columnData.add(rs.getString("Diachi"));
            columnData.add(rs.getString("SDT"));
            columnData.add(rs.getString("Khoa"));
            columnData.add(rs.getString("Lop"));
            columnData.add(rs.getString("Gioitinh"));
        
        RecordTable.addRow(columnData);
                }
       
    }
     catch(ClassNotFoundException | SQLException ex) {
         JOptionPane.showMessageDialog(this,ex);
          JOptionPane.showMessageDialog(null,"Sai kiểu dữ liệu");
                }
        }
       }
       if((String) jComboBox1.getSelectedItem() =="Lớp") {
           if((String) jComboBox1.getSelectedItem() =="Mã sinh viên") {
                    if(checkSearch()) {
                    updateDB();
                    }
                    else{
       }
             try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn =  DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("select * from sinhvien where Lop =?");
        String Lop = jTextFieldMasv.getText() ;
        pst.setString(1, Lop);
        rs = pst.executeQuery();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        RecordTable.setRowCount(0);
        while(rs.next()){
        Vector columnData = new Vector();
                    columnData.add(rs.getString("ID"));
            columnData.add(rs.getString("Masv"));
            columnData.add(rs.getString("Hoten"));
            columnData.add(rs.getString("Diachi"));
            columnData.add(rs.getString("SDT"));
            columnData.add(rs.getString("Khoa"));
            columnData.add(rs.getString("Lop"));
            columnData.add(rs.getString("Gioitinh"));
        
        RecordTable.addRow(columnData);
                }
       
    }
     catch(ClassNotFoundException | SQLException ex) {
         JOptionPane.showMessageDialog(this,ex);
          JOptionPane.showMessageDialog(null,"Sai kiểu dữ liệu");
                }
        }
       }  }
    }//GEN-LAST:event_jButtonTimActionPerformed

    private void jTextFieldMasvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMasvActionPerformed

    }//GEN-LAST:event_jTextFieldMasvActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        quan_li_sv back = new quan_li_sv();
        back.show();
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedItem = (String) jComboBox1.getSelectedItem();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
       DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
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
        
            }
        } catch(ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(quan_li_sv.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
         JOptionPane.showMessageDialog(null,"Sai kiểu dữ liệu");
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
    int SelectedRows = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tim_kiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tim_kiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonTim;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldMasv;
    // End of variables declaration//GEN-END:variables
}
