package Day8;

import java.util.Scanner;

public class Fact1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        int fact = 1;
        if(num<=15){
            for(int i=1;i<=num;i++){
                fact = fact * i;
            }
            System.out.println("Fact is : " + fact);
        }
        else
            System.out.println("No is greater than 15 so that fact can't be find.");
        sc.close();
    }
}
