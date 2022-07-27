package Day5;

import java.util.Scanner;

public class SumOfCubeOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        while (num>0) {
            sum = sum + num*num*num;
            num--;
        }
        System.out.println(sum);
    }
}
