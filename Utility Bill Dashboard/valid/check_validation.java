package valid;

public class check_validation
{

public int check_blank(String msg)
{
if(msg.length()==0)
{
return 0;
}
else
{
return 1;
}
}

public int check_number(String msg)
{
int n=msg.length();
int flag=1;
for(int i=0;i<=n-1;i++)
{
int p=msg.charAt(i);
if(p>=48 && p<=57)
{
}
else
{
flag=0;
break;
}
}
return flag;
}

public int check_name(String msg)
{
int n=msg.length();
int flag=1;
for(int i=0;i<=n-1;i++)
{
int p=msg.charAt(i);
if((p>=65 && p<=90) || (p>=97 && p<=122)||n==32)
{
}
else
{
flag=0;
break;
}
}
return flag;
}

public int check_date(String dof)
{
int flag=0;
int n= dof.length();
int a=dof.indexOf('/');
int b=dof.indexOf('/',a+1);
int dd=Integer.parseInt(dof.substring(0,a));
int mm=Integer.parseInt(dof.substring(a+1,b));
int yy=Integer.parseInt(dof.substring(b+1,n));
int aa[]={31,28,31,30,31,30,31,31,30,31,30,31};
int bb[]={31,29,31,30,31,30,31,31,30,31,30,31};
int md=0;
if(mm>=1 && mm<=12)
{
if(yy%4==0)
{
md=bb[mm-1];
}
else
{
md=aa[mm-1];
}
}
if(dd<=0 || dd>md||mm<=0||mm>12||yy!=2016)
{
flag=0;
}
else
{
flag=1;
}
return flag;
}

public int check_phone(String msg)
{
int n=msg.length();
int flag=1;
if(n!=10)
{
flag=0;
}
else
{
for(int i=0;i<=n-1;i++)
{
int p=msg.charAt(i);
if(p>=48 && p<=57)
{
}
else
{
flag=0;
break;
}
}
}
return flag;
}

}

