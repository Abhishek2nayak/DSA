package abhishek.Math;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(convertNumber(234));
    }

    static String convertNumber(int n) {
        String result = "";
        int l = (int)Math.log10(n + 1);
        int div = 10;
        int idx = 0;
        while (idx <n) {
            result +=checkGroup( n % div);
            n = n - n% div ;
            div *= 10;
            idx++;
        }
    return result;
    }
   static String checkGroup(int n) {

        int[] num = {1,5,10,50,100,500,1000};
        char[] symbols = {'I','V','X','L','C','D','M'};
       for (int i = 0; i < num.length -1; i++) {
           if(n >=  num[i] && n <= num[i + 1]) {
               return convert(n,num[i],num[i + 1],symbols[i],symbols[i + 1],num[i]);
           }
       }
       return "";
   }
   static String convert(int n, int min,int max, char minchar,char maxchar, int m) {
        String result = "";

        if (min - n == m) {
            while(n != 0) {
                result += minchar;
                n -= m;
            }
        } else if (max-n == m) {
            result += minchar + maxchar;
        }
        return result;
   }

}
