package abhishek.Math;

public class NCR {
    public static void main(String[] args) {
        printNcR(1000,10);
    }
    public static void printNcR(int n, int r) {
        Integer top = factorial(n);
        Integer bottom = factorial(r) * factorial(n - r);
        System.out.println(top + "/"+ bottom);



        //optimized approach
        int diff = n - r;
        Integer ans = null;

        if (diff > r) {
        top = factorialOP(n,diff);
        bottom = factorial(r);
        } else {
         top = factorialOP(n,r);
         bottom = factorial(diff);
        }

        System.out.println(top + "/"+ bottom);

    }
    //brute approach to calculate ncr value
    public static int factorial(Integer n) {
        if(n == 1) return n;
        return n * factorial(n -1);
    }

    //optimize approach
    //ignore unnecessary iteration
    public static int factorialOP(Integer n, Integer r) {
        if (n == 1 || n == r) return 1;
        return n * factorialOP(n-1,r);
    }
}
