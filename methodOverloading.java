public class methodOverloading {
    public static void test(int a, double b){
        System.out.println(a+b);        
    }
    public static void test(double a, int b){
        System.out.println(a+b);        
    }
    public static void main(String[] args) {
        test(44.0,44);
    }
}
