import java.io.*; 
import java.util.*; 

public class BadSubscriptCaught {
	public static void main (String [] args) {
		
		// size of ArrayList 
        //int n = 8; 
		int answer;
		String ans= "y";
  
        //declaring ArrayList with initial size n 
        ArrayList<String> list = new ArrayList<String>(
			
			 Arrays.asList("Mary", 
                          "Daysha", 
                          "John",
						  "Peter",
						  "Nancy",
						  "Ann",
						  "Sonya",
						  "Bonny")); 
  
				
		Scanner inputDevice= new Scanner(System.in);
		
		//while (ans=="y"){
		
			try
			{
			System.out.println("Hello, please type an integer:");
			
			answer =inputDevice.nextInt();
			
			System.out.println(list.get(answer)+" "); 
			}
			catch (IndexOutOfBoundsException e)
			{
				System.out.println("Error: number should be less than 8.");
			}
			// System.out.println("Try agagin?");
			// ans=inputDevice.nextLine();
			// inputDevice.nextLine();
		}
	}
	
	
}