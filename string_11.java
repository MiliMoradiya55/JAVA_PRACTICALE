import java.util.Scanner;

public class string_11 {
    public static void main(String args[]) {
        String s1, s2, s3, s4, s5, s6, s7;
        char ans1, ans2;
        Scanner sc = new Scanner(System.in);

        System.out.println("***************CharAt STRING METHODv***************");
        System.out.println();
        System.out.print("Enter the value of string:-");
        s1 = sc.next();
        ans1 = s1.charAt(1);
        System.out.println("The charAt ans is:-" + ans1);
        System.out.println();

        System.out.println("***************LENGTH STRING METHOD***************");
        System.out.println();
        System.out.print("Enter the value of string:-");
        s2 = sc.next();
        System.out.println("The Length of String is:-" + s2.length());
        System.out.println();

        System.out.println("***************CONTAIN STRING METHOD***************");
        System.out.println();
        System.out.print("Enter the value of string:-");
        s3 = sc.next();
        System.out.println("The contains of String is:-" + s3.contains("i"));
        System.out.println();

        System.out.println("***************FORMAT STRING METHOD***************");
        System.out.println();
        String str = "MILI MORADIYA";
        s4 = String.format("My String name is %s", str);
        System.out.println("My String name is:" + str);
        System.out.println();

        s5 = String.format("My answer is %.8f", 55.65734);
        System.out.println(s5);
        s6 = String.format("My answer is %15.18f", 55.65734);
        System.out.println(s6);
        System.out.println();

        System.out.println("***************SPLIT STRING METHOD***************");
        System.out.println();
        s7 = "Java is a Object Orinted Programming Language";
        String[] result = s7.split(" ");
        System.out.print("My Answer is = ");
        for (String str1 : result) {
            System.out.print(str1 + ", ");
        }
    }
}
