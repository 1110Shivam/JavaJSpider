package Day5;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        sc.close();
        int i = 1;
        int sum = 0;
        while(num>i){
            if(num%i==0){
                sum = sum + i;
            }
            i++;
        }
        if(sum==num)
            System.out.println("Perfect No.");
        else
            System.out.println("Not a perfect no.");
    }
}
