import java.util.Scanner;
class sem1
{
    protected int a1,a2,a3,avg1;
  
    Scanner sc=new Scanner(System.in);
    public void get_sem1()
    {
    System.out.println("****************MULTILEVEL INHERITANCE***********");    
    System.out.print("*****************THIS IS A SEM 1 CLASS*****************");
    System.out.println();
    System.out.println();
    System.out.print("Enter the sem1 marks :-");
    a1=sc.nextInt();
    System.out.print("Enter the sem1 marks:-");
    a2=sc.nextInt();
    System.out.print("Enter the sem1 marks :-");
    a3=sc.nextInt();
    avg1=(a1+a2+a3)/(3);
    System.out.println();
    }
    public void dis_sem1()
    {
        System.out.println("semester 1 avg is:-"+avg1); 
        System.out.println();
    }
}
class sem2 extends sem1
{
    protected int b1,b2,b3,avg2;
  
    Scanner sc=new Scanner(System.in);
    public void get_sem2()
    {
    System.out.print("*****************THIS IS A SEM 2 CLASS*****************");
    System.out.println();
    System.out.println();
    System.out.print("Enter the sem2 marks :-");
    b1=sc.nextInt();
    System.out.print("Enter the sem2 marks:-");
    b2=sc.nextInt();
    System.out.print("Enter the sem2 marks :-");
    b3=sc.nextInt();
    avg2=(b1+b2+b3)/3;
    System.out.println();
    }
    public void dis_sem2()
    {
        System.out.println("semester 2 avg is:-"+avg2); 
        System.out.println();
    }
}
class sem3 extends sem2
{
    protected int c1,c2,c3,avg3;
  
    Scanner sc=new Scanner(System.in);
    public void get_sem3()
    {
    System.out.print("*****************THIS IS A SEM 3 CLASS*****************");
    System.out.println();
    System.out.println();
    System.out.print("Enter the sem3 marks :-");
    c1=sc.nextInt();
    System.out.print("Enter the sem3 marks :-");
    c2=sc.nextInt();
    System.out.print("Enter the sem3 marks :-");
    c3=sc.nextInt();
    avg3=(c1+c2+c3)/3;
    System.out.println();
    }
    public void dis_sem3()
    {
        System.out.println("semester 3 avg is:-"+avg3); 
        System.out.println();
    }
}

class p15
{
    public static void main(String arg[])
    {
        sem1 p=new sem1();
        p.get_sem1();
        p.dis_sem1();
        
        sem2 q=new sem2();
        q.get_sem2();
        q.dis_sem2();
    
        sem3 r=new sem3();
        r.get_sem3();
        r.dis_sem3();

    }
}

