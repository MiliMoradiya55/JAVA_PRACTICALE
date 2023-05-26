import java.util.Scanner;
class circle
{
  final float PI=3.14f;
  float r;
void A_circle(float r1)
{
   float a;
   r=r1;
   a=PI*r*r;
   System.out.println("THE VALUE OF CIRCLE IS:"+a);
}
void C_circle(float r2)
{
     float c;
     r=r2;
     c=2*PI*r;
     System.out.println("THE VALUE OF CIRCLE IS:"+c);
}
}
class m_circle
{
  public static void main(String args[])
{
   int a,b;
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER THE VALUE OF a:");
   a=sc.nextInt();
   System.out.println("ENTER THE VALUE OF b:");
   b=sc.nextInt();
   circle c1=new circle();
   c1.A_circle(a);
   circle c2=new circle();
   c1.C_circle(b);
}
}
