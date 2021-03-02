import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import valid.check_validation;

public class water_bill extends JFrame implements ActionListener
{
Label l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
check_validation cv=new check_validation();
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
Button b1,b2,b3;  

 
GridBagLayout grid;
GridBagConstraints cg;
Container c=getContentPane();

public water_bill()
{
l0=new Label("Water bill");
l1=new Label("Enter flat");
l2=new Label("Name");
l3=new Label("Location");
l4=new Label("Enter meter no.");
l5=new Label("Bill from");
l6=new Label("Bill to");
l7=new Label("Issue date");
l8=new Label("Pay date");
l9=new Label("Previous reading");
l10=new Label("Current reading");
l11=new Label("Meter rent");
l12=new Label("Other");
l13=new Label("    ");
l14=new Label("    ");
l15=new Label("    ");
l16=new Label("    ");
l17=new Label("    ");
l18=new Label("    ");
l19=new Label("    ");
l20=new Label("    ");
l21=new Label("    ");

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

b1=new Button("Create Bill");
b2=new Button("Reset");
b3=new Button("search");

grid=new GridBagLayout();
cg=new GridBagConstraints();
c.setLayout(grid);

cg.gridx=1;
cg.gridy=0;
grid.setConstraints(l0,cg);
c.add(l0);

cg.gridx=0;
cg.gridy=1;
grid.setConstraints(l13,cg);
c.add(l13);

cg.gridx=0;
cg.gridy=2;
grid.setConstraints(l1,cg);
c.add(l1);

cg.gridx=1;
cg.gridy=2;
grid.setConstraints(t1,cg);
c.add(t1);

cg.gridx=0;
cg.gridy=3;
grid.setConstraints(l14,cg);
c.add(l14);

cg.gridx=0;
cg.gridy=4;
grid.setConstraints(l2,cg);
c.add(l2);

cg.gridx=1;
cg.gridy=4;
grid.setConstraints(t2,cg);
c.add(t2);

cg.gridx=0;
cg.gridy=5;
grid.setConstraints(l15,cg);
c.add(l15);

cg.gridx=0;
cg.gridy=6;
grid.setConstraints(l3,cg);
c.add(l3);

cg.gridx=1;
cg.gridy=6;
grid.setConstraints(t3,cg);
c.add(t3);

cg.gridx=0;
cg.gridy=7;
grid.setConstraints(l16,cg);
c.add(l16);


cg.gridx=0;
cg.gridy=8;
grid.setConstraints(l4,cg);
c.add(l4);

cg.gridx=1;
cg.gridy=8;
grid.setConstraints(t4,cg);
c.add(t4);

cg.gridx=0;
cg.gridy=9;
grid.setConstraints(l17,cg);
c.add(l17);

cg.gridx=0;
cg.gridy=10;
grid.setConstraints(l5,cg);
c.add(l5);

cg.gridx=1;
cg.gridy=10;
grid.setConstraints(t5,cg);
c.add(t5);


cg.gridx=2;
cg.gridy=10;
grid.setConstraints(l6,cg);
c.add(l6);

cg.gridx=3;
cg.gridy=10;
grid.setConstraints(t6,cg);
c.add(t6);

cg.gridx=0;
cg.gridy=11;
grid.setConstraints(l18,cg);
c.add(l18);

cg.gridx=0;
cg.gridy=12;
grid.setConstraints(l7,cg);
c.add(l7);

cg.gridx=1;
cg.gridy=12;
grid.setConstraints(t7,cg);
c.add(t7);


cg.gridx=2;
cg.gridy=12;
grid.setConstraints(l8,cg);
c.add(l8);

cg.gridx=3;
cg.gridy=12;
grid.setConstraints(t8,cg);
c.add(t8);


cg.gridx=0;
cg.gridy=13;
grid.setConstraints(l19,cg);
c.add(l19);

cg.gridx=0;
cg.gridy=14;
grid.setConstraints(l9,cg);
c.add(l9);

cg.gridx=1;
cg.gridy=14;
grid.setConstraints(t9,cg);
c.add(t9);

cg.gridx=2;
cg.gridy=14;
grid.setConstraints(l10,cg);
c.add(l10);

cg.gridx=3;
cg.gridy=14;
grid.setConstraints(t10,cg);
c.add(t10);

cg.gridx=0;
cg.gridy=15;
grid.setConstraints(l20,cg);
c.add(l20);

cg.gridx=0;
cg.gridy=16;
grid.setConstraints(l11,cg);
c.add(l11);

cg.gridx=1;
cg.gridy=16;
grid.setConstraints(t11,cg);
c.add(t11);

cg.gridx=2;
cg.gridy=16;
grid.setConstraints(l12,cg);
c.add(l12);

cg.gridx=3;
cg.gridy=16;
grid.setConstraints(t12,cg);
c.add(t12);

cg.gridx=0;
cg.gridy=17;
grid.setConstraints(l21,cg);
c.add(l21);

cg.gridx=0;
cg.gridy=18;
grid.setConstraints(b1,cg);
c.add(b1);

cg.gridx=1;
cg.gridy=18;
grid.setConstraints(b2,cg);
c.add(b2);

cg.gridx=2;
cg.gridy=2;
grid.setConstraints(b3,cg);
c.add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

setTitle("Water Bill");
setBounds(0,0,1200,900);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
int flag=1;
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

}
else if(msg.equals("search"))
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:bill_project");
Statement st=con.createStatement();
ResultSet rs;
rs=st.executeQuery("select * from flat_info where flat_no=" + Integer.parseInt(t1.getText()));
int count=0;
while(rs.next())
{
t3.setText(rs.getString(2));
t2.setText(rs.getString(4));
count=1;
break;
}
if(count==0)
{
t3.setText("");
t2.setText("");
jp.showMessageDialog(this,"Sorry Flat is Not Available");
}
}
catch(Exception ee)
{
}
}
else if(msg.equals("Create Bill"))
{
try
{
if(cv.check_blank(t1.getText())==0||cv.check_blank(t4.getText())==0||cv.check_blank(t5.getText())==0||cv.check_blank(t6.getText())==0||cv.check_blank(t7.getText())==0||cv.check_blank(t8.getText())==0||cv.check_blank(t9.getText())==0||cv.check_blank(t10.getText())==0||cv.check_blank(t11.getText())==0||cv.check_blank(t12.getText())==0)
{
jp.showMessageDialog(this,"Sorry Some Fields are blank");
flag=0;
}
if(cv.check_number(t1.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Flat No. Must be numeric");
flag=0;
}

if(cv.check_date(t5.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Bill From Must be as dd/mm/yyyy");
flag=0;
}

if(cv.check_date(t6.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Bill To Must be as dd/mm/yyyy");
flag=0;
}

if(cv.check_date(t7.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Issue Date Must be as dd/mm/yyyy");
flag=0;
}

if(cv.check_date(t8.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Pay Date Must be as dd/mm/yyyy");
flag=0;
}

if(cv.check_number(t9.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Pre Reading Must be numeric");
flag=0;
}

if(cv.check_number(t10.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Current Reading Must be numeric");
flag=0;
}

if(cv.check_number(t11.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Rent Must be numeric");
flag=0;
}

if(cv.check_number(t12.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Other Charges Must be numeric");
flag=0;
}

if(flag==1)
{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:bill_project");
Statement st=con.createStatement();
int uc=Integer.parseInt(t10.getText())-Integer.parseInt(t9.getText());
int tb=(uc*6)+ Integer.parseInt(t11.getText()) + Integer.parseInt(t12.getText());

st.executeUpdate("insert into water values(" + Integer.parseInt(t1.getText()) +",'" + t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "','" + t7.getText() + "','" + t8.getText() + "'," + Integer.parseInt(t9.getText()) + "," + Integer.parseInt(t10.getText()) + "," + Integer.parseInt(t11.getText()) + "," + Integer.parseInt(t12.getText()) + "," + uc + "," + tb + ",'unpaid')");

jp.showMessageDialog(this,"record is saved");
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
water_bill eb=new water_bill();
}
}