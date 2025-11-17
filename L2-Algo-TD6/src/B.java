public class B extends A{
    private int b;
    public B() {
        this(false);
        System.out.println("B()");
    }
    public B(boolean b) {
        super(b);
        System.out.println("B("+b+")");
    }
    public void m1() {
        System.out.println("m1() de B");
    }
    public void m2(int i) {
        System.out.println("m2(int i) de B");
    }
    public void m3() {
        m3();
        System.out.println("m3() de B");
    }
    public void m4() {
        super.m4();
    }
    public void m5() {
        System.out.println("m5() de B");
    }
}
