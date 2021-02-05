package birthdayEvents;

import applicationPackage.Decoration;
import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;

public class SurpriseParties 
{
	public SurpriseParties(String packageType)
	{
		new Decoration("Birthday", packageType);
		new Meal(packageType);
		new Games(packageType);
		new Host();
		new Photography("Birthday",packageType);
	}
}
