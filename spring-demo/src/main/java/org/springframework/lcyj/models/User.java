package org.springframework.lcyj.models;

public class User {
	private Long id;
	private String userName;
	private Address address;

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", address=" + address +
				'}';
	}
}
