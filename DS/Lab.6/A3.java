import java.util.Scanner;
class Student_Detail{
	int eno;
	String name;
	int sem;
	float spi;
}
public class A3{
	public static void main(String[] args){ 
		Student_Detail[] sd=new Student_Detail[2];
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=2;i++){
			sd[i-1]=new Student_Detail();
			System.out.print("Enter enrollment no of "+i+" student:");
			sd[i-1].eno=sc.nextInt();
			System.out.print("Enter name of "+i+" student:");
			sd[i-1].name=sc.next();
			System.out.print("Enter sem of "+i+" student:");
			sd[i-1].sem=sc.nextInt();
			System.out.print("Enter spi of "+i+" student:");
			sd[i-1].spi=sc.nextFloat();
		}
		for(int i=1;i<=2;i++){
			System.out.println("Entered enrollment no of "+i+" student:"+sd[i-1].eno);
			System.out.println("Entered name of "+i+" student:"+sd[i-1].name);
			System.out.println("Entered sem of "+i+" student:"+sd[i-1].sem);
			System.out.println("Entered spi of "+i+" student:"+sd[i-1].spi);
		}
	}
}