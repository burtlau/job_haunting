import java.util.Scanner;
public class scannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sth a: ");
        String a = scanner.nextLine();
        System.out.println("enter sth b: ");
        String b = scanner.nextLine();
        System.out.println("enter sth c d: ");
        String c = scanner.next();
        String d = scanner.next();
        System.out.println("abcd = " + a + b + c + d);
    }
}