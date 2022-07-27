package Day2;

import java.util.Scanner;

public class countFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = sc.nextInt();
        int i=1;
        int count=0;
        while (i<=num) {
            if (num%i==0) {
                count++;
            }
            i++;
        }
        System.out.println(count);
        sc.close();
    }
}
