package com.string;

import java.util.HashMap;
import java.util.Map;

public class Count {

	private final Map<String, Integer> counter = new HashMap<>();

	public void add(final String key, final int count) {

		Integer prev = counter.get(key);
		if (prev == null) {
			prev = 0;
		}

		counter.put(key, prev + count);
	}

	public int sum() {
		return 0;
	}
}