import java.util.Scanner;
class d_student
{
 String name;
  int rollno;

  void getdata()
{
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter name value : ");
   name=sc.next(); 
   System.out.print("Enter rollno value : ");
   rollno=sc.nextInt(); 
}
  void display()
{
    System.out.println(" student name value is                 :" +name);
    System.out.println(" student enrollment value is           :" +rollno);
}
}	
class d_student
{
  public static void main(String args[])	
  {
       student s1=new student();
       student s2=new student();
       student s3=new student();

      s1.getdata();
      s2.getdata();
      s3.getdata();

      s1.display();
      s2.display();
      s3.display();

  }
}
