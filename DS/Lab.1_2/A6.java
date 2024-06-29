import java.util.Scanner;
public class A6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base value:");
		int x=sc.nextInt();
		System.out.print("Enter power:");
		int y=sc.nextInt();
		int sum=1;
		for(int i=1;i<=y;i++){
			sum*=x;
		}
		System.out.print("Ans is:"+sum);
	}
}