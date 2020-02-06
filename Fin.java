public class Fin
{
public static void main(String arg[])
{
int a=Integer.parseInt(arg[0]);
int b=Integer.parseInt(arg[1]);
int c=Integer.parseInt(arg[2]);
int num;
for(int i=0;i<3;i++)
{
  num=a*100;
num=num+(b*10);
num=num+(c);
System.out.println(num);
int temp;
temp=a;
a=b;
b=c;
c=temp;
}
a=Integer.parseInt(arg[2]);
b=Integer.parseInt(arg[1]);
c=Integer.parseInt(arg[0]);
for(int i=0;i<3;i++)
{
num=a*100;
num=num+(b*10);
num=num+(c);
System.out.println(num);
int temp;
temp=a;
a=b;
b=c;
c=temp;
}
}
}