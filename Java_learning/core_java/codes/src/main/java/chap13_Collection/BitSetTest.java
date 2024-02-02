package chap13_Collection;
import java.util.BitSet;

public class BitSet {
    public static void main(String[] args) {
        Long binaryValue = Long.parseLong("1011001", 2);
        BitSet bitSet = BitSet.valueOf(new long[]{binaryValue});

        System.out.println("BitSet: " + bitSet);
    }
}
