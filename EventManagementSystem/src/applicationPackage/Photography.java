package applicationPackage;

public class Photography 
{
	Photography(String eventType, String packageType)
	{
		if(packageType == "Silver")
		{
			Silver(eventType);
		}
		else if(packageType == "Gold")
		{
			Gold(eventType);
		}
		else if(packageType == "Platinum")
		{
			Platinum(eventType);
		}
	}
	public static void Silver(String eventType) 
	{
		switch(eventType) 
		{
			case "corporate":
				System.out.println("Photos: You will get 50 photo copies of the event.");
				break;
			case "wedding":
				System.out.println("Photos: You will get 200 photo copies of the event.");
				break;
			case "social":
				System.out.println("Photos: You will get 50 photo copies of the event.");
				break;
			case "kids":
				System.out.println("Photos: You will get 50 photo copies of the event.");
				break;
			case "birthday":
				System.out.println("Photos: You will get 50 photo copies of the event.");
				break;
		}
	}
	public static void Gold(String eventType) 
	{
		switch(eventType) 
		{
			case "corporate":
				System.out.println("Photos: You will get 100 photo copies of the event.");
				break;
			case "wedding":
				System.out.println("Photos: You will get 250 photo copies of the event.");
				break;
			case "social":
				System.out.println("Photos: You will get 100 photo copies of the event.");
				break;
			case "kids":
				System.out.println("Photos: You will get 100 photo copies of the event.");
				break;
			case "birthday":
				System.out.println("Photos: You will get 100 photo copies of the event.");
				break;
		}
	}
	public static void Platinum(String eventType) 
	{
		switch(eventType) 
		{
			case "corporate":
				System.out.println("Photos: You will get 200 photo copies of the event.");
				break;
			case "wedding":
				System.out.println("Photos: You will get 500 photo copies of the event.");
				break;
			case "social":
				System.out.println("Photos: You will get 300 photo copies of the event.");
				break;
			case "kids":
				System.out.println("Photos: You will get 500 photo copies of the event.");
				break;
			case "birthday":
				System.out.println("Photos: You will get 500 photo copies of the event.");
				break;
		}
	}
}
