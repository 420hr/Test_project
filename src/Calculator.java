import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operator, n1, n2;
        System.out.println("1 - Add /n 2 - Subtract /n 3 - Multiply /n 4 - divide");
        System.out.println("Choose the fuction you would like: ");
        Scanner Ans = new Scanner(System.in);
        operator = Ans.nextInt();
        System.out.println("Enter first number :");
        n1 = Ans.nextInt();
        System.out.println("Enter second number :");
        n2 = Ans.nextInt();

        int result = 0;
        // Switch is used instead of and if then statement. Also a note is when I used if then statement it didnt work sighting it has to be a boolean
        switch(operator) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;
            default:
                System.out.println("Entered number is not valid");
        }
        System.out.println( "Result is :" + result);
    }
}


