package Day3;

import java.util.Scanner;

public class BiggestNoUsingConditionOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int num1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int num2 = sc.nextInt();
        sc.close();
        String str = (num1>num2?"Num1 is Bigger.":"Num2 is Bigger.");
        System.out.println(str);
    }
}
