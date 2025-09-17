public class PrintDecreasing {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print ("1");
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void main (String args[]) {
        int n = 12;
        printDec(n);
        // PrintDecreasing p = new PrintDecreasing();
        // p.printDec(10);
    }
}