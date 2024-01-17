import java.util.Scanner;
public class switchCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("select number from 1 2 3 4:");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("you chose num1");
                break;
            case 2:
                System.out.println("22222");
                break;
            case 3:
                System.out.println("we got a 3");
                break;
            case 4:
                System.out.println("now it's 4");
                break;
            default:
                System.out.println("what does this means?");
                break;
        }
    }
}