/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.sql.CallableStatement;
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
public class RentOutCar extends javax.swing.JFrame {
    Connection conn = new DBConnection().connect();
    /**
     * Creates new form R//Displaying The Data In The JTable
        // 1. - Fill the ArrayList With Data
    
    public ArrayList<Rental> getRentalList()
    {
        
        ArrayList<Rental> rentalList = new ArrayList<Rental>();
        String sql = "SELECT * from rental";
        
        Statement st;
        ResultSet rs;
        
        try{
        
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                Rental rental;
                
                while(rs.next()){
                    
                    rental = new Rental(rs.getInt("rental_id"),rs.getString("start_date"),rs.getString("end_date"),rs.getInt("payment"),rs.getString("remarks"),rs.getInt("customer_id"),rs.getInt("car_id"),rs.getInt("employee_id"));
                    rentalList.add(rental);
                            
                }
                
           }
        
        catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error" + ex);
            
        }
        return rentalList;
        
        
        
    }
    
     // 2 - Populate The JTable
    
    public void Show_Rentals_In_Table()
    {
        ArrayList<Rental> list = getRentalList();
        DefaultTableModel model = (DefaultTableModel)Rental_JTable.getModel();
        
        //clear jtable
        model.setRowCount(0);
        
        Object[] row = new Object[8];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getRental_id();
            row[1] = list.get(i).getStart_date();
            row[2] = list.get(i).getEnd_date();
            row[3] = list.get(i).getPayment();
            row[4] = list.get(i).getRemarks();
            row[5] = list.get(i).getCustomer_id();
            row[6] = list.get(i).getCar_id();
            row[7] = list.get(i).getEmployee_id();
            
            
            model.addRow(row); 
        }
        
    }entOutCar
     */
    public RentOutCar() {
        initComponents();
        Show_Rentals_In_Table();
        Show_Customers_In_Table();
    }
    
    
     //Displaying The Data In The JTable
        // 1. - Fill the ArrayList With Data
    
