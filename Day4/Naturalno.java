package Day4;

import java.util.Scanner;

public class Naturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        while(num>0){
            sum = sum + num;
            num--;
        }
        System.out.println(sum);
    }
}
