import java.util.Scanner;
public class A1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of radius:");
		int n=sc.nextInt();
		double area=3.14*n*n;
		System.out.print("Area of circle with given radius:"+area);
	}
}