package com.ubs.coding;

import java.util.*;
import java.util.stream.Collectors;

public final class Utility {
	
	public Collection<PhoneBook> getPhonebookByLastName(Collection<PhoneBook> items, String lastname) {
		return items.parallelStream().filter(x -> x.getLastName().equals(lastname)).collect(Collectors.toList());
	}

	public PhoneBook getPhonebookByPhoneNumber(Collection<PhoneBook> items, String phoneNumber) {
		return items.parallelStream().filter(x -> x.getPhoneNumber().equals(phoneNumber)).findAny().orElse(null);
	}
}
