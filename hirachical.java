import java.util.Scanner;
class staff
{
    protected int s_no;
    protected String s_name;
    public void get_staff()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("**************THIS IS A STAFF CLASS*************");
        System.out.println();
        System.out.print("enter the staff no:-");
        s_no=sc.nextInt();
        System.out.print("enter the staff name:-");
        s_name=sc.next();
        System.out.println();
    }
     public void dis_staff()
    {
        System.out.println("The staff no is:-"+s_no);
        System.out.println("The staff name is:-"+s_name);
        System.out.println();
    }
}
class teaching extends staff
{
     protected String experice;
    protected String designation;
    public void get_teaching()
    {
        System.out.println("**************THIS IS A TEACHING CLASS************");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the experice:-");
        experice=sc.next();
        System.out.print("enter the designation:-");
        designation=sc.next();
        System.out.println();
    }
     public void dis_teaching()
    {
        System.out.println("The  experice is:-"+experice);
        System.out.println("The designation is:-"+designation);
        System.out.println();
    }
}
class nonteaching extends staff
{
     protected String qualification;
   
    public void get_nonteaching()
    {
        System.out.println("*************THIS IS A NONTEACHING CLASS***********");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the qualification:-");
        qualification=sc.next(); 
        System.out.println(); 
    }
     public void dis_nonteaching()
    {
        System.out.println("The designation is:-"+qualification);
        System.out.println();
    }
}
class pune extends nonteaching
{
    protected String type;
    public void get_data()
    {
        System.out.println("****************THIS IS A PUNE CLASS**************");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name of pune:-");
        type=sc.next();  
        System.out.println();
   
    }
     public void dis_data()
    {
        System.out.println("The name of pune  is:-"+type);
        System.out.println();
    }
}
class clark extends nonteaching
{
    protected String type;
    protected int exprience ;
    public void get_data()
    {
        System.out.println("***************THIS IS A CLARK CLASS**************");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name of clark:-");
        type=sc.next();  
        System.out.print("enter the exprience-:");
        exprience=sc.nextInt();
        System.out.println();
    }
     public void dis_data()
    {
        System.out.println("The name of clark is:-"+type);
        System.out.println("The  exprience  of clark is:-"+ exprience);

    }
}
class hirachical
{
      public static void main(String arg[])
    {
       staff s1=new staff();
       s1.get_staff();
       s1.dis_staff();


       teaching t1=new teaching();
       t1.get_teaching();
       t1.dis_teaching();


       nonteaching n1=new nonteaching();
       n1.get_nonteaching();
       n1.dis_nonteaching();


       pune p=new pune();
       p.get_data();
       p.dis_data();


       clark c=new clark();
       c.get_data();
       c.dis_data();


    }
}
