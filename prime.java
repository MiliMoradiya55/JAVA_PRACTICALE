import java.util.Scanner;
class prime
{
	public static void main(String arg[])	
	{
	int i,j,count=0,n;
	Scanner sc=new Scanner(System.in);
       System.out.print("Enter n value : ");
	    n=sc.nextInt();
         for(i=0;i<=n;i++)
	{
	 for(j=1;j<=i;j++)
	{
	   if(i%j==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
      {
	       System.out.println(i);     
	    }
	}
}
}