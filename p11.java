import java.util.Scanner;
class method
{
  void area(float r)
{
  System.out.println("The Area of Circle is:"       +3.14*r*r);
}
 void area(float l,float w)
{
    System.out.println("The Area of Rectangle is:"   +l*w);
}
}
class p11
{
  public static void main(String args[])
  
{
  int a,b,c;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the value of radius   :-");
  a=sc.nextInt();
  System.out.println("Enter the value of height   :-");
  b=sc.nextInt();
  System.out.println("Enter the value of width    :-");
  c=sc.nextInt();

  method m1=new method();
  m1.area(a);
  method m2=new method();
  m2.area(b,c);
}
}