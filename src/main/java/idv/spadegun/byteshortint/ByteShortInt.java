package idv.spadegun.byteshortint;

public class ByteShortInt {
    public static void main(String[] args) {
        byte myByteNumber = 100;
        short myShortNumber = 200;
        int myIntNumber = 300;
        long myLongNumber = 50000 + 10 * (myByteNumber + myShortNumber + myIntNumber);

        System.out.println("longTotal = " + myLongNumber);
    }
}
