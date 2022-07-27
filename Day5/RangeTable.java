package Day5;

import java.util.Scanner;

public class RangeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range.");
        int num = sc.nextInt();
        sc.close();
        int no = 1;
        while (num > 0) {
            int i = 1;
            while (i <= 10) {
                System.out.println(no + " X " + i + " = " + no * i);
                i++;
            }
            System.out.println("================================");
            no++;
            num--;
        }

    }
}
