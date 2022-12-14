public class Liskov {

    static class A {
        int x() {return y();}
        int y() {return 1;}
    }

//    static class B extends A {
//        int y() {return 2;}
//    }

    static class B {
        A a;
        public B() {
            a = new A();
        }
        int y() { return 2; }
        int x() { return a.x(); }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.x());
        System.out.println(b.x());
    }
}
