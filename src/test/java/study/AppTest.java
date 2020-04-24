package study;

public class AppTest {
    public static void main(String[] args) {
        System.out.println(test3());
    }
    public static int test3() {
        int a = 10;
        try {
            System.out.println("try block");
            a = a / 0;
//            return 1;
        } catch (Exception e) {
            System.out.println("catch block");
//            return 2;
        } finally {
            System.out.println("finally block");
//            return 3;
        }
        System.out.println("finally after");
        return 4;
    }
}