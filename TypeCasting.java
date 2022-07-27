class TypeCasting{
	public static void main(String[] args){
		int a = 12;
		System.out.println("The value of a is : +a");
		System.out.println("The value of a is : "+a);
		int b = 18;
		int sum = a+b;
		System.out.println("The sum of a & b is : "+sum);
		System.out.println("The sum is :"+30+40);
		System.out.println(30+80+" The sum is :");
		System.out.println(20+60+" The sum is :"+30+40);		

		a+=8;
		System.out.println(a);//20
		a-=4;
		System.out.println(a);//16
		a*=2;
		System.out.println(a);//32
		a/=2;
		System.out.println(a);//16
		a%=4;
		System.out.println(a);//0

		int w = 12;
		int e = 16;

		System.out.println(w<=e);//true
		System.out.println(w+4<=e);//true
		System.out.println(e%2==0);//true
		System.out.println(w%5==2);//true

		int n = 12;
		System.out.println(n++);//12
		System.out.println(n);//13
		int c = 20;
		System.out.println(++c);//21
		System.out.println(c);//21
		System.out.println("Incremnt........................");
		int val = 20;
		System.out.println(val++);//20
		System.out.println(val++);//21
		System.out.println(val);//22
		System.out.println(val++);//22
		System.out.println(++val);//24
		System.out.println(val);//24
	}
}