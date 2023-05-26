import java.util.Scanner;
class rect
{
  int h,w;
rect()
{
  h=5;
  w=3;
}
rect(int x)
{
  h=x;
  w=x;
}
rect(int x,int y)
{
  h=x;
  w=y;
}
void area()
{
  System.out.println("area of a rectangle is"+(h*w));
}
}
class mrect
{
  public static void main(String args[])
{
  int p,q;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the value of height   :-");
  p=sc.nextInt();
  System.out.print("Enter the value of width    :-");
  q=sc.nextInt();
  rect r1=new rect();
  r1.area();
  rect r2=new rect(p);
  r2.area();
  rect r3=new rect(p,q);
  r3.area();
}
}