package weddingEvents;

import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;
import applicationPackage.Videography;

public class HaldiMehendiSangeet 
{
	public HaldiMehendiSangeet(String packageType)
	{
		new Meal(packageType);
		new Games(packageType);
		new Host();
		new Photography("wedding",packageType);
		new Videography(packageType);
	}
}
