
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        double avg = (1.0*num1+1.0*num2)/2;
        System.out.println("The average is " + avg);

    }
}

/*
Give the first number:
8
Give the second number:
2
The average is 5.0
*/