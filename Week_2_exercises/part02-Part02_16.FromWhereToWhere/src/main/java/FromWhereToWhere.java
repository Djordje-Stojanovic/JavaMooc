
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int whereTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int whereFrom = Integer.valueOf(scanner.nextLine());
        
        while (whereFrom <= whereTo) {
            System.out.println(whereFrom);
            whereFrom++;
        }
        
    }
}

/*
Where to? 3
1
2
3
*/