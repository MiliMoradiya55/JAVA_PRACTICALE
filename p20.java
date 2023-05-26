import java.util.Scanner;

abstract class shape {
    double area;

    abstract void area();
}

class triangle extends shape {
    void area() {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("***************THE AREA OF TRIANGLE***************");
        System.out.print("Enter the value of a:");
        a = sc.nextInt();
        System.out.print("Enter the value of b:");
        b = sc.nextInt();
        System.out.print("the area of tringle is:" + (a * b) / 2);
        System.out.println();
        System.out.println();
    }
}

class circle extends shape {
    void area() {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("***************THE AREA OF CIRCLE***************");
        System.out.print("Enter the value of r:");
        r = sc.nextInt();
        System.out.print("the area of circle is:" + (3.14 * r * r));
        System.out.println();
        System.out.println();
    }
}

class rectangle extends shape {
    void area() {
        Scanner sc = new Scanner(System.in);
        int l, w, q;
        System.out.println("***************THE AREA OF RECTANGLE***************");
        System.out.print("Enter the value of l:");
        l = sc.nextInt();
        System.out.print("Enter the value of w:");
        w = sc.nextInt();
        q = l * w;
        System.out.println("the area of ractngle is:" + q);
        System.out.println();
        System.out.println();
    }
}

class p20 {
    public static void main(String arg[]) {
        triangle t = new triangle();
        t.area();
        circle c = new circle();
        c.area();
        rectangle r = new rectangle();
        r.area();
    }
}
