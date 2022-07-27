package Day4;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        
        System.out.println("Enter the pow.");
        int pow = sc.nextInt();
        sc.close();
        int result = 1;
        while (pow>0) {
            result = result * num;
            pow--;
        }
        System.out.println(result);
    }
}
