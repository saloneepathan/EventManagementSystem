package weddingEvents;

import applicationPackage.*;

public class Reception 
{
	public Reception(String packageType)
	{
		new Decoration("wedding", packageType);
		new Meal(packageType);
		new Games(packageType);
		new Host();
		new Photography("wedding",packageType);
		new Videography(packageType);
	}
}
