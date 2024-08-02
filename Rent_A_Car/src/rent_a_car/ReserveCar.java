/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Charlie
 */
public class ReserveCar extends javax.swing.JFrame {
 Connection conn = new DBConnection().connect();
    /**
     * Creates new form ReserveCar
     */
    public ReserveCar() {
        initComponents();
        Show_Reserve_In_Table();
        Show_Cars_In_Table();
    }
    
    
    //Displaying The Data In The JTable
        // 1. - Fill the ArrayList With Data
    
    public ArrayList<Reserve> getReserveList()
    {
        
        ArrayList<Reserve> reserveList = new ArrayList<Reserve>();
        String sql = "SELECT * from reservation";
        
        Statement st;
        ResultSet rs;
        
        try{
        
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                Reserve reserve;
                
                while(rs.next()){
                    
                    reserve = new Reserve(rs.getInt("reserve_id"),rs.getString("brand_name"),rs.getString("pick_up_date"),rs.getInt("car_id"),rs.getInt("customer_id"));
                    reserveList.add(reserve);
                            
                }
                
           }
        
        catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error" + ex);
            
        }
        return reserveList;
        
        
        
    }
    
     // 2 - Populate The JTable
    
    public void Show_Reserve_In_Table()
    {
        ArrayList<Reserve> list = getReserveList();
        DefaultTableModel model = (DefaultTableModel)Reserve_JTable.getModel();
        
        //clear jtable
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getReserve_id();
            row[1] = list.get(i).getBrand_name();
            row[2] = list.get(i).getPick_up_date();
            row[3] = list.get(i).getCar_id();
            row[4] = list.get(i).getCustomer_id();
            
            
            model.addRow(row); 
        }
        
    }
    
    
    ///////////*******************************************//////////////////////////////////////////
    public ArrayList<Car> getCarList()
    {
        
        ArrayList<Car> carList = new ArrayList<Car>();
        String sql = "SELECT * from car";
        
        Statement st;
        ResultSet rs;
        
        try{
        
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                Car car;
                
                while(rs.next()){
                    
                    car = new Car(rs.getInt("car_id"),rs.getString("brand_name"),rs.getString("model"),rs.getInt("product_year"),rs.getInt("mileage"),rs.getString("color"));
                    carList.add(car);
                            
                }
                
           }
        
        catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error" + ex);
            
        }
        return carList;
        
        
        
    }
    // 2 - Populate The JTable
    
    public void Show_Cars_In_Table()
    {
        ArrayList<Car> list = getCarList();
        DefaultTableModel model = (DefaultTableModel)Car_JTable.getModel();
        
        //clear jtable
        model.setRowCount(0);
        
        Object[] row = new Object[6];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getCar_id();
            row[1] = list.get(i).getBrand_name();
            row[2] = list.get(i).getModel();
            row[3] = list.get(i).getProduct_year();
            row[4] = list.get(i).getMileage();
            row[5] = list.get(i).getColor();
            
            model.addRow(row); 
        }
        
    }
    
    
    public void ShowItem(int index)
    {
        txt_ReserveID.setText(Integer.toString(getReserveList().get(index).getReserve_id()));
        txt_CarBrandName.setText((getReserveList().get(index).getBrand_name()));
        txt_PickUpDate.setText((getReserveList().get(index).getPick_up_date()));
        txt_CarID.setText(Integer.toString(getReserveList().get(index).getCar_id()));
        txt_CustomerID.setText(Integer.toString(getReserveList().get(index).getCustomer_id()));
        
       
        
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ReserveID = new javax.swing.JTextField();
        txt_CarBrandName = new javax.swing.JTextField();
        txt_PickUpDate = new javax.swing.JTextField();
        txt_CarID = new javax.swing.JTextField();
        txt_CustomerID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reserve_JTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Car_JTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 205));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("RENT A CAR");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("RESERVE CAR DETAILS");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rent_a_car/Images/Untitled-1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(125, 125, 125))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setText("RESERVE ID");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("CAR BRAND NAME");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("PICK UP DATE");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("CAR ID");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("CUSTOMER ID");

        txt_ReserveID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_ReserveID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ReserveIDActionPerformed(evt);
            }
        });

        txt_CarBrandName.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txt_PickUpDate.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txt_CarID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txt_CustomerID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_CustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CustomerIDActionPerformed(evt);
            }
        });

        Reserve_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RESERVE ID", "CAR BRAND NAME", "PICK UP DATE", "CAR ID", "CUSTOMER ID"
            }
        ));
        Reserve_JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reserve_JTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Reserve_JTable);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("ADD RESERVATION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setText("UNDO RESERVATION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton4.setText("DELETE RESERVATION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton5.setText("EXIT");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Car_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BRAND NAME", "MODEL", "YEAR", "MILEAGE", "COLOR"
            }
        ));
        Car_JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Car_JTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Car_JTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CarBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ReserveID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_PickUpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CarID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_ReserveID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_CarBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_PickUpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txt_CarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ReserveIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ReserveIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ReserveIDActionPerformed

    private void Reserve_JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reserve_JTableMouseClicked

        int index = Reserve_JTable.getSelectedRow();
        ShowItem(index);

    }//GEN-LAST:event_Reserve_JTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //Inserting Data Into The Database

        String sql = "INSERT INTO reservation"
        + "(reserve_id,brand_name,pick_up_date,car_id,customer_id)"
        +"VALUES (?,?,?,?,?)";

        try{

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txt_ReserveID.getText());
            ps.setString(2, txt_CarBrandName.getText());
            ps.setString(3, txt_PickUpDate.getText());
            ps.setString(4, txt_CarID.getText());
            ps.setString(5, txt_CustomerID.getText());
           

            ps.executeUpdate();
            Show_Reserve_In_Table();

            JOptionPane.showMessageDialog(null, "Record was successfully added");

            txt_ReserveID.setText("");
            txt_CarBrandName.setText("");
            txt_PickUpDate.setText("");
            txt_CarID.setText("");
            txt_CustomerID.setText("");
            

            txt_ReserveID.requestFocus();

        }
        catch(SQLException exc){

            JOptionPane.showMessageDialog(null, exc);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String sql = "UPDATE reservation set brand_name=?,pick_up_date=?,car_id=?,customer_id=?where reserve_id=?";

        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(6, txt_ReserveID.getText());
            ps.setString(1, txt_CarBrandName.getText());
            ps.setString(2, txt_PickUpDate.getText());
            ps.setString(3, txt_CarID.getText());
            ps.setString(4, txt_CustomerID.getText());
            

            ps.executeUpdate();
            Show_Reserve_In_Table();

            JOptionPane.showMessageDialog(null, "Record Successfully Updated");

            txt_ReserveID.setText("");
            txt_CarBrandName.setText("");
            txt_PickUpDate.setText("");
            txt_CarID.setText("");
            txt_CustomerID.setText("");
          
            txt_ReserveID.requestFocus();

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!txt_ReserveID.getText().equals(""))
        {
            String sql = "delete from reservation where reserve_id = ?";
            try
            {
                PreparedStatement ps = conn.prepareStatement(sql);
                int customer_id = Integer.parseInt(txt_ReserveID.getText());
                ps.setInt(1, customer_id);

                ps.executeUpdate();
                Show_Reserve_In_Table();

                JOptionPane.showMessageDialog(null, "Record was successfully added");

                txt_ReserveID.setText("");
                txt_CarBrandName.setText("");
                txt_PickUpDate.setText("");
                txt_CarID.setText("");
                txt_CustomerID.setText("");
                

                txt_ReserveID.requestFocus();

            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Record Not Deleted");
            }

        }
        else {

            JOptionPane.showMessageDialog(null, "Enter The Right Car");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

        RentOutCarMenu newForm1 = new RentOutCarMenu();
        newForm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newForm1.setVisible(true);
        newForm1.pack();
        newForm1.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Car_JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Car_JTableMouseClicked

        int index = Car_JTable.getSelectedRow();
        ShowItem(index);

    }//GEN-LAST:event_Car_JTableMouseClicked

    private void txt_CustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CustomerIDActionPerformed

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
            java.util.logging.Logger.getLogger(ReserveCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReserveCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReserveCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReserveCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReserveCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Car_JTable;
    private javax.swing.JTable Reserve_JTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_CarBrandName;
    private javax.swing.JTextField txt_CarID;
    private javax.swing.JTextField txt_CustomerID;
    private javax.swing.JTextField txt_PickUpDate;
    private javax.swing.JTextField txt_ReserveID;
    // End of variables declaration//GEN-END:variables
}
