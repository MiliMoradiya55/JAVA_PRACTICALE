class counter2
{
  static int count=20;
  counter2()
{
  count++;
  System.out.println(count);
}
}
class mcounter
{
  public static void main(String args[])
{
   counter2 c1=new counter2();
  counter2 c2=new counter2();
  counter2 c3=new counter2();

}
}
