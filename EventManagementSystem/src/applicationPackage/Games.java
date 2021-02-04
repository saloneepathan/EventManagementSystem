package applicationPackage;

public class Games {
	Games(String str){
		if(str.equalsIgnoreCase("Silver")){
		      System.out.println("\nYou are offered 3 games in this package!!");
		}
		else if(str.equalsIgnoreCase("Gold")){
		      System.out.println("\nYou are offered 5 games in this package!!");
		}
		else if(str.equalsIgnoreCase("Platinum")){
		      System.out.println("\nYou are offered 7 games in this package!!");
		}
	}
}

