import java.util.*;
public class TokenRing{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of nodes you want in the ring");
		int n = sc.nextInt();
		
		System.out.println("Ring formed is as below: ");
		for(int i = 0; i<n; i++){
			System.out.print(i + " ");
		}
		System.out.println("0");
		
		int choice = 0;
		
		do{
			System.out.println("Enter sender");
			int sender = sc.nextInt();
			
			System.out.println("Enter receiver");
			int receiver = sc.nextInt();
			
			System.out.println("Enter data");
			int data = sc.nextInt();
			
			int token = 0;
			
			for(int i = token; i<sender; i++){
				System.out.println(" "+i+" ->");
			}
			
			System.out.println(" " + sender);
			System.out.println("Sender: " + sender + "Sending data: " + data);
			
			for(int i = sender; i!=receiver; i = (i+1)%n){
				System.out.println("Data: "+ data + " Forwarded by: " + i);
			
			}
			System.out.println("Receiver: "+ receiver + " Received data: " + data);
			
			token = sender;
			
			System.out.println("Do you want to send data again ? Enter 1.yes 2.No");
			choice = sc.nextInt();
			
		}while(choice == 1);
		
	}
}
