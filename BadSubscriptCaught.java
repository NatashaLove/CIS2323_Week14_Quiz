import java.io.*; 
import java.util.*; 

public class BadSubscriptCaught {
	public static void main (String [] args) {
		
		// size of ArrayList 
        //int n = 8; 
		int answer;
  
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
		
		try
		{
		System.out.println("Hello, please type an integer:");
		
		answer =inputDevice.nextInt();
		
		System.out.print(list.get(answer)+" "); 
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Error: number should be less than 8.");
		}
	}
	
	
}