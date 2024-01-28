package chap3_fundamentalDesignStructure;

import java.util.Arrays;

public class twoDArray{
    public static void main(String[] args){
        int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };
        for (int[] row: magicSquare)
            for(int num: row)
                System.out.println(num);

        System.out.println(Arrays.deepToString(magicSquare));
        System.out.println(Arrays.deepToString(magicSquare).charAt(3));
    }
}