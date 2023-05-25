package dev.saintho.pawwow.common.utils;

import java.util.regex.Pattern;

public class EmailValidator {
	private final static Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

	public static void validate(String email) {
		if (email == null || !pattern.matcher(email).matches())  {
			throw new IllegalArgumentException(
				"Vote Email can't be not null, should have a string in a email address format");
		}
	}
}
