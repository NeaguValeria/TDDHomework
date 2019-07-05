public class Fibonacci {

    public static int computeNonRecursive(int n){
        int f1 = 0;
        int f2 = 1;
        if (n == 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            int fAux = f1;
            f1 = f1 + f2;
            f2 = fAux;
        }
        return f1;
    }

    public static int computeRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return computeRecursive(n - 2) + computeRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        checkTheFasterMethodFibonacci(30);
        checkTheFasterMethodFibonacci(50);
    }


    public static void checkTheFasterMethodFibonacci(int index){
        long start = System.currentTimeMillis();
        double result = computeRecursive(index);
        long end = System.currentTimeMillis();
        System.out.println("Recursive f(" + index + ") = " + result + " : time = " + (end - start) + "ms");

        long start1 = System.currentTimeMillis();
        double result1 = computeNonRecursive(index);
        long end1 = System.currentTimeMillis();
        System.out.println("Iterativ f(" + index + ") = " + result1 + " : time = " + (end1 - start1) + "ms");

        if((end - start) > (end1 - start1)){
            System.out.println("Compute Non Recursive is faster ");
        }else{
            System.out.println("Compute Recursive is faster" );
        }
    }
}
