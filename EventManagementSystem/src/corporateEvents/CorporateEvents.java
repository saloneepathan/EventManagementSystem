package corporateEvents;

public class CorporateEvents {
	void budget(char packageType)
	{
		if(packageType == 's' || packageType == 'S')
		{
			System.out.println("You have chosen the Silver package. You budget is 15k.");
		}
		else if(packageType == 'g' || packageType == 'G')
		{
			System.out.println("You have chosen the Gold package. You budget is 25k.");
		}
		if(packageType == 'p' || packageType == 'P')
		{
			System.out.println("You have chosen the Platinum package. You budget is 35k.");
		}
	}

}
