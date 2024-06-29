import java.util.*;
public class A3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int x=sc.nextInt();
		int[] a=new int[x];
		int i,sum=0;
		float avg=0;
		for(i=0;i<x;i++){
			System.out.print("Enter element at "+(i+1)+" in array:");
			a[i]=sc.nextInt();
		}
		i--;
		System.out.print("Enter an index to clculate average upto it:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++){
			sum+=a[i-1];
			avg=sum/n;
		}
		i--;
		System.out.print("Average is:"+avg);
	}
}