interface A {
    void disp_A();

}

interface B {
    void disp_B();

}

class C implements A, B {
    public void disp_A() {
        System.out.println("this is a value of a");
    }

    public void disp_B() {
        System.out.println("this is a value of b");
    }
}

class p19 {
    public static void main(String args[]) {
        C c1 = new C();
        c1.disp_A();
        c1.disp_B();
        
    }
}