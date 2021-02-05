package applicationPackage;

public class Videography 
{
	public Videography(String packageType)
	{
		if(packageType.equalsIgnoreCase("Gold"))
		{
			System.out.println("\nVideo: You will get a 1 hour video copy of the wedding.");
			System.out.println("________________________________________________________________________________________________________________________________");
		}
		if(packageType.equalsIgnoreCase("Platinum"))
		{
			System.out.println("\nVideo: You will get a 2 hours video copy of the wedding.");
			System.out.println("________________________________________________________________________________________________________________________________");
		}
	}
}
