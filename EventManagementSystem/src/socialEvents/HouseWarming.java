package socialEvents;

import applicationPackage.Decoration;
import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;

public class HouseWarming 
{
	public HouseWarming(String packageType)
	{
		new Decoration("Social", packageType);
		new Meal(packageType);
		new Games(packageType);
		new Host();
		new Photography("Social",packageType);
	}
}
