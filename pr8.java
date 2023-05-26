class Student
{
int eno;
String name;
Student(int eno, String name)
{
this.eno = eno;
this.name = name;
}
void display ()
{
System.out.println("Enrollment No. : "+eno);
System.out.println("Name : "+name);
}
}
class pr8
{
public static void main(String args[])
{
Student s1=new Student(55,"Mili");
Student s2=new Student(53,"Aisha");
System.out.println();
s1.display();
System.out.println();
s2.display();
}
}