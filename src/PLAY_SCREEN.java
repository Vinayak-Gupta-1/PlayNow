
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class PLAY_SCREEN extends javax.swing.JFrame 
{public static final String USERNAME= "root";
public static final String PASSWORD= "12345678";
public static final String CONN_STRING ="jdbc:mysql://localhost:3306/comp_ia?autoReconnect=true&useSSL=false";
public static Connection conn= null;
public static PreparedStatement pst =null;
public static ResultSet rs=null;

    
    public PLAY_SCREEN() {
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        JT1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("PlayNow");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE SPORT" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton3.setText("PLAY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE A SLOT", "6-7", "7-8", "8-9", "9-10", "10-11", "11-12", "12-13", "14-15", "15-16", "16-17", "17-18", "18-19", "19-20", "20-21", "21-22" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING "
            }
        ));
        jScrollPane1.setViewportView(Table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))))
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
new FIND_PLAYER_SCREEN().setVisible(true); 
dispose();
try{
String d=JT1.getText();
String parts[]=d.split(" ");
String query4="Select FIRSTNAME, AGE, GENDER, RATING from players where SP1='"+a+"' AND FIRSTNAME!='"+parts[1]+"' OR SP2='"+a+"' AND FIRSTNAME!='"+parts[1]+"' OR SP3='"+a+"' AND FIRSTNAME!='"+parts[1]+"'" ;
pst=conn.prepareStatement(query4); 
rs=pst.executeQuery();
{
FIND_PLAYER_SCREEN.jTable3.setModel(DbUtils.resultSetToTableModel(rs));
FIND_PLAYER_SCREEN.jLabel1.setText("Hello "+parts[1]+ " , Please click on who you would like to play "+a.toLowerCase()+" with at "+b);
   } 


   }
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
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new PLAYER_SCREEN().setVisible(true); 
   dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

public static void main(String args[]) {


             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PLAY_SCREEN().setVisible(true);
            }
        });
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel JT1;
    private javax.swing.JTable Table1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
