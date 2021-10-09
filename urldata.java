import java.util.*;
public class urldata
{
	public static void main(String args[]) throws IOException
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);  
		while (1)
		{
			    System.out.println("ENTER COMMAND:");
			    String urlname = sc.nextLine();		    	
		   
		    	switch (urlname) 
			{
		    		case "storeurl":
		        		String storeurl = sc.nextLine();
				count=count+1;
		          		break;

				case "get":
		    	   	String url1 = sc.nextLine();
                          			System.out.println("short key: %s",url);
         		    		break;

		    		case "count":
		    	   	String url2 = sc.nextLine();
                           			System.out.println("usage count:",count);
				FileReader reader2 = new FileReader("urls.json");
                           			break;
	
		    		case "list":
		 		System.out.println(url);
				JSONParser jsonP3 = new JSONParser();  
				  FileReader reader3 = new FileReader("urls.json");
		                		break;

		    		case "exit":exit();
                             			break;
                   		 }

		}
	}				
}


				