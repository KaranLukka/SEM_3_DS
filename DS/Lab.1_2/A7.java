import java.util.Scanner;
public class A7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int x=sc.nextInt();
		System.out.println("It's factors are:");
		for(int i=1;i<=x;i++){
			if(x%i==0){
				System.out.print(i+"\n");
			}
		}
	}
}