import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import valid.check_validation;

public class new_flat extends JFrame implements ActionListener
{
Label l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
check_validation cv=new check_validation();
TextField t1,t2,t3,t4,t5,t6,t7;
Button b1,b2;
Choice Location,Type_of_flat,Occupation,Rent;  

 
GridBagLayout grid;
GridBagConstraints cg;
Container c=getContentPane();

public new_flat()
{
l0=new Label("New flat");
l1=new Label("Flat number");
l2=new Label("Location ");
l3=new Label("Type of flat ");
l4=new Label("Name of owner");
l5=new Label("Phone number");
l6=new Label("Occupation");
l7=new Label("Rent");
l8=new Label("Number of persons");
l9=new Label("    ");
l10=new Label("    ");
l11=new Label("    ");
l12=new Label("    ");
l13=new Label("    ");
l14=new Label("    ");
l15=new Label("    ");
l16=new Label("    ");
l17=new Label("    ");
l18=new Label("    ");

Location=new Choice();
Type_of_flat=new Choice();
Occupation=new Choice();
Rent=new Choice();

Location.add("1st floor");
Location.add("2nd floor");
Location.add("3rd floor");
Location.add("4th floor");
Location.add("5th floor");

Type_of_flat.add("1BHK");
Type_of_flat.add("2BHK");
Type_of_flat.add("3BHK");
Type_of_flat.add("4BHK");

Occupation.add("govt. service");
Occupation.add("bussiness");
Occupation.add("3rd party");

Rent.add("owner");
Rent.add("rent");

t1=new TextField(30);
t2=new TextField(30);
t3=new TextField(30);
t4=new TextField(30);
t5=new TextField(30);
t6=new TextField(30);
t7=new TextField(30);


b1=new Button("Submit");
b2=new Button("Reset");

grid=new GridBagLayout();
cg=new GridBagConstraints();
c.setLayout(grid);

cg.gridx=1;
cg.gridy=0;
grid.setConstraints(l0,cg);
c.add(l0);

cg.gridx=0;
cg.gridy=1;
grid.setConstraints(l9,cg);
c.add(l9);

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
grid.setConstraints(l10,cg);
c.add(l10);

cg.gridx=0;
cg.gridy=4;
grid.setConstraints(l2,cg);
c.add(l2);

cg.gridx=1;
cg.gridy=4;
grid.setConstraints(Location,cg);
c.add(Location);

cg.gridx=0;
cg.gridy=5;
grid.setConstraints(l11,cg);
c.add(l11);

cg.gridx=0;
cg.gridy=6;
grid.setConstraints(l3,cg);
c.add(l3);

cg.gridx=1;
cg.gridy=6;
grid.setConstraints(Type_of_flat,cg);
c.add(Type_of_flat);

cg.gridx=0;
cg.gridy=7;
grid.setConstraints(l12,cg);
c.add(l12);


cg.gridx=0;
cg.gridy=8;
grid.setConstraints(l4,cg);
c.add(l4);

cg.gridx=1;
cg.gridy=8;
grid.setConstraints(t2,cg);
c.add(t2);

cg.gridx=0;
cg.gridy=9;
grid.setConstraints(l13,cg);
c.add(l13);

cg.gridx=0;
cg.gridy=10;
grid.setConstraints(l5,cg);
c.add(l5);

cg.gridx=1;
cg.gridy=10;
grid.setConstraints(t3,cg);
c.add(t3);

cg.gridx=0;
cg.gridy=11;
grid.setConstraints(l14,cg);
c.add(l14);

cg.gridx=0;
cg.gridy=12;
grid.setConstraints(l6,cg);
c.add(l6);

cg.gridx=1;
cg.gridy=12;
grid.setConstraints(Occupation,cg);
c.add(Occupation);

cg.gridx=0;
cg.gridy=13;
grid.setConstraints(l15,cg);
c.add(l15);

cg.gridx=0;
cg.gridy=14;
grid.setConstraints(l7,cg);
c.add(l7);

cg.gridx=1;
cg.gridy=14;
grid.setConstraints(Rent,cg);
c.add(Rent);


cg.gridx=1;
cg.gridy=15;
grid.setConstraints(l16,cg);
c.add(l16);

cg.gridx=0;
cg.gridy=16;
grid.setConstraints(l8,cg);
c.add(l8);

cg.gridx=1;
cg.gridy=16;
grid.setConstraints(t4,cg);
c.add(t4);


cg.gridx=0;
cg.gridy=17;
grid.setConstraints(l17,cg);
c.add(l17);

cg.gridx=0;
cg.gridy=18;
grid.setConstraints(l18,cg);
c.add(l18);


cg.gridx=0;
cg.gridy=19;
grid.setConstraints(b1,cg);
c.add(b1);

cg.gridx=1;
cg.gridy=19;
grid.setConstraints(b2,cg);
c.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);

setTitle("new_flat");
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
}
else
{
try
{
if(cv.check_blank(t1.getText())==0||cv.check_blank(t2.getText())==0||cv.check_blank(t3.getText())==0||cv.check_blank(t4.getText())==0)
{
jp.showMessageDialog(this,"Sorry Some Fields are blank");
flag=0;
}
if(cv.check_number(t1.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Flat No. Must be numeric");
flag=0;
}
if(cv.check_name(t2.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Only Alphabets r allowed");
flag=0;
}
if(cv.check_phone(t3.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"Invalid Phone no.");
flag=0;
}
if(cv.check_number(t4.getText())==0 && flag==1)
{
jp.showMessageDialog(this,"No. of persons Must be numeric");
flag=0;
}
if(Integer.parseInt(t4.getText())>10 && flag==1)
{
jp.showMessageDialog(this,"Max. 10 persons are allowed");
flag=0;
}
if(flag==1)
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:bill_project");
Statement s11=con.createStatement();
int count=0;
ResultSet rs;
rs=s11.executeQuery("select * from flat_info where flat_no=" + Integer.parseInt(t1.getText()));
while(rs.next())
{
count++;
break;
}
if(count==1)
{
jp.showMessageDialog(this,"Sorry Flat No. is already alloted");
}
else
{
Statement s1=con.createStatement();
s1.executeUpdate("insert into flat_info values(" + Integer.parseInt(t1.getText()) +",'" + Location.getSelectedItem() +"','" +Type_of_flat.getSelectedItem() +"','" + t2.getText() +"','" + t3.getText() + "','"
+ Occupation.getSelectedItem() +"','" + Rent.getSelectedItem() +"'," + Integer.parseInt(t4.getText()) + ")");
jp.showMessageDialog(this,"record is saved");
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
new_flat na=new new_flat();
}
}