import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class PLAYER_SCREEN extends javax.swing.JFrame {
public static final String USERNAME= "root";
public static final String PASSWORD= "12345678";
public static final String CONN_STRING ="jdbc:mysql://localhost:3306/comp_ia?autoReconnect=true&useSSL=false";
public static Connection conn= null;
public static PreparedStatement pst =null;
public static ResultSet rs=null;

    /**
     * Creates new form PLAYER_SCREEN
     */
    public PLAYER_SCREEN() {
        initComponents();
    }    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("PlayNow");

        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("BORROW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton3.setText("EXIT  ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setText("LEARN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton4.setText("PLAY  ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new LOGIN_SCREEN().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 try{
        conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);              
    } catch (SQLException e){
                  }
new PLAY_SCREEN().setVisible(true);
String a=jLabel1.getText();
String parts[]=a.split(" ");
String PlayerName = (parts[1]);
PLAY_SCREEN.JT1.setText("Hello "+ parts[1] +" "+ parts[2]+" What sport would you like to play?");
dispose();
try{
String query3 ="Select SP1, SP2, SP3 from players where FIRSTNAME ='"+PlayerName+"'";
pst=conn.prepareStatement(query3); 
rs=pst.executeQuery();
if(rs.next())
{
String Sport1=rs.getString("SP1");
String Sport2=rs.getString("SP2");
String Sport3=rs.getString("SP3");

PLAY_SCREEN.jComboBox2.addItem(Sport1);
PLAY_SCREEN.jComboBox2.addItem(Sport2);
PLAY_SCREEN.jComboBox2.addItem(Sport3);
}
}catch(Exception e){
  JOptionPane.showMessageDialog(null,e);
                    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{
        conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);              
    } catch (SQLException e){
                  }
new COACH_SCREEN().setVisible(true);
String a=jLabel1.getText();
String parts[]=a.split(" ");
String PlayerName = (parts[1]);
COACH_SCREEN.JT2.setText("Hello "+ parts[1] +" "+ parts[2]+" What sport would you like to learn?");
dispose();
try{
String query3 ="Select SP1, SP2, SP3 from players where FIRSTNAME ='"+PlayerName+"'";
pst=conn.prepareStatement(query3); 
rs=pst.executeQuery();
if(rs.next())
{
String Sport1=rs.getString("SP1");
String Sport2=rs.getString("SP2");
String Sport3=rs.getString("SP3");

COACH_SCREEN.jComboBox2.addItem(Sport1);
COACH_SCREEN.jComboBox2.addItem(Sport2);
COACH_SCREEN.jComboBox2.addItem(Sport3);
}
}catch(Exception e){
  JOptionPane.showMessageDialog(null,e);
                    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{
    conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);              
    } catch (SQLException e){
                  }
new LEND_SCREEN().setVisible(true);
String a=jLabel1.getText();
String parts[]=a.split(" ");
String PlayerName = (parts[1]);
LEND_SCREEN.JT2.setText("Hello "+ parts[1] +" "+ parts[2]+" What would you like to borrow?");
dispose();
try{
String query3 ="Select SP1, SP2, SP3 from players where FIRSTNAME ='"+PlayerName+"'";
pst=conn.prepareStatement(query3); 
rs=pst.executeQuery();
if(rs.next())
{
String Sport1=rs.getString("SP1");
String Sport2=rs.getString("SP2");
String Sport3=rs.getString("SP3");

LEND_SCREEN.jComboBox2.addItem(Sport1);
LEND_SCREEN.jComboBox2.addItem(Sport2);
LEND_SCREEN.jComboBox2.addItem(Sport3);
}
}catch(Exception e){
  JOptionPane.showMessageDialog(null,e);
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

    /** 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_SCREEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
