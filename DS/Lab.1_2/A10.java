import java.util.Scanner;
public class A10{
	public static void main(String[] args) {
		int y=0;
		int w=0;
		int d=0;
		int ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to convert it into year and week:");
		int x=sc.nextInt();
		y=x/365;
		ans=x-(y*365);
		w=ans/7;
		d=x-(y*365+w*7);
		System.out.print("Year:"+y+" Week:"+w+" Day:"+d);
	}
}