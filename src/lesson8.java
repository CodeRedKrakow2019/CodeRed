import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {

        int number = -1;
        while( number != 4){
            Scanner input = new Scanner(System.in);

             System.out.println("Give me a number");
            try {
                number = input.nextInt();
                System.out.println("OK");
            }
            catch (InputMismatchException e) {
                System.out.println("You have made a mistake!");
                continue;
            }
number=input.nextInt();
            switch (number) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                default:
                    System.out.println("other number");
                    break;
            }

        }

    }
}
