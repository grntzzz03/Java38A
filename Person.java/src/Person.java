import java.util.Arrays;

public class Person {
	
	private String nameA;
	private String nationalityA;
	private String dateOfBirthA;
	private String[] passport;
	private int seatNumberA;
	
	//Getters
	public String getNameA() {
		return nameA;
	}
	public String getNationalityA() {
		return nationalityA;
	}
	public String getDateOfBirthA() {
		return dateOfBirthA;	
	}
	public int getSeatNumberA() {
		return seatNumberA;
	}
	
	//Setters
	public void setNameA(String newNameA) {
		this.nameA = newNameA;
	}
	public void setNationalityA(String newNationalityA) {
		this.nationalityA = newNationalityA;
	}
	public void setDateOfBirthA(String newDateOfBirthA) {
		this.dateOfBirthA = newDateOfBirthA;
	}
	public void setSeatNumberA(int newSeatNumberA) {
		this.seatNumberA = newSeatNumberA;
	}
	
	//Constructor
	public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
		nameA = name;
		nationalityA = nationality;
		dateOfBirthA = dateOfBirth;
		seatNumberA = seatNumber;
	}
	
	public static boolean applyPassport(){
		int number = (int) (Math.random() * 2);
		return number==1?true:false;
	}
	
	static int chooseSeat(){
		int number = (int) (Math.random() * 11 + 1);
		return number;
	}
	
	//Main method
	public static void main(String[] args) {
		
		//First Person
		Person person = new Person("Grant Esteban", "Filipino", "12/29/1997", 5);
		person.setSeatNumberA(chooseSeat());
		
		//Output of First Person
		System.out.println("Name: " + person.getNameA() + "\n" + "Nationality: " + person.getNationalityA() + "\n"
				+ "Date of Birth: " + person.getDateOfBirthA() + "\n" + "Seat Number: " + person.getSeatNumberA() + "\n");
		
		if(applyPassport() == true) {
			System.out.println("Congratulations " + person.getNameA() + "! Your passport was approved!");
		}else {
			System.out.println("We are sorry " + person.getNameA() + ". We can't process your application.");
		}
		
	}

}
