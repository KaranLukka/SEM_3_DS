import java.util.*;
public class A2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int x=sc.nextInt();
		int[] a=new int[x];
		int i;
		for(i=0;i<x;i++){
			System.out.print("Enter element at "+(i+1)+" in array:");
			a[i]=sc.nextInt();
		}
		i--;
		for(i=0;i<x;i++){
			System.out.println("Index "+(i+1)+" Element "+a[i]);
		}
		i--;
		System.out.print("Enter starting index value of array in m(MUST BE LESS THAN n):");
		int m=sc.nextInt();
		System.out.print("Enter ending index value of array in n(MUST BE LESS THAN x):");
		int n=sc.nextInt();
		int sum=0;
		for(i=m-1;i<=n-1;i++){
			sum+=a[i];
		}
		System.out.print(sum);
	}
}