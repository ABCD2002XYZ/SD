import java.util.*;

class Bully{
	static int n;
	static boolean[] active;
	
	static void election(int in){
		boolean allgone = true;
		
		//check is we have higher active
		for(int i=in+1;i<=n;i++){
			if(active[i]){
				System.out.println("Election message sent form " + in + " -> " + i);
				allgone = false;
			}
		}
		
		//no higher are active so initializer is leader
		if(allgone){
			System.out.println("Election result declared: " + in + " is the new C0-ordinator");
			return;
		}
		
		//give control to higher
		for(int i=in+1;i<=n;i++){
			if(active[i]){
				election(i);
				return;
			}
		}
		
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number of nodes : ");
		n = sc.nextInt();
		
		active = new boolean[n+1];
		
		//all active at start
		for(int i=1;i<=n;i++){
			active[i] = true;		
		}
		
		while(true){
			int ch;
			System.out.println("1) Make node inactive \n");
			System.out.println("2) Held Re-elections \n");
			System.out.println("3) Exit \n");
			System.out.println("Enter the choice: ");
			ch = sc.nextInt();
			
			if(ch == 1){
				int temp;
				System.out.println("Enter the node you want to make inactive: ");
				temp = sc.nextInt();
				active[temp] = false;
				System.out.println("The node " + temp + " is inactive");
			}
			else if(ch == 2){
				int temp;
				System.out.println("Enter the initalizer: ");
				temp = sc.nextInt();
				
				election(temp);
			}
			else{
				break;
			}
			
		}
			
	}
}
