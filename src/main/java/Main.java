

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println( new Fibonacci().fibonacci(100000));
        long end = System.currentTimeMillis();

        System.out.println(end-start + " ms");


    }
}
