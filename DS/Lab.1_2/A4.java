import java.util.Scanner;
public class A4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>0;i--){
			fact*=i;
		}
		System.out.print("Factorial of given number:"+fact);
	}
}