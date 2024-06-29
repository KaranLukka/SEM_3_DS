import java.util.Scanner;
class Swap{
	int a;
	int b;
	int temp;
	void Noswap(int a,int b){
		temp=a;
		a=b;
		b=temp;
		System.out.println("Before swapping:"+b+" "+a);
		System.out.print("After swapping:"+a+" "+b);
	}
}
public class A1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int t=0;
		Swap sw=new Swap();
		sw.Noswap(x,y);
	}
}