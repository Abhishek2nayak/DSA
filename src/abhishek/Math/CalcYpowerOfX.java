package abhishek.Math;

public class CalcYpowerOfX {
    public static void main(String[] args) {
        System.out.println(powerOP(2,10));
    }

//    time complexity : O(Y)
    public static  int power(int x, int y) {
        if(y == 0) return 1;
        if (y == 1) return x;
        int ans = x;
        for(int i = 1; i < y; i++) {
            ans = ans * x;
        }

        return ans;
    }
    public static int powerOP(int x, int y) {
        if(y== 0) return 1;
        if (y == 1) return x;
        int diff = y / 2;
        return powerOP(x,diff) * powerOP(x,y -diff);

    }
}
