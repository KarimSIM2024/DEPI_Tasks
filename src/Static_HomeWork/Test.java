package Static_HomeWork;

class Counter {
    static int count = 0;
    Counter() { count++; }
}
public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.count);
    }
}