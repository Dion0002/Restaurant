/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestarurantPages;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;



public class ReceptionistPage extends javax.swing.JFrame {
    
    Connection con=null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form ClientPage
     */
    public ReceptionistPage() {
        initComponents();
        con = DBConnect.connect();
        tbl_ClientTable.setAutoCreateRowSorter(true);//Alphabetical  order 
         Client_Table();
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
        btn_Logout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ClientTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        txt_male = new javax.swing.JRadioButton();
        txt_female = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txt_R_time = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DateChooser_RD = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD CLIENT");

        btn_Logout.setBackground(new java.awt.Color(248, 148, 6));
        btn_Logout.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btn_Logout.setText("Log Out");
        btn_Logout.setAlignmentX(0.5F);
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_client_management_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 601, Short.MAX_VALUE)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Firstname :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lastname :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reservation Time :");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txt_firstname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txt_lastname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        tbl_ClientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Firstname", "Lastname", "Gender", "Phone", "Reservation Date", "Reservation Time"
            }
        ));
        tbl_ClientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ClientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ClientTable);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Phone :");

        txt_phone.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phoneKeyPressed(evt);
            }
        });

        txt_male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_male.setText("Male");
        txt_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maleActionPerformed(evt);
            }
        });

        txt_female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_female.setText("Female");
        txt_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_femaleActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Gender :");

        btn_add.setBackground(new java.awt.Color(248, 148, 6));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(248, 148, 6));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(248, 148, 6));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(248, 148, 6));
        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        txt_R_time.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_R_time.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_R_timeKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reservation Date :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(txt_male)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_female)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(DateChooser_RD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_R_time, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(292, Short.MAX_VALUE)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_male)
                            .addComponent(txt_female))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(DateChooser_RD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_R_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1220, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        //clear button
        txt_id.setText("");
        txt_firstname.setText("");
        txt_lastname.setText("");
        txt_male.setSelected(false);
        txt_female.setSelected(false);
        txt_phone.setText("");
        DateChooser_RD.setDate(null);
        txt_R_time.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try{
              //when a row is selectet than all the table info is are showed in to the fil
            int row = tbl_ClientTable.getSelectedRow();
            String update =(tbl_ClientTable.getModel().getValueAt(row, 0).toString());
            //delete all the values form the table and database
            String s ="DELETE FROM client_table  WHERE ID='"+update+"'";
            pst = con.prepareStatement(s);
            pst.executeUpdate();

            Client_Table();
            JOptionPane.showMessageDialog(null,"Client Deleted");
        }//end of try
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }//end of catch
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        //ask the user is he/she wont to add new employee
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to add new record ?","Add Record",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(x==0){
            try{
                 //add new employee to database
                String q ="INSERT INTO `client_table`(`Firstname`, `Lastname`, `Gender`, `Phone`, `Reservation_Date`, `Reservation_Time`) VALUES (?,?,?,?,?,?)";
                pst=con.prepareStatement(q);

                pst.setString(1, txt_firstname.getText());
                pst.setString(2, txt_lastname.getText());
                pst.setString(3, gender);
                pst.setString(4, txt_phone.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
                String RD = sdf.format(DateChooser_RD.getDate());
                pst.setString(5,RD);
                pst.setString(6, txt_R_time.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null,"Client Added");
            }//end of try
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }//end of catch
        }//end of if
        Client_Table();//call the method
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_femaleActionPerformed
        // TODO add your handling code here:
        //if female button is seleced  than the male button disable
        gender="Female";
        txt_female.setSelected(true);
        txt_male.setSelected(false);
    }//GEN-LAST:event_txt_femaleActionPerformed

    private void txt_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maleActionPerformed
        // TODO add your handling code here:
        //if male button is seleced  than the female button disable
        gender="Male";
        txt_male.setSelected(true);
        txt_female.setSelected(false);
    }//GEN-LAST:event_txt_maleActionPerformed

    private void tbl_ClientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ClientTableMouseClicked
              // TODO add your handling code here:
            try{
                //this is for selecting a row 
            int i = tbl_ClientTable.getSelectedRow();
            TableModel model = tbl_ClientTable.getModel();
            txt_id.setText(model.getValueAt(i, 0).toString());
            txt_firstname.setText(model.getValueAt(i, 1).toString());
            txt_lastname.setText(model.getValueAt(i, 2).toString());
            
            String gender = model.getValueAt(i, 3).toString();
            if(gender.equals("Male")){
                txt_male.setSelected(true);
            }//end of if
            else{
                txt_female.setSelected(true);
            }//end of else
            
            txt_phone.setText(model.getValueAt(i, 4).toString());
            txt_R_time.setText(model.getValueAt(i, 6).toString());
            
            int index = tbl_ClientTable.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(index, 5).toString());//converting data to string
            DateChooser_RD.setDate(date);
        }//end of try
            catch (Exception e) { 
        }//end of catch
    }//GEN-LAST:event_tbl_ClientTableMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try{
            //when a row is selectet than all the table info is are showed in to the filds
            int row = tbl_ClientTable.getSelectedRow();
            String update =(tbl_ClientTable.getModel().getValueAt(row, 0).toString());
            //update the values 
            String s ="UPDATE client_table SET Firstname=? , Lastname=? , Gender=? , Phone=? , Reservation_Date=? , Reservation_Time=? WHERE ID='"+update+"'";
            pst = con.prepareStatement(s);

            pst.setString(1, txt_firstname.getText());
            pst.setString(2, txt_lastname.getText());
            pst.setString(3, gender);
            pst.setString(4, txt_phone.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
            String RD = sdf.format(DateChooser_RD.getDate());
            pst.setString(5,RD);

            pst.setString(6, txt_R_time.getText());
            pst.executeUpdate();

            Client_Table();
            JOptionPane.showMessageDialog(null,"Client Updated");
            }//end of try
            catch(Exception e){ 
                JOptionPane.showMessageDialog(null, e);
          }//end of catch
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
        //sent you back to login page
        this.toBack();
        Login log = new Login();
        log.setVisible(true);
        log.toFront();
        this.dispose();
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void txt_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyPressed
        // TODO add your handling code here:
         String phone = txt_phone.getText();

        //check number from 0 to 9
        if(evt.getKeyChar()>= '0' && evt.getKeyChar()<='9'||evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE){
            
                txt_phone.setEditable(true);
            }//end of  if
            else{
                txt_phone.setEditable(false);
            }//end of  else

    }//GEN-LAST:event_txt_phoneKeyPressed

    private void txt_R_timeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_R_timeKeyPressed
   
        
    }//GEN-LAST:event_txt_R_timeKeyPressed

     //this method is for showing all the database into jtable 
    public void Client_Table(){
        try{
        String sql = "SELECT `ID`, `Firstname`, `Lastname`, `Gender`, `Phone`, `Reservation_Date`, `Reservation_Time` FROM `client_table`  ";
        pst = con.prepareStatement(sql);
         rs=pst.executeQuery();
        tbl_ClientTable.setModel(DbUtils.resultSetToTableModel(rs));
        }//end of try
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }//end pf catch  
    }//end of method
    
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
            java.util.logging.Logger.getLogger(ReceptionistPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser_RD;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ClientTable;
    private javax.swing.JTextField txt_R_time;
    private javax.swing.JRadioButton txt_female;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JRadioButton txt_male;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables

private String gender;
}
