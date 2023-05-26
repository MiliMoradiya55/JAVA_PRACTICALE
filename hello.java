import java.util.Scanner;
class rev
{
  public static void main(String args[])
{
  int sum=0,num,a;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value:");
 num=sc.nextInt();
  while(num !=0)
{
  a=num%10;
  sum=sum*10+a;
  num=num/10;
}
System.out.println("THE REVERSE VALUE IS"+sum);
 }
 }

