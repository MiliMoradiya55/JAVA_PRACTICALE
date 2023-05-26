import java.util.Scanner;
class teacher
{
    protected int t_no;
    protected String t_name;
    Scanner sc=new Scanner(System.in);
    public void get_teacher()
    {
    System.out.print("*****************THIS IS A TEACHER CLASS*****************");
    System.out.println();
    System.out.println();
    System.out.print("Enter the Teacher No:-");
    t_no=sc.nextInt();
    System.out.print("Enter the Teacher Name:-");
    t_name=sc.next();
    System.out.println();
    }
    public void dis_teacher()
    {
        System.out.println("The Teacher No is:-"+t_no);
        System.out.println("The Teacher Name is:-"+t_name);
        System.out.println("THACHER IS TEACH THE JAVA");
        System.out.println();
    }
}
class student extends teacher
{
    protected int s_no;
    protected String s_name;
    Scanner sc=new Scanner(System.in);
    public void get_student()
    {
    System.out.println("*****************THIS IS A STUDENT CLASS*****************");
    System.out.println();
    System.out.print("Enter the Student no:-");
    s_no=sc.nextInt();
    System.out.print("Enter the Student name:-");
    s_name=sc.next();
    System.out.println();
    }
    public void dis_student()
    {
        System.out.println("The Student no is:-"+s_no);
        System.out.println("The Student name is:-"+s_name);
        System.out.println("STUDENT IS STUDY THE JAVA");
        System.out.println();
    }
}
class p14
{
    public static void main(String ard[])
    {
        teacher t=new student();
        t.get_teacher();
        t.dis_teacher();

        student s=new student();
        s.get_student();
        s.dis_student();


    }
}

