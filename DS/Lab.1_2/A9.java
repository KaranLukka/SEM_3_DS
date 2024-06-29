import java.util.Scanner;
public class A9{
	public static void main(String[] args) {
		int h=0;
		int m=0;
		int s=0;
		int ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to convert it into time:");
		int x=sc.nextInt();
		h=x/3600;
		ans=x-(h*3600);
		m=ans/60;
		s=x-(h*3600+m*60);
		System.out.print("Hour:"+h+" Minute:"+m+" Second:"+s);
	}
}