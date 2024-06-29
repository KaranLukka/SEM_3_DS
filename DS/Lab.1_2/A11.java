import java.util.Scanner;
public class A11{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to make sum upto it:");
		int x=sc.nextInt();
		int sum=0;
		for(int i=1;i<=x;i++){
			for(int j=1;j<=i;j++){
				sum+=j;
			}
		}
		System.out.print("Sum upto given digits:"+sum);
	}
}