import java.util.Scanner;
public class A5{
	static int fact(int num){
		if(num==0){
			return 1;
		}
		else{
			return num*fact(num-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int result=fact(n);
		System.out.print("Factorial of given number:"+result);
	}
}