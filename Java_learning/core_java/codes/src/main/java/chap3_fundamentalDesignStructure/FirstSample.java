package chap3_fundamentalDesignStructure;

public class FirstSample
{
    public static void main(String[] args)
    {
        System.out.println("hello world");

        final double CM_PER_INCH = 2.54;
        int m = 7;
        int n = 7;
        int a = 2*m++;
        int b = 2*++n;
        System.out.println(a + "," + b + "," + m + "," + n);

        System.out.println("HELLO".substring(0,3));
        System.out.println("HELLO".substring(0,3).equalsIgnoreCase("hel"));
        System.out.println("HELLO".charAt(3));

        String text = "Hello, 你好";
        int indexOfChineseCharacter = text.indexOf(20320); // Find the position of '你' (Unicode code point 20320)
        System.out.println("Index of 你: " + indexOfChineseCharacter);

    }
}
