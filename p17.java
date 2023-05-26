class A {
    void call_me() {
        System.out.println("INSIDE THE A CLASS");
    }
}
class B extends A {
    void call_me() {
        System.out.println("INSIDE THE B CLASS");
    }
}
class C extends A {
    void call_me() {
        System.out.println("INSIDE THE C CLASS");
    }
}
class p17 {
    public static void main(String arg[]) {
        System.out.println("***********METHOD OVERRIDING*************");
        A a = new A();
        B b = new B();
        C c = new C();
        A r;
        r = b;
        r.call_me();
        r = a;
        r.call_me();
        r = c;
        r.call_me();

    }
}