    public ArrayList<Rental> getRentalList()
    {
        
        ArrayList<Rental> rentalList = new ArrayList<Rental>();
        String sql = "SELECT * from rental";
        
        Statement st;
        ResultSet rs;
        
        try{
        
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                Rental rental;
                
                while(rs.next()){
                    
                    rental = new Rental(rs.getInt("rental_id"),rs.getString("start_date"),rs.getString("end_date"),rs.getInt("payment"),rs.getString("remarks"),rs.getInt("customer_id"),rs.getInt("car_id"),rs.getInt("employee_id"));
                    rentalList.add(rental);
                            
                }
                
           }
        
        catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error" + ex);
            
        }
        return rentalList;
        
        
        
    }
    
     // 2 - Populate The JTable
    
    public void Show_Rentals_In_Table()
    {
        ArrayList<Rental> list = getRentalList();
        DefaultTableModel model = (DefaultTableModel)Rental_JTable.getModel();
        
        //clear jtable
        model.setRowCount(0);
        
        Object[] row = new Object[8];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getRental_id();
            row[1] = list.get(i).getStart_date();
            row[2] = list.get(i).getEnd_date();
            row[3] = list.get(i).getPayment();
            row[4] = list.get(i).getRemarks();
            row[5] = list.get(i).getCustomer_id();
            row[6] = list.get(i).getCar_id();
            row[7] = list.get(i).getEmployee_id();
            
            
            model.addRow(row); 
        }
        
    }
    
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
    
    public void Show_Customers_In_Table()
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
        txt_RentalID.setText(Integer.toString(getRentalList().get(index).getRental_id()));
        txt_StartDate.setText((getRentalList().get(index).getStart_date()));
        txt_EndDate.setText((getRentalList().get(index).getEnd_date()));
        txt_Payment.setText(Integer.toString(getRentalList().get(index).getPayment()));
        txt_Remarks.setText((getRentalList().get(index).getRemarks()));
        txt_CustomerID.setText(Integer.toString(getRentalList().get(index).getPayment()));
        txt_CarID.setText(Integer.toString(getRentalList().get(index).getPayment()));
        txt_EmployeeID.setText(Integer.toString(getRentalList().get(index).getPayment()));
        
       
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_RentalID = new javax.swing.JTextField();
        txt_Payment = new javax.swing.JTextField();
        txt_Remarks = new javax.swing.JTextField();
        txt_CustomerID = new javax.swing.JTextField();
        txt_CarID = new javax.swing.JTextField();
        txt_EmployeeID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Rental_JTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Car_JTable = new javax.swing.JTable();
        txt_EndDate = new javax.swing.JTextField();
        txt_StartDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 205));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("RENT A CAR");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("RENT OUT CAR");

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setText("RENTAL ID");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("START DATE");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("END DATE");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("REMAKRS");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("CAR ID");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setText("PAYMENT");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setText("CUSTOMER ID");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setText("EMPLOYEE ID");

        txt_RentalID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_RentalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RentalIDActionPerformed(evt);
            }
        });

        txt_Payment.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PaymentActionPerformed(evt);
            }
        });

        txt_Remarks.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_Remarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RemarksActionPerformed(evt);
            }
        });

        txt_CustomerID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_CustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CustomerIDActionPerformed(evt);
            }
        });

        txt_CarID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_CarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CarIDActionPerformed(evt);
            }
        });

        txt_EmployeeID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_EmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmployeeIDActionPerformed(evt);
            }
        });

        Rental_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rental ID", "Start Date", "End Date", "Payment", "Remarks", "Customer ID", "Car", "Employee ID"
            }
        ));
        Rental_JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rental_JTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Rental_JTable);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("ADD RENTAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setText("EDIT RENTAL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton4.setText("DELETE RENTAL");
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

        txt_EndDate.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_EndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EndDateActionPerformed(evt);
            }
        });

        txt_StartDate.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_StartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_StartDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_EmployeeID, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txt_CarID, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txt_CustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txt_Remarks, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txt_Payment, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txt_RentalID, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txt_EndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txt_StartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton2)
                        .addGap(44, 44, 44)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(61, 61, 61)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_RentalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Remarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_CarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_RentalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RentalIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RentalIDActionPerformed

    private void txt_PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PaymentActionPerformed

    private void txt_RemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RemarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RemarksActionPerformed

    private void txt_CustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CustomerIDActionPerformed

    private void txt_CarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CarIDActionPerformed

    private void txt_EmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmployeeIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //Inserting Data Into The Database

        String sql = "INSERT INTO rental"
        + "(rental_id,start_date,end_date,payment,remarks,customer_id,car_id,employee_id)"
        +"VALUES (?,?,?,?,?,?,?,?)";

        try{

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txt_RentalID.getText());
            
            
            ps.setString(2, txt_StartDate.getText());
            
           
            ps.setString(3, txt_EndDate.getText());
            
            ps.setString(4, txt_Payment.getText());
            ps.setString(5, txt_Remarks.getText());
            ps.setString(6, txt_CustomerID.getText());
            ps.setString(7, txt_CarID.getText());
            ps.setString(8, txt_EmployeeID.getText());

            ps.executeUpdate();
            Show_Rentals_In_Table();
            
       /*     CallableStatement cs;
            try{
                
                cs = conn.prepareCall("{ call GetCustomerByAddress(?)}");
                cs.getString("" )
                
            }*/

            JOptionPane.showMessageDialog(null, "Record was successfully added");

            txt_RentalID.setText("");
            txt_StartDate.setText("");
            txt_EndDate.setText("");
            txt_Payment.setText("");
            txt_Remarks.setText("");
            txt_CustomerID.setText("");
            txt_CarID.setText("");
            txt_EmployeeID.setText("");

            txt_RentalID.requestFocus();

        }
        catch(SQLException exc){

            JOptionPane.showMessageDialog(null, exc);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String sql = "UPDATE rental set start_date=?,end_date=?,payment=?,remarks=?,customer_id=?,car_id=?,employee_id=?where rental_id=?";

        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(8, txt_RentalID.getText());
            ps.setString(1, txt_StartDate.getText());
            ps.setString(2, txt_EndDate.getText());
            ps.setString(3, txt_Payment.getText());
            ps.setString(4, txt_Remarks.getText());
            ps.setString(5, txt_CustomerID.getText());
            ps.setString(6, txt_CarID.getText());
            ps.setString(7, txt_EmployeeID.getText());

            ps.executeUpdate();
            Show_Rentals_In_Table();

            JOptionPane.showMessageDialog(null, "Record Successfully Updated");

            txt_RentalID.setText("");
            txt_StartDate.setText("");
            txt_EndDate.setText("");
            txt_Payment.setText("");
            txt_Remarks.setText("");
            txt_CustomerID.setText("");
            txt_CarID.setText("");
            txt_EmployeeID.setText("");

            txt_RentalID.requestFocus();

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!txt_CarID.getText().equals(""))
        {
            String sql = "delete from rental where rental_id = ?";
            try
            {
                PreparedStatement ps = conn.prepareStatement(sql);
                int customer_id = Integer.parseInt(txt_RentalID.getText());
                ps.setInt(1, customer_id);

                ps.executeUpdate();
                Show_Rentals_In_Table();

                JOptionPane.showMessageDialog(null, "Record was successfully added");

            txt_RentalID.setText("");
            txt_StartDate.setText("");
            txt_EndDate.setText("");
            txt_Payment.setText("");
            txt_Remarks.setText("");
            txt_CustomerID.setText("");
            txt_CarID.setText("");
            txt_EmployeeID.setText("");

            txt_RentalID.requestFocus();

            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Record Not Deleted");
            }

        }
        else {

            JOptionPane.showMessageDialog(null, "Enter The Right Product");

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

    private void txt_EndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EndDateActionPerformed

    private void txt_StartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_StartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_StartDateActionPerformed

    private void Rental_JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rental_JTableMouseClicked
        int index = Rental_JTable.getSelectedRow();
        ShowItem(index);
    }//GEN-LAST:event_Rental_JTableMouseClicked

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
            java.util.logging.Logger.getLogger(RentOutCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentOutCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentOutCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentOutCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentOutCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Car_JTable;
    private javax.swing.JTable Rental_JTable;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_CarID;
    private javax.swing.JTextField txt_CustomerID;
    private javax.swing.JTextField txt_EmployeeID;
    private javax.swing.JTextField txt_EndDate;
    private javax.swing.JTextField txt_Payment;
    private javax.swing.JTextField txt_Remarks;
    private javax.swing.JTextField txt_RentalID;
    private javax.swing.JTextField txt_StartDate;
    // End of variables declaration//GEN-END:variables
}
