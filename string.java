import java.util.Scanner;
public class string
{  
public static void main(String args[])
{ 
String s1,s2,s3,s4;
char ans1,ans2;
Scanner sc=new Scanner (System.in);

System.out.println("CHARAT STRING METHOD"); 
System.out.print("Enter the value of string:-"); 
s1=sc.next();  
ans1=s1.charAt(1); 
System.out.println("The charAt ans is:-"+ans1); 
System.out.println();

System.out.println("LENGTH STRING METHOD"); 
System.out.print("Enter the value of string:-"); 
s2=sc.next(); 
System.out.println("The Length of String is:-"+s2.length());
System.out.println();
 
System.out.println("CONTAIN STRING METHOD"); 
System.out.print("Enter the value of string:-"); 
s3=sc.next(); 
System.out.println("The contains of String is:-"+s3.contains("i"));
System.out.println(); 

System.out.println("SPLIT STRING METHOD"); 
s4="python";
ans2=s4.split('@',2);
System.out.println("The split of String is:-"+ans2);
System.out.println(); 


}
}  
