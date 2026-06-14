class A {

    static void a() {
        System.out.println("A");
    }

    static void b(int x) {
        System.out.println(x);
    }

    static int c() {
        return 10;
    }

    static int d(int x) {
        return x;
    }

    void e() {
        System.out.println("E");
    }

    void f(int x) {
        System.out.println(x);
    }

    int g() {
        return 20;
    }

    int h(int x) {
        return x;
    }

    public static void main(String[] args) {

        A ob = new A();

        a();
        b(5);
        System.out.println(c());
        System.out.println(d(10));

        ob.e();
        ob.f(15);
        System.out.println(ob.g());
        System.out.println(ob.h(20));
    }
}