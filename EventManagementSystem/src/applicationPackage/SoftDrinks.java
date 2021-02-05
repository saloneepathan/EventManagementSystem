package applicationPackage;

public class SoftDrinks{ 

	SoftDrinks(String eventType, String packageType){
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
	
	public static void Silver(String eventType) {
		switch(eventType) 
		{
			case "corporate":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "wedding":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
			case "social":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "kids":
				System.out.println("SOFT DRINKS : You will be offered with Maza and Appy for refreshment.");
				break;
			case "birthday":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
		}
	}
	public static void Gold(String eventType) 
	{
		switch(eventType) 
		{
			case "corporate":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "wedding":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
			case "social":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "kids":
				System.out.println("SOFT DRINKS : You will be offered with Maza and Appy for refreshment.");
				break;
			case "birthday":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
		}
	}
	public static void Platinum(String eventType) 
	{
		switch(eventType) 
		{
			case "corporate":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
			case "wedding":
				System.out.println("SOFT DRINKS : You will be offered with Sprite, Pepsi and Appy for refreshment.");
				break;
			case "social":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "kids":
				System.out.println("SOFT DRINKS : You will be offered with Maza and Appy for refreshment.");
				break;
			case "birthday":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
		}
	}
}
