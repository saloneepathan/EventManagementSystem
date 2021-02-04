package applicationPackage;
import java.util.Scanner;

import corporateEvents.*;

public class Application 
{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the event : ");
		String event=sc.next();
		System.out.println("Enter the package that you want to choose (Silver/Gold/Platinum) : ");
		String packg=sc.next();
		switch(packg) {
			case "silver":
				Meal m=new Meal(packg);
				Games g=new Games(packg);
				Host h=new Host();
				break;
			case "gold":
				Meal m2=new Meal(packg);
				Games g2=new Games(packg);
				Host h2=new Host();
				break;
			case "platinum":
				Meal m3=new Meal(packg);
				Games g3=new Games(packg);
				Host h3=new Host();
				break;
			
		}
	}
}
