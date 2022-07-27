package Day1;

import java.util.Scanner;

// Take three no as user input and print which is bigger abc
class Day1_Hello{
    public static void main(String []args){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter value of B : ");
        int b = sc.nextInt();
        System.out.println("Enter value of C : ");
        int c = sc.nextInt();
        sc.close();
        if(a>b && a>c){
            System.out.println("A is bigger..");
        }
        else if(b>a && b>c){
            System.out.println("B  is bigger..");
        }
        else if(c>a && c>b){
            System.out.println("C  is bigger..");
        }
        else if(a==b && a>c){
            System.out.println("A and B both are equal..");
        }
        else if(b==c && b>a){
            System.out.println("B and C both are equal..");
        }
        else if(c==a && c>b){
            System.out.println("A and C both are equal..");
        }
        else
            System.out.println("A, B and c are equal..");

    }
}