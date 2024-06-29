import java.util.Scanner;
public class A1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][] a=new int[2][2];
		int [][] b=new int[2][2];
		int [][] c=new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print("Enter element at "+i+" "+j+" in array a:");
				a[i][j]=sc.nextInt();
				System.out.print("Enter element at "+i+" "+j+" in array b:");
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.print('\n');
		}
	}
}