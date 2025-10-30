package day1030;

public class Profile {
	private String name;
	private String phone;
	private String address;

	public Profile(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Profile { 이름: " + name + ", 전화번호: " + phone + ", 주소: " + address + " }";
	}
}
