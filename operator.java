import java.util.Scanner;
class operator
{
  public static void main(String arg[])
  {
    int a,b,c,x;
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
 System.out.println("Enter the value:");
  x=(a>b?(a>c?a:c):(b>c?b:c));
{
  System.out.println("my max value is"+x);
}
  }
}
