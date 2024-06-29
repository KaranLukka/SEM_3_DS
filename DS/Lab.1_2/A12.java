import java.util.*;
public class A12{
	public static void main(String[] args){
		int y=0,rem=0,ono;
		double res=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check it:");
		int x=sc.nextInt();
		ono=x;
		while(x!=0){
			rem=x%10;
			x/=10;
			y++;
		}
		while(x!=0){
			rem=x%10;
			res+=Math.pow(rem,y);
			x/=10;
		}
		if(ono==res){
			System.out.print("Given number is Armstrong No");
		}
		else{
			System.out.print("Given number is not Armstrong No");
		}
	}
}