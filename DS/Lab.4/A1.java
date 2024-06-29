import java.util.*;
public class A1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.print("Enter size of array:");
		int n=sc.nextInt();
		int [] a=new int[n];
		int [] b=new int[n+1];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n+1;j++){
				if(j==x){
					b[j]=y;
				}
				else if(j<x){
					b[j]=a[j];
				}
				else if(j>x){
					b[j]=a[j-1];
				}
			}
		for(int j=0;j<n+1;j++){
			System.out.print(b[j]);
		}
	}
}