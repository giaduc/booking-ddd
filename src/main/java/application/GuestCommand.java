package application;

import domain.Gender;

public class GuestCommand {

	private String name;
	private Gender gender;
	private String phone;
	private String email;
	private String city;

	public GuestCommand() {
		super();
	}

	public GuestCommand(String name, Gender gender, String phone, String email, String city) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
