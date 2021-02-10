package switchcase;

public class Day {
	public static void main(String[] args) {
		String day="Mon";
		
		switch(day)
		{
			case "Mon":
					System.out.println("Monday");
					break;
			case "Thu":
					System.out.println("Thusday");
					break;
			case "Wed":
					System.out.println("Wednesday");
					break;
			case "Thur":
					System.out.println("Thursday");
					break;
			case "Fri":
					System.out.println("Friday");
					break;
			case "Sat":
					System.out.println("Saturday");
					break;
			case "Sun":
					System.out.println("sunday");
					break;
			default:
					System.out.println("Other day");
		}
	}
}
