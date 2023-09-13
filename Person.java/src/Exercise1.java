
public class Exercise1 {

	public static void main(String[] args) {
		int day;
		String day1, day2, day3, day4, day5, day6, day7, day8, day9, day10, day11, day12;
		day1 = "A partridge in a Pear Tree/n";
		day2 = "2 Turtle doves\n";
		day3 = "3 French Hens\n";
		day4 = "4 Calling Birds\n";
		day5 = "5 Golden Rings/n";
		day6 = "6 Geese a Laying/n";
		day7 = "7 Swans a Swimming/n";
		day8 = "8 Maids a Milking/n";
		day9 = "9 Ladies Dancing";
		day10 = "10 Lords a Leaping/n";
		day11 = "11 Pipers Piping/n";
		day12 = "12 Drummers Drumming/n";
		
		for(day = 1; day <= 12; day++) {
			switch (day) {
				case 1: 
					System.out.println("On the first day of Christmas my true love sent to me:");
					break;
				case 2: 
					System.out.println("On the second day of Christmas my true love sent to me:");
					break;
				case 3: 
					System.out.println("On the third day of Christmas my true love sent to me:");
					break;
				case 4: 
					System.out.println("On the fourth day of Christmas my true love sent to me:");
					break;
				case 5: 
					System.out.println("On the fifth day of Christmas my true love sent to me:");
					break;
				case 6:  
					System.out.println("On the sixth day of Christmas my true love sent to me:");
					break;
				case 7: 
					System.out.println("On the seventh day of Christmas my true love sent to me:");
					break;
				case 8: 
					System.out.println("On the eight day of Christmas my true love sent to me:");
					break;
				case 9: 
					System.out.println("On the ninth day of Christmas my true love sent to me:");
					break;
				case 10: 
					System.out.println("On the tenth day of Christmas my true love sent to me:");
					break;
				case 11: 
					System.out.println("On the eleventh day of Christmas my true love sent to me:");
					break;
				case 12: 
					System.out.println("On the thwelfth day of Christmas my true love sent to me:");
					break;
				default:
			}
			switch (day) {
			case 1: 
				System.out.println(day1);
				break;
			case 2: 
				System.out.println(day2 + "and" + day1 + "\n");
				break;
			case 3: 
				System.out.println(day3 + day2 + "and" + day1 + "\n");
				break;
			case 4: 
				System.out.println(day4 + day3 + day2 + "and" + day1 + "\n");
				break;
			case 5: 
				System.out.println(day5 + day4 + day3 + day2 + "and" + day1 + "\n");
				break;
			case 6:  
				System.out.println(day6 + day5 + day4 + day3 + day2 + "and" + day1 + "\n");
				break;
			case 7: 
				System.out.println(day7 + day6 + day5 + day4 + day3 + day2 + "and" + day1 + "\n");
				break;
			case 8: 
				System.out.println(day8 + day7 + day6 + day5 + day4 + day3 + day2 + "and" + day1 + "\n");
				break;
			case 9: 
				System.out.println(day9 + day8 + day7 + day6 + day5 + day4 + day3 + day2 + "and" + day1 + "\n");
				break;
			case 10: 
				System.out.println(day10 + day9 + day8 + day7 + day6 + day5 + day4 + day3 + day2 + "and" + day1 + "\n");
				break;
			case 11: 
				System.out.println(day11 + day10 + day9 + day8 + day7 + day6 + day5 + day4 + day3 + day2 + "and" + day1 + "\n");
				break;
			case 12: 
				System.out.println(day12 + day11 + day10 + day9 + day8 + day7 + day6 + day5 + day4 + day3 + day2 + "and" + day1 + "\n");
				break;
			default:
			}
		}
		
	}

}
