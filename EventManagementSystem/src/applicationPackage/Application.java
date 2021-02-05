package applicationPackage;
import java.util.Scanner;

import corporateEvents.*;

public class Application 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the event : ");
		String event=sc.next();
		System.out.println("Enter the package that you want to choose (Silver/Gold/Platinum) : ");
		String packg=sc.next();
		Meal m=new Meal(packg);
		Games g=new Games(packg);
		Host h=new Host();
		Photography p = new Photography(event,packg);
		sc.close();
	}
}

