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
		new Meal(packg);
		new Games(packg);
		new Host();
		new Decoration(event,packg);
	}
}
