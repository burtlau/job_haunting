package chap5_Inheritance;
import java.util.*;

public class EnumTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size : (SMALL / MEDIUM/ LARGE/ EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbrieviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job -- you paid attention to the -.");
    }
}

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviation) { this.abbrieviation = abbreviation; }
    public String getAbbrieviation(){
        return abbrieviation;
    }
    private String abbrieviation;
}
