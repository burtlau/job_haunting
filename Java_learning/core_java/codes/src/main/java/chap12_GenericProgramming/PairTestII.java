package chap12_GenericProgramming;

public class PairTestII {
    public static void main(String[] args) {
        Integer[] intArray = {1, 9, 352, 35, 0, 24};
        Pair<Integer> pair = IntArrayAlg.minmax(intArray);
        assert pair != null;
        System.out.println("min = " + pair.getFirst());
        System.out.println("max = " + pair.getSecond());
    }
}

class IntArrayAlg
{
    public static Pair<Integer> minmax(Integer[] intArray)
    {
        if (intArray == null || intArray.length == 0) return null;
        int min = intArray[0];
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) min = intArray[i];
            if (intArray[i] > max) max = intArray[i];
        }
        return new Pair<>(min, max);
    }
}
