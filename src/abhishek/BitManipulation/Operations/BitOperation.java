package abhishek.BitManipulation.Operations;

public class BitOperation {
    public static void main(String[] args) {

        System.out.println(getBit(5,2));
        System.out.println(setBit(5,1));
        System.out.println(clearBit(5,2));
    }

    public static boolean getBit(int num, int i) {

       return ((num & (1 << i)) != 0);
    }
    public static int setBit(int num, int i) {

        return (num | (1 << i));
    }
    public static int clearBit(int num, int i) {

        // create a bit mask complement of 1 << i
        int mask = ~(1 << i);
        return num & mask;

    }
}
