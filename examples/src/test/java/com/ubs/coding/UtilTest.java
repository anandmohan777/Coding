package com.ubs.coding;

import java.util.ArrayList;
import java.util.Collection;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UtilTest {

	private String searchCriteria;
	private Collection<PhoneBook> data;
	private Utility util;
	private PhoneBook output;
	private Collection<PhoneBook> outputList;

	@BeforeTest
	public void setup() {
		data = new ArrayList<>();
		util = new Utility();
		givenDataList();
	}

	@Test
	public void testGetPhonebookByLastName() {
		givenInput();
		whenGetPhonebookByLastNameCalled();
		thenVerifyPhonebookByLastName();
	}

	@Test
	public void testGetPhonebookByPhoneNumber() {
		givenInputPhoneNumer();
		whenGetPhonebookByPhoneNumberCalled();
		thenVerifyPhonebookByLastName();
	}

	private void givenInput() {
		searchCriteria = "l3";
	}

	private void givenInputPhoneNumer() {
		searchCriteria = "1234563";
	}

	private void givenDataList() {
		data.add(new PhoneBook("a1", "l1", "1234561"));
		data.add(new PhoneBook("a2", "l2", "1234562"));
		data.add(new PhoneBook("a3", "l3", "1234563"));
		data.add(new PhoneBook("a4", "l4", "1234564"));
	}

	private void whenGetPhonebookByLastNameCalled() {
		outputList = util.getPhonebookByLastName(data, searchCriteria);
	}

	private void whenGetPhonebookByPhoneNumberCalled() {
		output = util.getPhonebookByPhoneNumber(data, searchCriteria);
	}

	private void thenVerifyPhonebookByLastName() {
		assertEquals(output.getLastName(), "l3");
		assertEquals(output.getPhoneNumber(), "1234563");
		assertEquals(output.getUserName(), "a3");
	}

}