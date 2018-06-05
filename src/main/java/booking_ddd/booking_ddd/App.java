package booking_ddd.booking_ddd;

import domain.Gender;
import domain.Guest;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Guest guest = new Guest("guest", Gender.MALE, "1024540345", "guest@gmail.com", "city");
		System.out.println(guest.getGender());
	}
}
