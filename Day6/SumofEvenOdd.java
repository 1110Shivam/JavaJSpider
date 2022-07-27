package Day6;

public class SumofEvenOdd {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i = 1;
        while (i<=100) {
            if(i%2==0)
                sumOfEven = sumOfEven + i;
            else
                sumOfOdd = sumOfOdd + i;
            i++;
        }
        System.out.println("Sum of even no is : " + sumOfEven);
        System.out.println("Sum of odd no is : " + sumOfOdd);
    }
}
