package weddingEvents;

import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;
import applicationPackage.Videography;

public class Engagement 
{
	public Engagement(String packageType)
	{
		new Meal(packageType);
		new Games(packageType);
		new Host();
		new Photography("wedding",packageType);
		new Videography(packageType);
	}
}
