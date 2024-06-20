import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Test 1");
        System.out.println(300);
        System.out.println(3+3);
        //These code lines are used for practice
        String name= "Jake";
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);
        int myNum2;
        myNum2 = 22;
        System.out.println(myNum2);
        String firstName = "John";
        String lastName = "Cena";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        char myGrade = 'A';
        System.out.println(myGrade);
        double myDouble = myNum2;
        System.out.println(myDouble);
        System.out.println("What is the number of today from the number of days in a week? ");
        Scanner Ans = new Scanner(System.in);
        int Day = Ans.nextInt();

        switch (Day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednessday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Try again later");
        }

        for (int i = 1; i < 2; i++) {
            System.out.println("Outer:"+i);
            for (int j = 0; j<= 3; j++) {
                System.out.println("Inner: " +j);
            }
        }
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        for(String i: cars){
            System.out.println(i);
        }
    }
}