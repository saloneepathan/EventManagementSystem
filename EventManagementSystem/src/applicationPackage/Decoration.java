 package applicationPackage;

public class Decoration {
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
		
	}
	public static void Platinum(String eventType) {
		
	}
}
