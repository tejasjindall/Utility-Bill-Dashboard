import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class water_billshow extends JFrame implements ActionListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;

int count=0;

TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
Button b2,b3;
 

 
GridBagLayout grid;
GridBagConstraints cg;
Container c=getContentPane();

public water_billshow()
{
l1=new Label("Enter Flat Number");
l2=new Label("Name");
l3=new Label("Location");
l4=new Label("Enter meter Number");
l5=new Label("Bill From");
l6=new Label("Bill to");
l7=new Label("Issue Date");
l8=new Label("Pay date");
l9=new Label("Previous Reading");
l10=new Label("Current Reading");
l11=new Label("Meter Rent");
l12=new Label("Others");
l13=new Label("    ");
l14=new Label("    ");
l15=new Label("    ");
l16=new Label("    ");
l17=new Label("    ");
l18=new Label("    ");
l19=new Label("    ");
l20=new Label("    ");
l21=new Label("Unit Consumed");
l22=new Label("Total Bill");
l23=new Label("    ");
l24=new Label("    ");

t1=new TextField(30);
t2=new TextField(30);
t3=new TextField(30);
t4=new TextField(30);
t5=new TextField(30);
t6=new TextField(30);
t7=new TextField(30);
t8=new TextField(30);
t9=new TextField(30);
t10=new TextField(30);
t11=new TextField(30);
t12=new TextField(30);
t13=new TextField(30);
t14=new TextField(30);

b2=new Button("Reset");
b3=new Button("Search");

grid=new GridBagLayout();
cg=new GridBagConstraints();
c.setLayout(grid);

t2.setEditable(false);
t3.setEditable(false);

cg.gridx=0;
cg.gridy=0;
grid.setConstraints(l1,cg);
c.add(l1);

cg.gridx=1;
cg.gridy=0;
grid.setConstraints(t1,cg);
c.add(t1);

cg.gridx=2;
cg.gridy=0;
grid.setConstraints(b3,cg);
c.add(b3);


cg.gridx=0;
cg.gridy=1;
grid.setConstraints(l13,cg);
c.add(l13);

cg.gridx=0;
cg.gridy=2;
grid.setConstraints(l2,cg);
c.add(l2);

cg.gridx=1;
cg.gridy=2;
grid.setConstraints(t2,cg);
c.add(t2);

cg.gridx=0;
cg.gridy=3;
grid.setConstraints(l14,cg);
c.add(l14);

cg.gridx=0;
cg.gridy=4;
grid.setConstraints(l3,cg);
c.add(l3);

cg.gridx=1;
cg.gridy=4;
grid.setConstraints(t3,cg);
c.add(t3);

cg.gridx=0;
cg.gridy=5;
grid.setConstraints(l15,cg);
c.add(l15);

cg.gridx=0;
cg.gridy=6;
grid.setConstraints(l4,cg);
c.add(l4);

cg.gridx=1;
cg.gridy=6;
grid.setConstraints(t4,cg);
c.add(t4);


cg.gridx=0;
cg.gridy=7;
grid.setConstraints(l16,cg);
c.add(l16);

cg.gridx=0;
cg.gridy=8;
grid.setConstraints(l5,cg);
c.add(l5);

cg.gridx=1;
cg.gridy=8;
grid.setConstraints(t5,cg);
c.add(t5);

cg.gridx=2;
cg.gridy=8;
grid.setConstraints(l6,cg);
c.add(l6);

cg.gridx=3;
cg.gridy=8;
grid.setConstraints(t6,cg);
c.add(t6);

cg.gridx=0;
cg.gridy=9;
grid.setConstraints(l17,cg);
c.add(l17);

cg.gridx=0;
cg.gridy=10;
grid.setConstraints(l7,cg);
c.add(l7);

cg.gridx=1;
cg.gridy=10;
grid.setConstraints(t7,cg);
c.add(t7);

cg.gridx=2;
cg.gridy=10;
grid.setConstraints(l8,cg);
c.add(l8);

cg.gridx=3;
cg.gridy=10;
grid.setConstraints(t8,cg);
c.add(t8);

cg.gridx=0;
cg.gridy=11;
grid.setConstraints(l18,cg);
c.add(l18);


cg.gridx=0;
cg.gridy=12;
grid.setConstraints(l9,cg);
c.add(l9);

cg.gridx=1;
cg.gridy=12;
grid.setConstraints(t9,cg);
c.add(t9);

cg.gridx=2;
cg.gridy=12;
grid.setConstraints(l10,cg);
c.add(l10);


cg.gridx=3;
cg.gridy=12;
grid.setConstraints(t10,cg);
c.add(t10);

cg.gridx=0;
cg.gridy=13;
grid.setConstraints(l19,cg);
c.add(l19);


cg.gridx=0;
cg.gridy=14;
grid.setConstraints(l11,cg);
c.add(l11);

cg.gridx=1;
cg.gridy=14;
grid.setConstraints(t11,cg);
c.add(t11);

cg.gridx=2;
cg.gridy=14;
grid.setConstraints(l12,cg);
c.add(l12);

cg.gridx=3;
cg.gridy=14;
grid.setConstraints(t12,cg);
c.add(t12);

cg.gridx=0;
cg.gridy=15;
grid.setConstraints(l20,cg);
c.add(l20);

cg.gridx=0;
cg.gridy=19;
grid.setConstraints(l24,cg);
c.add(l24);


cg.gridx=2;
cg.gridy=20;
grid.setConstraints(b2,cg);
c.add(b2);

cg.gridx=0;
cg.gridy=17;
grid.setConstraints(l23,cg);
c.add(l23);

cg.gridx=0;
cg.gridy=18;
grid.setConstraints(l21,cg);
c.add(l21);

cg.gridx=1;
cg.gridy=18;
grid.setConstraints(t13,cg);
c.add(t13);

cg.gridx=2;
cg.gridy=18;
grid.setConstraints(l22,cg);
c.add(l22);

cg.gridx=3;
cg.gridy=18;
grid.setConstraints(t14,cg);
c.add(t14);

b2.addActionListener(this);
b3.addActionListener(this);

setTitle("ELECTRICITY BILL");
setBounds(0,0,1200,900);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
String msg=e.getActionCommand();
JOptionPane jp=new JOptionPane();
if(msg.equals("Reset"))
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
t11.setText("");
t12.setText("");
t13.setText("");
t14.setText("");
count=0;
}
else if(msg.equals("Search"))
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:bill_project");
Statement s11=con.createStatement();
count=0;
ResultSet rs;
rs=s11.executeQuery("select * from water where flat_no=" + Integer.parseInt(t1.getText()));
while(rs.next())
{
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));
t5.setText(rs.getString(5));
t6.setText(rs.getString(6));
t7.setText(rs.getString(7));
t8.setText(rs.getString(8));
t9.setText(rs.getString(9));
t10.setText(rs.getString(10));
t11.setText(rs.getString(11));
t12.setText(rs.getString(12));
t13.setText(rs.getString(13));
t14.setText(rs.getString(14));
count++;
break;
}
if(count==0)
{
jp.showMessageDialog(this,"Sorry Flat No. is Not Available");
}
else
{
Statement st1=con.createStatement();
int count1=0;
ResultSet rs1;
rs1=st1.executeQuery("select * from water where flat_no=" + Integer.parseInt(t1.getText()));
while(rs1.next())
{
count1=1;
break;
}
if(count1==1)
{
jp.showMessageDialog(this,"Your Bill Is Of Rs."+ Integer.parseInt(t14.getText()));
}
}
}
catch(Exception ee)
{
jp.showMessageDialog(this,ee.getMessage());
}
}

}
public static void main(String arg[])
{
water_billshow na=new water_billshow();
}}