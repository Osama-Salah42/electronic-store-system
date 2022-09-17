
package electrronic_store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class selling extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs=null;
    Statement st = null;

    public selling() {
        initComponents();
        displayitems();
        showdate();
    }
    int userid;
    public selling (String s,int uid)
    {
        initComponents();
        Unamelb.setText(s);
        userid=uid;
        displayitems();
        showdate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Unamelb = new javax.swing.JLabel();
        itnametb = new javax.swing.JTextField();
        itquntb = new javax.swing.JTextField();
        itpricetb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemstable = new javax.swing.JTable();
        totallb = new javax.swing.JLabel();
        itaddbtn = new javax.swing.JButton();
        printbill = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        closebt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        billtext = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        todaydate1 = new javax.swing.JLabel();
        loginform = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        jLabel3.setBackground(new java.awt.Color(255, 51, 0));
        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel3.setText("EStore");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 102, 102));
        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        jLabel6.setText("Quntity");

        Unamelb.setBackground(new java.awt.Color(255, 102, 102));
        Unamelb.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        Unamelb.setText("Uname");

        itemstable.setModel(new javax.swing.table.DefaultTableModel(
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
        itemstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemstable);

        totallb.setBackground(new java.awt.Color(255, 51, 0));
        totallb.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 36)); // NOI18N
        totallb.setForeground(new java.awt.Color(153, 0, 51));
        totallb.setText("Billing");

        itaddbtn.setBackground(new java.awt.Color(0, 51, 51));
        itaddbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        itaddbtn.setForeground(new java.awt.Color(255, 255, 255));
        itaddbtn.setText("Add to Bill");
        itaddbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itaddbtnMouseClicked(evt);
            }
        });
        itaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itaddbtnActionPerformed(evt);
            }
        });

        printbill.setBackground(new java.awt.Color(0, 51, 51));
        printbill.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        printbill.setForeground(new java.awt.Color(255, 255, 255));
        printbill.setText("Print");
        printbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbillActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(0, 51, 51));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        closebt.setBackground(new java.awt.Color(204, 0, 51));
        closebt.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        closebt.setForeground(new java.awt.Color(255, 255, 255));
        closebt.setText("X");
        closebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtActionPerformed(evt);
            }
        });

        billtext.setColumns(20);
        billtext.setRows(5);
        jScrollPane2.setViewportView(billtext);

        jLabel8.setBackground(new java.awt.Color(255, 102, 102));
        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        jLabel8.setText("Price");

        jLabel13.setBackground(new java.awt.Color(255, 51, 0));
        jLabel13.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setText("Items Stock");

        jLabel14.setBackground(new java.awt.Color(255, 51, 0));
        jLabel14.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("Bill");

        jLabel15.setBackground(new java.awt.Color(255, 51, 0));
        jLabel15.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 51));
        jLabel15.setText("Billing");

        jLabel10.setBackground(new java.awt.Color(255, 102, 102));
        jLabel10.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        jLabel10.setText("Name");

        todaydate1.setBackground(new java.awt.Color(255, 102, 102));
        todaydate1.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        todaydate1.setText("Date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(printbill, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(130, 130, 130)
                                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(totallb)
                                    .addGap(154, 154, 154)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itquntb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(itnametb, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(itpricetb)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Unamelb)
                        .addGap(359, 359, 359)
                        .addComponent(closebt)
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(398, 398, 398))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel8)
                    .addContainerGap(1060, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel15)
                    .addContainerGap(1046, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel10)
                    .addContainerGap(1068, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(todaydate1)
                    .addContainerGap(879, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(itnametb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(itquntb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(itpricetb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(itaddbtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closebt)
                            .addComponent(Unamelb))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(totallb)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(printbill)
                            .addComponent(clearbtn)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(jLabel8)
                    .addContainerGap(555, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jLabel15)
                    .addContainerGap(841, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(jLabel10)
                    .addContainerGap(746, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(todaydate1)
                    .addContainerGap(883, Short.MAX_VALUE)))
        );

        loginform.setBackground(new java.awt.Color(255, 51, 0));
        loginform.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        loginform.setText("Logout");
        loginform.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginformMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginform, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(233, 233, 233)
                .addComponent(loginform)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayitems()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_store_db","root","Mahmod_012");
            st = con.createStatement();
            rs = st.executeQuery("select itid,itname,itqty,itprice from itemstb1");
            itemstable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    int key =0;
    int availqty;
    int i=0;
    double uprice , prodtot=0,grdtotal=0;
    private void itemstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemstableMouseClicked
        DefaultTableModel model = (DefaultTableModel)itemstable.getModel();
        int myindex = itemstable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(myindex, 0).toString());
        itnametb.setText(model.getValueAt(myindex, 1).toString());
        availqty=Integer.valueOf(model.getValueAt(myindex, 2).toString());
        itpricetb.setText(model.getValueAt(myindex, 3).toString());
        
    }//GEN-LAST:event_itemstableMouseClicked

    private void itaddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itaddbtnActionPerformed
      if(itquntb.getText().isEmpty()||itpricetb.getText().isEmpty()||itnametb.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(this, "Missing DAta");
      }
      else if(availqty<Integer.valueOf(itquntb.getText()))
      {
          JOptionPane.showMessageDialog(this, "Not Enough In Stock");
      }
      else
      {
          try {
              i++;
          grdtotal= grdtotal+(Double.valueOf(itpricetb.getText()) * Double.valueOf(itquntb.getText()));
          if(i==1)
          {
              billtext.setText(billtext.getText()+"       ############## Electronic Shop ##############\n"+"  ID      PRODUCT      QUNTITY     PRICE    TOTAL\n" 
                      +i+"        "+itnametb.getText()+"          "+itquntb.getText()+"            "+itpricetb.getText()+"             "+Integer.valueOf(itquntb.getText())*Integer.valueOf(itpricetb.getText())+"\n");                                                                           
          }
          else
          {
              billtext.setText(billtext.getText()+i+"      "+itnametb.getText()+"           "+itquntb.getText()+"          "+itpricetb.getText()+"        "+Integer.valueOf(itquntb.getText())*Integer.valueOf(itpricetb.getText())+"\n");
          }
          totallb.setText(grdtotal+" LE");
          updateqty();
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(this, ex);
          }
          
      }
    }//GEN-LAST:event_itaddbtnActionPerformed

    private void updateqty()
    {
        
        
        try {
                int newqty = availqty-Integer.valueOf(itquntb.getText());
                String updatequery = "update itemstb1 set itqty=? where itid =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_store_db","root","Mahmod_012");
                PreparedStatement ps=con.prepareStatement(updatequery);
                ps.setInt(1, newqty);
                ps.setInt(2, key);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this, "Item added");
                    displayitems();
                   // clear();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        
    }
    private void insertbill()
    {
        try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_store_db","root","Mahmod_012");
                PreparedStatement Save = con.prepareStatement("insert into sellstb1(Sid,Sname,Bdata,Bamt) Values(?,?,?,?)");
              //  Save.setInt(1,1);
                Save.setInt(1, userid);
                Save.setString(2, Unamelb.getText());
                Save.setString(3,Unamelb.getText());
                Save.setDouble(4, grdtotal);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Bill added successfully");
                con.close();
               // displayitems();
                clear();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex);
            }
    }
    private void printbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbillActionPerformed
        try {
            billtext.print();
            insertbill();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_printbillActionPerformed

    private void showdate()
    {
        Date d =new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        Unamelb.setText(s.format(d));
    }
    private void clear()
    {
        billtext.setText("");
        itnametb.setText("");
        itquntb.setText("");
        itpricetb.setText("");
        i=0;
        totallb.setText("");
    }
    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        clear();
    }//GEN-LAST:event_clearbtnActionPerformed

    private void closebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closebtActionPerformed

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearbtnMouseClicked

    private void itaddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itaddbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_itaddbtnMouseClicked

    private void loginformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginformMouseClicked
        new log_in_form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginformMouseClicked

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
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Unamelb;
    private javax.swing.JTextArea billtext;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton closebt;
    private javax.swing.JButton itaddbtn;
    private javax.swing.JTable itemstable;
    private javax.swing.JTextField itnametb;
    private javax.swing.JTextField itpricetb;
    private javax.swing.JTextField itquntb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loginform;
    private javax.swing.JButton printbill;
    private javax.swing.JLabel todaydate1;
    private javax.swing.JLabel totallb;
    // End of variables declaration//GEN-END:variables
}
