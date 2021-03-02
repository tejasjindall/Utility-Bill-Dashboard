import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class myproject extends JFrame implements ActionListener
{
MenuBar mb;
Menu m1,m2,m3,m4;
MenuItem a,b,c,d,e,f,g,h,i,j,k,l;

public myproject()
{

mb=new MenuBar();
m1=new Menu("Flat");
m2=new Menu("Electricity bill");
m3=new Menu("telephone bill");
m4=new Menu("Water bill");
a=new MenuItem("New Flat");
b=new MenuItem("Search Flat");
c=new MenuItem("Update Flat");
d=new MenuItem("Current electricity Bill");
e=new MenuItem("Show Electricity Bill");
f=new MenuItem("Pay electricity bill");
g=new MenuItem("Current Phone Bill");
h=new MenuItem("Show Telephone Bill");
i=new MenuItem("Pay Telephone Bill");
j=new MenuItem("Current Water Bill");
k=new MenuItem("Show Water Bill");
l=new MenuItem("Pay Water Bill");

mb.add(m1);
mb.add(m2);
mb.add(m3);
mb.add(m4);
m1.add(a);
m1.add(b);
m1.add(c);
m2.add(d);
m2.add(e);
m2.add(f);
m3.add(g);
m3.add(h);
m3.add(i);
m4.add(j);
m4.add(k);
m4.add(l);


setMenuBar(mb);
m1.addActionListener(this);
m2.addActionListener(this);
m3.addActionListener(this);
m4.addActionListener(this);
a.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);
e.addActionListener(this);
f.addActionListener(this);
g.addActionListener(this);
h.addActionListener(this);
i.addActionListener(this);
j.addActionListener(this);
k.addActionListener(this);
l.addActionListener(this);

setTitle("myproject");
setBounds(0,0,800,600);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String msg=e.getActionCommand();
if(msg.equals("New Flat"))
{
new_flat md=new new_flat();
}
if(msg.equals("Search Flat"))
{
flat_search md=new flat_search();
}
if(msg.equals("Update Flat"))
{
flat_update md=new flat_update();
}
if(msg.equals("Current electricity Bill"))
{
elec_bill md=new elec_bill();
}
if(msg.equals("Show Electricity Bill"))
{
elec_billshow md=new elec_billshow();
}
if(msg.equals("Pay electricity bill"))
{
elec_billpay md=new elec_billpay();
}
if(msg.equals("Current Phone Bill"))
{
tel_bill md=new tel_bill();
}
if(msg.equals("Show Telephone Bill"))
{
tel_billshow md=new tel_billshow();
}
if(msg.equals("Pay Telephone Bill"))
{
tel_billpay md=new tel_billpay();
}

if(msg.equals("Current Water Bill"))
{
water_bill md=new water_bill();
}
if(msg.equals("Show Water Bill"))
{
water_billshow md=new water_billshow();
}
if(msg.equals("Pay Water Bill"))
{
water_billpay md=new water_billpay();
}



}	

public static void main(String arg[])
{
myproject mn=new myproject();
}
}




