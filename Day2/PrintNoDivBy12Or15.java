package Day2;

public class PrintNoDivBy12Or15 {
    public static void main(String[] args) {
        int i = 0;
        while(i<=1000){
            if(i%12==0 || i%15==0)
                System.out.println(i);
            i++;
        }
    }
}
