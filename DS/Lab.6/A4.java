import java.util.Scanner;
class Conversion{
	int c;
	int f;
	void fToC(int a,int b){
		c=(f-32)*(5/9);
	}
	void cToF(int a,int b){
		f=c*(9/5)+32;
	}
}
public class A4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of c");
		int a=sc.nextInt();
		System.out.print("Enter value of f");
		int b=sc.nextInt();
	}
}