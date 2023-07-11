package abhishek.Math;

public class PrimeFactors {
    public static void main(String[] args) {
//        primesFac1(100);
        seive();
        getFactor(100);
    }
    //basic approach

    //time complexity : O(num)
    public static void primesFac(int num) {

      int divder = 2;
      while(num != 1) {
          if (num % divder == 0) {
              num /= divder;
              System.out.print(divder + "*");
          } else {
              divder++;
          }

      }
    }


    public static void primesFac1(int num) {
        for (int div = 2; div*div <= num; div++) {
            while(num % div == 0) {
                System.out.print(div + " ");
                num /= div;
            }
        }
       if (num != 1) {
           System.out.println(num);
       }
    }
    //using seive method
    //idea is to first calculate all the smallest prime factor for the given number in an array
    // and then divide number until number become ones

  static final int MAXN = 100001;
    static int[] spf = new int[MAXN];
    public static void seive() {
        spf[1] = 1;
        for (int i = 2; i <MAXN; i++) {
            //marking all the number spf as number itself
         spf[i] = i;
        }

        //let mark all the even number to spf = 2
        for (int i = 4; i <MAXN ; i +=2) {
            spf[i] = 2;
        }
        //mark all the odd number 
        for (int i = 3; i*i < MAXN; i++) {
            if(spf[i] == i) {
                //marking all spf divisible by i
                for (int j = i * i; j < MAXN; j+=i) {
                 if(spf[j] == j) spf[j] = i;
                }
            }
        }
    }
    public static void getFactor(int n) {
        while(n != 1) {
            System.out.println(spf[n]);
            n = n / spf[n];
        }
    }
}
