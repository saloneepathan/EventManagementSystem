package applicationPackage;

public class Decoration {
	
	Decoration(String eventType, String packageType){
		System.out.println("You have choosen the "+packageType+" package for your "+eventType+" event !!");
		if(packageType.equalsIgnoreCase("Silver")) {
			Silver(eventType);
		}
		else if(packageType.equalsIgnoreCase("Gold")) {
			Gold(eventType);
		}
		else if(packageType.equalsIgnoreCase("Platinum")) {
			Platinum(eventType);
		}
	}
	
	public static void Silver(String eventType) {
		switch(eventType) {
			case "corporate":
				System.out.println("Normal, comfortable chairs to accomodate 200 people. 2 Flower bouquets, 1 table, 1 dais");
				break;
			case "wedding":
				System.out.println("Normal, comfortable chairs to accomodate 350 people, flower decorations(real + false), 2 fancy lights, 1 personalized name cutout(250cm * 100cm)");
				break;
			case "social":
				System.out.println("Decoration with 100 baloons, Normal, comfortable chairs to accomodate 200 people, 2 fancy lights, 1 personalized cutout (250cm * 100cm)");
				break;
			case "kids":
				System.out.println("Decoration with 100 balloons depending upon your color theme. 2 Fancy lights, 1 cartoon cutout, 1 personalized name cutout(250cm * 100cm)");
				break;
			case "birthday":
				System.out.println("Decoration with 100 balloons depending upon your color theme. 2 Fancy lights, 1 cartoon cutout, 1 personalized name cutout(250cm * 100cm)");
				break;
		}
	}
	
	public static void Gold(String eventType) {
		switch(eventType) {
			case "corporate":
				System.out.println("Chairs, with a satin cloth, to accomodate 500 people. 4 Flower bouquets, 2 tables, 1 dais");
				break;
			case "wedding":
				System.out.println("Chairs, with a satin cloth, to accomodate 500 people, flower decorations(real flowers), 5 fancy lights, 2 personalized name cutout(250cm * 100cm)");
				break;
			case "social":
				System.out.println("Decoration with 200 baloons, Chairs, with a satin cloth, to accomodate 200 people, 3 fancy lights, 2 personalized cutout (250cm * 100cm)");
				break;
			case "kids":
				System.out.println("Decoration with 200 balloons depending upon your color theme. 3 Fancy lights, 3 cartoon cutout, 2 personalized name cutout(250cm * 100cm)");
				break;
			case "birthday":
				System.out.println("Decoration with 200 balloons depending upon your color theme. 3 Fancy lights, 3 cartoon cutout, 2 personalized name cutout(250cm * 100cm)");
				break;
		}
		
	}
	
	public static void Platinum(String eventType) {
		switch(eventType) {
			case "corporate":
				System.out.println("Sofa chairs, to accomodate 800 people. Some flower decorations(false flowers), 4 Flower bouquets, 2 tables, 1 dais");
				break;
			case "wedding":
				System.out.println("Chairs, with and ribbons, to accomodate 800 people, flower decorations(real flowers and leaves), 10 fancy lights, 2 personalized name cutout(250cm * 100cm), Flower Showers, Confetti Cannons");
				break;
			case "social":
				System.out.println("Decoration with 300 baloons, Chairs, with a satin cloth and ribbons, to accomodate 500 people, 5 fancy lights, 2 personalized cutout (250cm * 100cm), 1 Large Disco Ball");
				break;
			case "kids":
				System.out.println("Decoration with 300 balloons, and real flowers, depending upon your color theme. 5 Fancy lights, 3 cartoon cutout, 1 Human Cartoon, 2 personalized name cutout(250cm * 100cm)");
				break;
			case "birthday":
				System.out.println("Decoration with 300 balloons, and real flowers, depending upon your color theme. 5 Fancy lights, 3 cartoon cutout, 1 Human Cartoon, 2 personalized name cutout(250cm * 100cm)");
				break;
		}
	}
}
