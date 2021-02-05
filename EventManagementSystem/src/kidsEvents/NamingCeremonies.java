package kidsEvents;

import applicationPackage.Decoration;
import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;

public class NamingCeremonies 
{
	public NamingCeremonies(String packageType)
	{
		new Decoration("Kids", packageType);
		new Meal(packageType);
		new Games(packageType);
		new Host();
		new Photography("Kids",packageType);
	}
}
