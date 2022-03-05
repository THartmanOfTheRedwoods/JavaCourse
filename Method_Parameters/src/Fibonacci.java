public class Fibonacci {
    static int fibonacci(int index) {
        if(index <= 2)
            return 1;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    public static void main(String[] args) {
        int fibN = fibonacci(10);
        System.out.println(fibN);
    }
}
