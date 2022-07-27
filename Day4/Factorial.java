package Day4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int i = sc.nextInt();
        sc.close();
        int fact = 1;
        // int i = 1;
        // while(i<=num){
        //     fact = fact  * i;   
        //     i++;
        // }
        while (i>0) {
            fact = fact * i;
            i--;
        }
        System.out.println(fact);
    }
}
