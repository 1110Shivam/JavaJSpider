package Day7;

import java.util.Scanner;

public class DowhileFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            System.out.println("Enter the no");
            int num = sc.nextInt();
            int fact = 1;
            int i=1;
            while(i<=num){
                fact = fact *i;
                i++;
            }
            System.out.println("Factorial is : "+fact);
            System.out.println("Do you want to continue this program.");
            System.out.println("Press Y or No");
            c = sc.next().charAt(0);
        } while (c=='y'||c=='Y');
        sc.close();
    }
}
