import java.util.*;
public class A4{
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
		int max=a[0];
		int min=a[0];
		int j;
		for(j=0;j<x;j++){
			if(max<a[j]){
				max=a[j];
			}
			if(min>a[j]){
				min=a[j];
			}
		}
		System.out.println("Maximum number is:"+max);
		System.out.print("Minimum number is:"+min);
	}
}