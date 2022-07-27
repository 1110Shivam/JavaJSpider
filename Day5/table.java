package Day5;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        sc.close();
        int i = 1;
        while(i<=10){
            System.out.println(num+" X "+i+" = "+num*i);
            i++;
        }
    }
}
