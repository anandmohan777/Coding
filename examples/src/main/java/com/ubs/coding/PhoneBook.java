package com.ubs.coding;

/**
 * Phonebook entity to store the username, lastname.
 * 
 * @author anandmohan
 *
 */
public class PhoneBook {

	private String userName;
	private String lastName;
	private String phoneNumber;

	public PhoneBook(String userName, String lastName, String phoneNumber) {
		this.userName = userName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		return this.phoneNumber.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PhoneBook phoneBook = (PhoneBook) obj;
		if (this.phoneNumber.equals(phoneBook.getPhoneNumber())) {
			return true;
		} else
			return false;
	}

}
