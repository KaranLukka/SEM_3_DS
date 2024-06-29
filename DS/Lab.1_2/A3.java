import java.util.Scanner;
public class A3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character:");
		String ch=sc.nextLine();
		if(ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U")){
			System.out.print("Entered character is vowel");
		}
		else{
			System.out.print("Enterd character is consonant");
		}
	}
}