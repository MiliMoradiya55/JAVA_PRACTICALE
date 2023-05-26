import java.util.Scanner;
class sort
{
 public static void main(String args[])
{
     int i,j,n,a,temp;
     int A[];
    A=new int[5];
   Scanner sc=new Scanner(System.in);
for(i=0;i<5;i++)
{
 A[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
 for(j=j+1;j<5;j++)
{
 if(a[i]>a[j])
{
 temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
 System.out.println("sorted array");
for(i=0;i<5;i++)
{
 System.out.println(A[i]);
}
}
}