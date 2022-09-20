
package electrronic_store;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class items extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs=null;
    Statement st = null;
    public items() {
        initComponents();
        displayitems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        userform = new javax.swing.JLabel();
        dashboardform = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        itnametb = new javax.swing.JTextField();
        itquntb = new javax.swing.JTextField();
        itpricetb = new javax.swing.JTextField();
        itcatcb = new javax.swing.JComboBox<>();
        itpicla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemstable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        itaddbtn = new javax.swing.JButton();
        iteditbtn = new javax.swing.JButton();
        picbrowsebtn = new javax.swing.JButton();
        itdeletebtn = new javax.swing.JButton();
        closebt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        userform.setBackground(new java.awt.Color(153, 153, 153));
        userform.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        userform.setText("User");
        userform.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userformMouseClicked(evt);
            }
        });

        dashboardform.setBackground(new java.awt.Color(255, 51, 0));
        dashboardform.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        dashboardform.setText("Dashboard");
        dashboardform.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardformMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 51, 0));
        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel3.setText("EStore");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(255, 51, 0));
        jLabel5.setFont(new java.awt.Font("Swis721 Ex BT", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("Items Management ");

        jLabel6.setBackground(new java.awt.Color(255, 102, 102));
        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        jLabel6.setText("Quntity");

        jLabel7.setBackground(new java.awt.Color(255, 102, 102));
        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        jLabel7.setText("Price");

        jLabel8.setBackground(new java.awt.Color(255, 102, 102));
        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        jLabel8.setText("Categories");

        jLabel9.setBackground(new java.awt.Color(255, 102, 102));
        jLabel9.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        jLabel9.setText("Name");

        jLabel10.setBackground(new java.awt.Color(255, 102, 102));
        jLabel10.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        jLabel10.setText("Photo");

        itcatcb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        itcatcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Micro-Controller", "Motors", "Devices", "ICS" }));

        itemstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Quntity", "Price", "Category", "Photo"
            }
        ));
        itemstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemstable);

        jLabel12.setBackground(new java.awt.Color(255, 51, 0));
        jLabel12.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        jLabel12.setText("Items Stock");

        itaddbtn.setBackground(new java.awt.Color(0, 51, 51));
        itaddbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        itaddbtn.setForeground(new java.awt.Color(255, 255, 255));
        itaddbtn.setText("Add");
        itaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itaddbtnActionPerformed(evt);
            }
        });

        iteditbtn.setBackground(new java.awt.Color(0, 51, 51));
        iteditbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        iteditbtn.setForeground(new java.awt.Color(255, 255, 255));
        iteditbtn.setText("Edit");
        iteditbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteditbtnActionPerformed(evt);
            }
        });

        picbrowsebtn.setBackground(new java.awt.Color(0, 51, 51));
        picbrowsebtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        picbrowsebtn.setForeground(new java.awt.Color(255, 255, 255));
        picbrowsebtn.setText("Browse");
        picbrowsebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picbrowsebtnActionPerformed(evt);
            }
        });

        itdeletebtn.setBackground(new java.awt.Color(0, 51, 51));
        itdeletebtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        itdeletebtn.setForeground(new java.awt.Color(255, 255, 255));
        itdeletebtn.setText("Delete");
        itdeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itdeletebtnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(itaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(iteditbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(itdeletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(itcatcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel7))
                                    .addGap(106, 106, 106)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(itquntb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(itnametb, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(itpricetb))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(itpicla, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jLabel12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(picbrowsebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closebt)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(closebt)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(itnametb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(itquntb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(itpricetb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(itcatcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(itpicla, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(picbrowsebtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itaddbtn)
                    .addComponent(iteditbtn)
                    .addComponent(itdeletebtn))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userform, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardform, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(107, 107, 107)
                .addComponent(userform)
                .addGap(70, 70, 70)
                .addComponent(dashboardform)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void clear()
    {
        itnametb.setText("");
        itquntb.setText("");
        itpricetb.setText("");
        itpicla.setIcon(null);
        
    }
    private void displayitems()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_store_db","root","Mahmod_012");
            st = con.createStatement();
            rs = st.executeQuery("select * from itemstb1");
            itemstable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private void itaddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itaddbtnActionPerformed
        if(itnametb.getText().isEmpty() || itquntb.getText().isEmpty() || itpricetb.getText().isEmpty() || itcatcb.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Missing information ");
        }
        else
        {
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_store_db","root","Mahmod_012");
                PreparedStatement Save = con.prepareStatement("insert into itemstb1(itname,itqty,itprice,itcat,itphoto) Values(?,?,?,?,?)");
              //  Save.setInt(1,1);
                Save.setString(1, itnametb.getText());
                Save.setInt(2, Integer.valueOf(itquntb.getText()));
                Save.setInt(3, Integer.valueOf(itpricetb.getText()));
                Save.setString(4, itcatcb.getSelectedItem().toString());
                InputStream img = new FileInputStream(imgpath); 
                Save.setBlob(5, img);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "item added successfully");
                con.close();
                displayitems();
                clear();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_itaddbtnActionPerformed
 public ImageIcon ResizePhoto (String Imagepath,byte [] pic)
 {
     ImageIcon MyImage = null;
     if(Imagepath!=null)
     {
         MyImage = new ImageIcon(Imagepath);
     }
     else
     {
         MyImage = new ImageIcon(pic);
     }
     Image img = MyImage.getImage();
     Image newImg = img.getScaledInstance(itpicla.getWidth(),itpicla.getHeight(), Image.SCALE_SMOOTH);
     ImageIcon image = new ImageIcon(newImg);
     return image ;
 }
    String imgpath ;
    private void picbrowsebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picbrowsebtnActionPerformed
       JFileChooser file = new JFileChooser();
       file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","jif","png");
        file.addChoosableFileFilter(filter);
        int res = file.showSaveDialog(file);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            File SelectedFile = file.getSelectedFile();
            String path = SelectedFile.getAbsolutePath();
            itpicla.setIcon(ResizePhoto(path,null));
            imgpath = path ;
        }
        else if(res == JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(this, "No pic selected");
        }
    }//GEN-LAST:event_picbrowsebtnActionPerformed

    private void getphoto()
    {
        String Query = "select itphoto from itemstb1 where itid="+key;
        Statement st;
        ResultSet rs;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_store_db","root","Mahmod_012");
            st = con.createStatement();
            rs = st.executeQuery(Query);
            if(rs.next())
            {
                itpicla.setIcon(ResizePhoto(null,rs.getBytes("itphoto") ));
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    int key =0;
    private void itemstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemstableMouseClicked
        DefaultTableModel model = (DefaultTableModel)itemstable.getModel();
        int myindex = itemstable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(myindex, 0).toString());
        itnametb.setText(model.getValueAt(myindex, 1).toString());
        itquntb.setText(model.getValueAt(myindex, 2).toString());
        itpricetb.setText(model.getValueAt(myindex, 3).toString());
        itcatcb.setSelectedItem(model.getValueAt(myindex, 4).toString());
        getphoto();
    }//GEN-LAST:event_itemstableMouseClicked

    private void itdeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itdeletebtnActionPerformed
        if(key ==0)
        {
            JOptionPane.showMessageDialog(this, "Select the item");
        }
        else
        {
            try 
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_store_db","root","Mahmod_012");
                String Query = "Delete from itemstb1 where itid = "+key;
                Statement del = con.createStatement();
                del.execute(Query);
                JOptionPane.showMessageDialog(this, "Item deleted");
                displayitems();
                clear();
            } 
            catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_itdeletebtnActionPerformed

    private void iteditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteditbtnActionPerformed
        if(imgpath!=null)
        {
            try {
                InputStream img = new FileInputStream(imgpath);
                String updatequery = "update itemstb1 set itname=? , itqty=? , itprice=? , itcat=?,itphoto=? where itid =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_store_db","root","Mahmod_012");
                PreparedStatement ps=con.prepareStatement(updatequery);
                ps.setString(1, itnametb.getText());
                ps.setInt(2, Integer.valueOf(itquntb.getText()));
                ps.setInt(3, Integer.valueOf(itpricetb.getText()));
                ps.setString(4, itcatcb.getSelectedItem().toString());
                ps.setBlob(5, img);
                ps.setInt(6,key);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this, "Data updated");
                    displayitems();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Missing data");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No photo selected");   
        }
        imgpath=null;
    }//GEN-LAST:event_iteditbtnActionPerformed

    private void closebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closebtActionPerformed

    private void userformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userformMouseClicked
        new users().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userformMouseClicked

    private void dashboardformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardformMouseClicked
        new dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardformMouseClicked

   
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
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebt;
    private javax.swing.JLabel dashboardform;
    private javax.swing.JButton itaddbtn;
    private javax.swing.JComboBox<String> itcatcb;
    private javax.swing.JButton itdeletebtn;
    private javax.swing.JButton iteditbtn;
    private javax.swing.JTable itemstable;
    private javax.swing.JTextField itnametb;
    private javax.swing.JLabel itpicla;
    private javax.swing.JTextField itpricetb;
    private javax.swing.JTextField itquntb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton picbrowsebtn;
    private javax.swing.JLabel userform;
    // End of variables declaration//GEN-END:variables

    private Icon ResizePhoto(String path, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
