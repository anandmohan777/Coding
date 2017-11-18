package com.spartez;

import com.google.common.base.Splitter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMapDecoder implements MapDecoder {
	Map<String, String> decodedMap = new LinkedHashMap<>();

	@Override
	public Map<String, String> decode(String s) {
		final Map<String, String> decodedMap = new LinkedHashMap<>();

		if (s == null) {
			return null;
		}else if (s.isEmpty()) {
			return decodedMap;
		}

		final Pattern keyValuePattern = Pattern
		        .compile("(?:[\\w~!`@#$%^*()_+-:;?/>.,<\\[\\]\\s\\}\\{\\|\\']*=[\\w~!`@#$%^*()_+-:;?/>.,<\\[\\]\\s\\}\\{\\|\\']*)(?:&(?:[\\w~!`@#$%^*()_+-:;?/>.,<\\[\\]\\s\\}\\{\\|\\']*=[\\w~!`@#$%^*()_+-:;?/>.,<\\[\\]\\s\\}\\{\\|\\']*))*");
		final Matcher matcher = keyValuePattern.matcher(s);
		if (!matcher.matches()) {
			throw new IllegalArgumentException();
		}

		final String pairs[] = s.split("&");
		for (String keyValue : pairs) {
			final String value[] = keyValue.split("=");
			if (value.length == 2) {
				decodedMap.put(value[0], value[1]);
			} else if (value.length == 1) {
				decodedMap.put(value[0], "");
			} else {
				decodedMap.put("", "");
			}
		}
		return decodedMap;
	}

	public static void main(String[] args) {
		MapDecoder m = new MyMapDecoder();
		System.out.println(m.decode("hh=99"));
	}

}
