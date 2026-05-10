import java.rmi.*;
import java.util.Scanner;

public class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			String serverURL = "rmi://localhost/Server";
			Serverintf serverintf = (Serverintf) Naming.lookup(serverURL);
			
			System.out.print("Enter First number");
			double num1 = sc.nextDouble();
			
			System.out.print("Enter Second number");
			double num2 = sc.nextDouble();
			
			System.out.println("First number: " + num1);
			System.out.println("Second number: " + num2);
			
			System.out.println("-------------------Results------------------------");
			System.out.println("Addition: "+ serverintf.addition(num1,num2));
			System.out.println("Substraction: "+ serverintf.substraction(num1,num2));
			System.out.println("Multiplication: "+ serverintf.multiplication(num1,num2));
			System.out.println("Division: "+ serverintf.division(num1,num2));
			
		}catch(Exception e){
			System.out.println("Exception occured at Client:" + e.getMessage());
		}
	}
}
