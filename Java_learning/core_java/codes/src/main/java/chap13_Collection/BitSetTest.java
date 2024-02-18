package chap13_Collection;

import java.util.BitSet;

//  Used for flag or boolean values
public class BitSetTest {
    public static void main(String[] args) {
        Long binaryValue = Long.parseLong("1011001", 2);
        BitSet bitSet = BitSet.valueOf(new long[]{binaryValue});
        System.out.println("BitSet: " + bitSet);

//        clone + set + clear
        BitSet bitSet2 = (BitSet) bitSet.clone();
        bitSet2.set(9);
        bitSet2.clear(0);
        System.out.println("BitSet2: " + bitSet2);

//        xor
        bitSet.xor(bitSet2);
        System.out.println(bitSet);
    }
}
