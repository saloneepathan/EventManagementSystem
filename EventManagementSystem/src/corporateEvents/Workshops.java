package corporateEvents;

import applicationPackage.Decoration;
import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;

public class Workshops 
{
	public Workshops(String packageType)
	{
		new Decoration("Corporate", packageType);
		new Meal(packageType);
		new Games(packageType);
		new Host();
		new Photography("Corporate",packageType);
	}
}
