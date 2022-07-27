import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        int i = 1;
        while (i <= num/2) {
            if (num%i==0){
                count++;
                System.out.println("Dividing no is"+ i);
            }
            i++;
        }
        if(count==1)
            System.out.println("Prime No.");
        else
            System.out.println("Not a prime no.");
    }
}