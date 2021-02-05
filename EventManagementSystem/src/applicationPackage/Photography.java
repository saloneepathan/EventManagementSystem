package applicationPackage;

public class Photography 
{
	public Photography(String eventType, String packageType)
	{
		if(packageType.equalsIgnoreCase("Silver"))
		{
			Silver(eventType);
		}
		else if(packageType.equalsIgnoreCase("Gold"))
		{
			Gold(eventType);
		}
		else if(packageType.equalsIgnoreCase("Platinum"))
		{
			Platinum(eventType);
		}
	}
	public static void Silver(String eventType) 
	{
		switch(eventType) 
		{
			case "corporate":
				System.out.println("\nPhotos: You will get 50 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "wedding":
				System.out.println("\nPhotos: You will get 200 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "social":
				System.out.println("\nPhotos: You will get 50 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "kids":
				System.out.println("\nPhotos: You will get 50 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "birthday":
				System.out.println("\nPhotos: You will get 50 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
		}
	}
	public static void Gold(String eventType) 
	{
		switch(eventType) 
		{
			case "corporate":
				System.out.println("\nPhotos: You will get 100 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "wedding":
				System.out.println("\nPhotos: You will get 250 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "social":
				System.out.println("\nPhotos: You will get 100 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "kids":
				System.out.println("\nPhotos: You will get 100 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "birthday":
				System.out.println("\nPhotos: You will get 100 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
		}
	}
	public static void Platinum(String eventType) 
	{
		switch(eventType) 
		{
			case "corporate":
				System.out.println("\nPhotos: You will get 200 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "wedding":
				System.out.println("\nPhotos: You will get 500 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "social":
				System.out.println("\nPhotos: You will get 300 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "kids":
				System.out.println("\nPhotos: You will get 500 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
			case "birthday":
				System.out.println("\nPhotos: You will get 500 photo copies of the event.");
				System.out.println("________________________________________________________________________________________________________________________________");
				break;
		}
	}
}
