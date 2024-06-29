import java.util.Scanner;
public class A8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int x=sc.nextInt();
		int count=0;
		for(int i=2;i<x;i++){
			if(x%i==0){
				count++;
			}
		}
		if(count==0){
			System.out.print("Number is prime");
		}
		else{
			System.out.print("Number is not prime");
		}
	}
}