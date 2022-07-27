package Day2;

import java.util.Scanner;

public class BiggerNoInFourNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of C : ");
        int c = sc.nextInt();
        System.out.println("Enter the value of D : ");
        int d = sc.nextInt();

        sc.close();

        if(a>b && a>c && a>d)
            System.out.println("A is bigger.");
        else if(b>a && b>c && b>d)
            System.out.println("B is bigger.");
        else if(c>a && c>b && c>d)
            System.out.println("C is bigger.");
        else if(d>a && d>b && d>c)
            System.out.println("D is bigger.");
        else if(a==b && a>c && a>d)
            System.out.println("A and B both are equal..");
        else if(b==c && b>a && b>d)
            System.out.println("B and C both are equal..");
        else if(c==a && c>b && c>d)
            System.out.println("A and C both are equal..");
        else if(d==a && d>c && d>b)
            System.out.println("A and D both are equal..");
        else if(b==c && b>a && b>d)
            System.out.println("B and C both are equal..");
        else if(b==d && b>a && b>c)
            System.out.println("B and D both are equal..");
        else if(c==d && c>a && c>b)
            System.out.println("C and D both are equal..");
        else
            System.out.println("A,B,C and D are equal..");

    }
}
