public class Fibonacci {

    public static int printFib (int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fibN = printFib(n-1) + printFib(n-2);
        return fibN;
    }
    public static void main(String[] args) {
        int n = 25;
        int result  = printFib(n); 
        System.out.println(result);
    }
}
