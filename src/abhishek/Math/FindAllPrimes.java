package abhishek.Math;

import java.util.Arrays;

public class FindAllPrimes {
    public static void main(String[] args) {

        seiveOfErathosthenes(10);
    }
    //brute approach
    //TO : O(n2)

    public static void printAllPrime1(int n) {
       boolean isPrime = true;
        for (int i = 2; i <=n; i++) {
            isPrime = true;
            //check if its prime or not
            for (int j = 2; j <=i /2; j++) {
              if (i % j == 0) {
                  isPrime = false;
                  break;
              }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }

   //T O : O(n * sqrt(n))
    public static void printAllPrime2(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j*j <= i ; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }

    }




    public static void seiveOfErathosthenes(int n) {
    boolean[] notPrime = new boolean[n];
        for (int i = 2; i * i<= n; i++) {
            for(int j = i; j<= n; j = j + i) {
               if(i != j && !notPrime[j- 1]) {
                   notPrime[j-1] = true;
               }

            }
        }
        for (int i = 1; i < n; i++) {
            if (!notPrime[i]) {
                System.out.println(i + 1);
            }
        }

    }
}
