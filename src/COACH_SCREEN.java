
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class COACH_SCREEN extends javax.swing.JFrame {
public static final String USERNAME= "root";
public static final String PASSWORD= "12345678";
public static final String CONN_STRING ="jdbc:mysql://localhost:3306/comp_ia?autoReconnect=true&useSSL=false";
public static Connection conn= null;
public static PreparedStatement pst =null;
public static ResultSet rs=null;

    public COACH_SCREEN() {
        initComponents();
    }
    public static void MySQL()
{
    try{
      conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);              
    } catch (SQLException e){
                  }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JT1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        JT2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("PlayNow");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE SPORT" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE A SLOT", "6-7", "7-8", "8-9", "9-10", "10-11", "11-12", "12-13", "14-15", "15-16", "16-17", "17-18", "18-19", "19-20", "20-21", "21-22" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton4.setText("LEARN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        jButton5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
MySQL();
Object Sport=jComboBox2.getSelectedItem();
String Sport1=Sport.toString();
if (Sport1.equals("BADMINTON"))
{
 add("Badminton");
}
else if (Sport1.equals("SQUASH"))
{
  add("Squash");
}
else if (Sport1.equals("FOOTBALL"))
{
  add("Football");
}
else if (Sport1.equals("BASKETBALL"))
{
  add("Basketball");
}
else if (Sport1.equals("SWIMMING"))
{
  add("Swimming");
}
else if (Sport1.equals("TENNIS"))
{
  add("Tennis");
}
else if (Sport1.equals("TABLE TENNIS"))
{
add("Table_Tennis");
}
else
{
    JOptionPane.showMessageDialog(null,"Invalid entry");
}

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void add(String c)
    {
    try{
String query3 ="Select BOOKING from " +c;
pst=conn.prepareStatement(query3); 
rs=pst.executeQuery();
Table1.setModel(DbUtils.resultSetToTableModel(rs));
}
catch (Exception e)
{
}
    }private void Booking(String c)
    {
    try{
String query3 ="Select BOOKING from " +c;
pst=conn.prepareStatement(query3); 
rs=pst.executeQuery();
Table1.setModel(DbUtils.resultSetToTableModel(rs));
}
catch (Exception e)
{
}
    }
    
    private void sport(String a, String b)
{
    try{
String query2="Select SPORT from "+a+" where BOOKING='"+b+"'";
pst=conn.prepareStatement(query2); 
rs=pst.executeQuery();
if(rs.next()) 
{
    JOptionPane.showMessageDialog(null,"Slot already booked");
}  
else
{  try{
   String query =("insert into "+a+" values(?,?)");
   pst=conn.prepareStatement(query); 
   pst.setString(1, a);
   pst.setString(2, b);
   int i=pst.executeUpdate();
   if(i>0)
   {
JOptionPane.showMessageDialog(null,"Booking made successfully");
try{
String query3 ="Select BOOKING from "+a;
pst=conn.prepareStatement(query3); 
rs=pst.executeQuery();
Table1.setModel(DbUtils.resultSetToTableModel(rs));
}
catch (Exception e)
{
}
new FIND_COACH_SCREEN().setVisible(true);
dispose();
try{
String query4="Select NAME, AGE, FEE, RATING from coaches where SPORT='"+a+"'";
String d=JT2.getText();
String parts[]=d.split(" ");
pst=conn.prepareStatement(query4); 
rs=pst.executeQuery();
{
FIND_COACH_SCREEN.jTable3.setModel(DbUtils.resultSetToTableModel(rs));
FIND_COACH_SCREEN.jLabel1.setText("Hello "+parts[1]+ " , Please click on who you would like to learn "+a.toLowerCase()+" from at "+b);
   }    }
   catch(Exception e)
{
    }
   
  }
   else{
     JOptionPane.showMessageDialog(null,"Booking not made successfully");
   }
}
catch(Exception E)
{
}    
        }
}
catch(Exception e)
{
    
}
    
    
}
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object Sport=jComboBox2.getSelectedItem();
        String Sport1=Sport.toString();
        Object Slot=jComboBox3.getSelectedItem();
        String Slot1=Slot.toString();
        if (Slot1.equals("CHOOSE A SLOT"))
        { JOptionPane.showMessageDialog(null,"Please choose a valid time slot.");
        }
        else{
            if (Sport1.equals("BADMINTON"))
            {
                sport(Sport1,Slot1);
            }
            else if (Sport1.equals("SQUASH"))
            {
                sport(Sport1,Slot1);
            }
            else if (Sport1.equals("BASKETBALL"))
            {
                sport(Sport1,Slot1);
            }
            else if (Sport1.equals("FOOTBALL"))
            {
                sport(Sport1,Slot1);
            }
            else if (Sport1.equals("SWIMMING"))
            {
                sport(Sport1,Slot1);
            }
            else if (Sport1.equals("TENNIS"))
            {
                sport(Sport1,Slot1);
            }
            else if (Sport1.equals("TABLE TENNIS"))
            {
                sport("Table_Tennis",Slot1);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new PLAYER_SCREEN().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(COACH_SCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COACH_SCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COACH_SCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COACH_SCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COACH_SCREEN().setVisible(true);
                   }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel JT1;
    public static javax.swing.JLabel JT2;
    private javax.swing.JTable Table1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
