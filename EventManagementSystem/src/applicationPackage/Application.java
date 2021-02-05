package applicationPackage;
import java.util.Scanner;

import weddingEvents.*;
public class Application 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the event type: ");
		String eventType = sc.next();
		System.out.println("Enter the event name: ");
		String event = sc.next();
		System.out.println("Enter the package that you want to choose (Silver/Gold/Platinum) : ");
		String packg=sc.next();
		if(eventType.equalsIgnoreCase("wedding")) 
		{	
			if(event.equalsIgnoreCase("Engagement"))
			{
				new Engagement(packg);
			}
			else if(event.equalsIgnoreCase("Haldi") || event.equalsIgnoreCase("Mehendi") || event.equalsIgnoreCase("Sangeet"))
			{
				new HaldiMehendiSangeet(packg);
			}
			else if(event.equalsIgnoreCase("Wedding"))
			{
				new Wedding(packg);
			}
			else if(event.equalsIgnoreCase("Reception"))
			{
				new Reception(packg);
			}
		}
		sc.close();
	}
}

