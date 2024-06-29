import java.util.Scanner;
class Employee_Detail{
	int empid;
	String name;
	String designation;
	int salary;
	void Print(){
		System.out.println("Entered employee id:"+empid);
		System.out.println("Entered employee name:"+name);
		System.out.println("Entered employee designation:"+designation);
		System.out.println("Entered employee salary:"+salary);
	}
}
public class A2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee_Detail ed=new Employee_Detail();
		System.out.print("Enter employee id:");
		ed.empid=sc.nextInt();
		System.out.print("Enter employee name:");
		ed.name=sc.next();
		System.out.print("Enter employee designation:");
		ed.designation=sc.next();
		System.out.print("Enter employee salary:");
		ed.salary=sc.nextInt();
		ed.Print();
	}
}