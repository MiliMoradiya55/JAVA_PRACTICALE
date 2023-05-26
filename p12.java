import java.util.Scanner;
class fruit
{
  float fprice;
  String fname;
  fruit(float x,String y)
{
   fprice=x;
   fname=y;
}
fruit(fruit f)
{
  System.out.println("INVOKING THE COPY CONSTRUCTOR");
  fprice=f.fprice;
  fname=f.fname;
}
void display()
{
 System.out.println(fprice);
 System.out.println(fname);
}
}
class p12
{
   public static void main(String args[])
{
         int a;
         String b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of price of fruit : ");
        a=sc.nextInt();
        System.out.println("Enter the value of fruit-name : ");
        b=sc.next();
       fruit f1=new fruit(a,b);
       f1.display();
       fruit f2=new fruit(f1);
       f2.display();
}
}
