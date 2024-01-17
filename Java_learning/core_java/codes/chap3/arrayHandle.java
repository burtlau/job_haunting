import java.util.Arrays;
public class arrayHandle{
    public static void main(String[] args){
        int[] intArray = new int[4];
        int original = 2;
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = original++;
//            System.out.println(intArray[i]);
        }

        int[] copiedArray = Arrays.copyOf(intArray, 2 * intArray.length);
        Arrays.sort(copiedArray);
        for (int j : copiedArray){
            System.out.println(j);
//            output should be 23450000
        }
    }
}