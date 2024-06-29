import java.util.*;
public class A5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int x=sc.nextInt();
		int[] a=new int[x];
		int i,count=0;
		for(i=0;i<x;i++){
			System.out.print("Enter element at "+(i+1)+" in array:");
			a[i]=sc.nextInt();
		}
		i--;
		for(i=0;i<x;i++){
			System.out.println("Index "+(i+1)+" Element "+a[i]);
		}
		i--;
		int dup=a[0];
		int j;
		for(j=1;j<x;j++){
			if(dup==a[j]){
				count++;
			}
		}
		if(count==0){
			System.out.print("Array does not contain duplicate entry");
		}
		else{
			System.out.print("Array contain duplicate entry");
		}
	}
}